package me.namila.RESTSpringTest.Controller;

import me.namila.RESTSpringTest.Exception.ResourceNotFoundException;
import me.namila.RESTSpringTest.Model.Contract;
import me.namila.RESTSpringTest.Results.ResponseWrapper;
import me.namila.RESTSpringTest.Model.Leaders;
import me.namila.RESTSpringTest.Service.ContractServiceImp;
import me.namila.RESTSpringTest.Service.LeaderServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

import static me.namila.RESTSpringTest.Constants.ApiConstants.MESSAGE_FOR_REGEX_NUMBER_MISMATCH;
import static me.namila.RESTSpringTest.Constants.ApiConstants.REGEX_FOR_NUMBERS;


@RestController
@RequestMapping("/api/v1/leader")
public class LeadersController extends AbstractController<Leaders, LeaderServiceImp>
{
	@Autowired
	private LeaderServiceImp service;
	public LeadersController(LeaderServiceImp service)
	{
		super(service);
	}
}
