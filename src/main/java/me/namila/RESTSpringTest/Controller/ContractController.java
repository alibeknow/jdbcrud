package me.namila.RESTSpringTest.Controller;

import me.namila.RESTSpringTest.Model.Contract;
import me.namila.RESTSpringTest.Service.ContractServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@Validated
@RestController
@RequestMapping("/api/v1/contract")
public class ContractController  extends AbstractController<Contract, ContractServiceImp>
{
	@Autowired
	private ContractServiceImp contractService;
	public ContractController(ContractServiceImp service)
	{
		super(service);
	}

}
