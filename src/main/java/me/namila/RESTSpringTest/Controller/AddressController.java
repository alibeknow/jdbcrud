package me.namila.RESTSpringTest.Controller;


import me.namila.RESTSpringTest.Model.Address;
import me.namila.RESTSpringTest.Service.AddressServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/api/v1/address")
public class AddressController  extends AbstractController<Address, AddressServiceImp>
{
@Autowired
private AddressServiceImp service;
public AddressController(AddressServiceImp service)
        {
        super(service);
        }

        }
