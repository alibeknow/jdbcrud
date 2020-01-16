package me.namila.RESTSpringTest.Service;


import me.namila.RESTSpringTest.Model.Leaders;
import me.namila.RESTSpringTest.Repository.LeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LeaderServiceImp extends  AbstractService<Leaders,LeaderRepository> {

	@Autowired
	private LeaderRepository repository;

public LeaderServiceImp(LeaderRepository repository)
{
	super(repository);
	this.repository=repository;
}


}
