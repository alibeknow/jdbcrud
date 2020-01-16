package me.namila.RESTSpringTest.Controller;

import me.namila.RESTSpringTest.Model.AbstractEntity;
import me.namila.RESTSpringTest.Results.ResponseWrapper;
import me.namila.RESTSpringTest.dto.PaginateDto;

public interface CommonController<E extends AbstractEntity> {
    /**
     * Вывод информаций по записи
     * @param id идентификатор записи
     * @return ResponseHelper
     */
    ResponseWrapper<E> getById(Long id);

    /**
     * Создание записи
     * @param entity обьект записи
     * @return ResponseHelper
     */
    ResponseWrapper<E> create(E entity);

    /**
     * Удаление записи
     * @param id идентификатор записи
     * @return ResponseHelper
     */
    ResponseWrapper<E> delete(Long id);

    /**
     * Редактированеи записи
     * @param entity обьект записи
     * @return ResponseHelper
     */
    ResponseWrapper<E> update(Long id, E entity);

    /**
     * Получение всех записей
     * @param PaginateDto обьект записи
     * @return ResponseHelper
     */
    ResponseWrapper<E> findAll(PaginateDto paginate);

}
