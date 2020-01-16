package me.namila.RESTSpringTest.Controller;

import me.namila.RESTSpringTest.Model.Client;
import me.namila.RESTSpringTest.Model.Contract;
import me.namila.RESTSpringTest.Results.ResponseWrapper;
import me.namila.RESTSpringTest.Service.ClientServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import java.util.List;

import static me.namila.RESTSpringTest.Constants.ApiConstants.MESSAGE_FOR_REGEX_NUMBER_MISMATCH;
import static me.namila.RESTSpringTest.Constants.ApiConstants.REGEX_FOR_NUMBERS;

@Validated
@RestController
@RequestMapping("/api/v1/client")
public class ClientController extends AbstractController<Client, ClientServiceImp>
{
    @Autowired
    private ClientServiceImp service;
    public ClientController (ClientServiceImp service)
    {
        super(service);
    }

}
