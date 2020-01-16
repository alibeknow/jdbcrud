package me.namila.RESTSpringTest.criteria;

import me.namila.RESTSpringTest.dto.PageDto;
import me.namila.RESTSpringTest.dto.PaginateDto;

public interface Builder<T> {

    Class<T> getType();

    PageDto findAll(PaginateDto paginate);

}