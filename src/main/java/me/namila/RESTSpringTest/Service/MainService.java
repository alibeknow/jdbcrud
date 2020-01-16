package me.namila.RESTSpringTest.Service;

import me.namila.RESTSpringTest.Exception.ResourceNotFoundException;
import me.namila.RESTSpringTest.Model.AbstractEntity;
import me.namila.RESTSpringTest.dto.PageDto;
import me.namila.RESTSpringTest.dto.PaginateDto;

import java.util.List;

public interface MainService<T extends AbstractEntity>
{

	List<T> all();

	Boolean exists(long id);

	T add( T o ) throws  ResourceNotFoundException;

	T update( T o, long id ) throws ResourceNotFoundException;

	T getById( long id ) throws ResourceNotFoundException;

	void deleteById( long id ) throws ResourceNotFoundException;

	PageDto findAll(PaginateDto paginate);
}

