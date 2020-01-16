package me.namila.RESTSpringTest.criteria;



import me.namila.RESTSpringTest.dto.FilteredDto;
import me.namila.RESTSpringTest.dto.PageDto;
import me.namila.RESTSpringTest.dto.PaginateDto;
import me.namila.RESTSpringTest.dto.SortedDto;
import org.springframework.context.annotation.Bean;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;


abstract public class AbstractBuilder<E> implements Builder<E> {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Class<E> getType() {
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        return (Class<E>) type.getActualTypeArguments()[0];
    }

    public List<Predicate> getPredicates(Root<E> from, CriteriaBuilder cb, List<FilteredDto> filtered) {
        List<Predicate> predicates = new ArrayList<Predicate>();
        if (filtered != null && filtered.size() > 0) {
            for (FilteredDto item : filtered) {
                String value = item.getValue();
                String key = item.getId();
                try {
                    String type = from.get(key).getJavaType().getName();
                    if (type != null) {
                        if (type.contains("Long") || type.contains("Number") || type.contains("Boolean")) {
                            predicates.add(cb.equal(from.get(key), value));
                        } else {
                            predicates.add(cb.like(cb.upper(from.get(key)), "%"+value.toUpperCase()+ "%"));
                        }
                    }
                } catch (IllegalArgumentException ee) {
                }
            }
        }
        return predicates;
    }

    public List<Order> getSorted(Root<E> from, CriteriaBuilder cb, List<SortedDto> sorted) {
        List<Order> orderList = new ArrayList();
        if (sorted != null && sorted.size() > 0) {
            for (SortedDto item : sorted) {
                Boolean desc = item.getDesc();
                String key = item.getId();
                try {
                    if (!desc) {
                        orderList.add(cb.asc(from.get(key)));
                    } else {
                        orderList.add(cb.desc(from.get(key)));
                    }
                } catch (IllegalArgumentException ee) {
                }
            }
        }
        return orderList;
    }

    public PageDto list(PaginateDto paginate, Long count, TypedQuery<E> typedQuery) {
        // paginate
        int page = paginate.getPage();
        int pageSize = paginate.getPageSize();

        typedQuery.setFirstResult((page - 1) * pageSize);
        typedQuery.setMaxResults(pageSize);

        List<E> results = typedQuery.getResultList();

        Double pageCount = Math.ceil(count.doubleValue() / pageSize);
        PageDto pageDto = new PageDto(pageCount.longValue(), results);
        return pageDto;
    }

    @Override
    public PageDto findAll(PaginateDto paginate) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        // data count query
        CriteriaQuery<Long> countQuery = cb.createQuery(Long.class);
        Root<E> fromCount = countQuery.from(getType());
        // data query
        CriteriaQuery<E> criteriaQuery = cb.createQuery(getType());
        Root<E> from = criteriaQuery.from(getType());

        List<Predicate> predicates = getPredicates(from, cb, paginate.getFiltered());

        countQuery.where(cb.and(predicates.toArray(new Predicate[predicates.size()])));
        criteriaQuery.where(cb.and(predicates.toArray(new Predicate[predicates.size()])));

        List<Order> orderList = getSorted(from, cb, paginate.getSorted());

        CriteriaQuery<E> select = criteriaQuery.select(from).orderBy(orderList);
        TypedQuery<E> typedQuery = entityManager.createQuery(select);

        // for data count query
        countQuery.select(cb.count(fromCount)).orderBy(orderList);
        Long count = entityManager.createQuery(countQuery).getSingleResult();

        return list(paginate, count, typedQuery);
    }



}