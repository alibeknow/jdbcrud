package me.namila.RESTSpringTest.Service;

import me.namila.RESTSpringTest.Exception.ResourceNotFoundException;
import me.namila.RESTSpringTest.Model.AbstractEntity;
import me.namila.RESTSpringTest.Repository.MainRepository;
import me.namila.RESTSpringTest.criteria.AbstractBuilder;
import me.namila.RESTSpringTest.dto.PageDto;
import me.namila.RESTSpringTest.dto.PaginateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Pageable;

import javax.annotation.Resource;
import java.util.List;

@ComponentScan("me.namila.RESTSpringTest")
public class AbstractService  <E extends AbstractEntity, R extends MainRepository<E>>  implements MainService<E> {
    protected final R repository;
    protected String code;


    @Autowired
    @Resource
    AbstractBuilder<E> abstractBuilder;

    @Autowired
    public AbstractService(R repository) {
        this.repository = repository;
        this.code = null;
    }

    @Override
    public Boolean exists(long id) {
        return repository.existsById(id);
    }

    @Override
    public E getById(long id) {
        return repository.findById(id).get();
    }


    public List<E> getAll(Pageable pageable )
    {
        return (List<E>) repository.findAll();
    }

    @Override
    public List<E> all() {
        return (List<E>) repository.findAll();
    }

    @Override
    public E add(E item) throws ResourceNotFoundException {
        return repository.save(item);
    }
    @Override
    public E update(E item,long id) throws ResourceNotFoundException {
        item.setId(id);
        return repository.save(item);
    }

    @Override
    public void deleteById(long id) throws ResourceNotFoundException {
          repository.deleteById(id);
    }

    @Override
    public PageDto findAll(PaginateDto paginate)
    {
        return abstractBuilder.findAll(paginate);
    }


}
