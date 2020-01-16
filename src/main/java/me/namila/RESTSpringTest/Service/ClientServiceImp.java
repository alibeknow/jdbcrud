package me.namila.RESTSpringTest.Service;


import me.namila.RESTSpringTest.Model.Client;
import me.namila.RESTSpringTest.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ClientServiceImp extends AbstractService<Client,ClientRepository>
{
@Autowired
	ClientRepository repository;

public ClientServiceImp(ClientRepository repository)
{
	super(repository);
	this.repository=repository;
}
}
