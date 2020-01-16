package me.namila.RESTSpringTest.Repository;


import me.namila.RESTSpringTest.Model.AbstractEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface MainRepository<E extends AbstractEntity> extends CrudRepository<E, Long> {
}
