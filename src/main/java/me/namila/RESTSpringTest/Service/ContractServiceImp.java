package me.namila.RESTSpringTest.Service;

import me.namila.RESTSpringTest.Model.Contract;
import me.namila.RESTSpringTest.Repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractServiceImp extends AbstractService<Contract,ContractRepository> {

	@Autowired
	ContractRepository repository;

	public ContractServiceImp(ContractRepository repository)
	{
		super(repository);
		this.repository=repository;
	}

}
