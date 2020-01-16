package me.namila.RESTSpringTest.Controller.Dictionary;


import me.namila.RESTSpringTest.Controller.AbstractController;
import me.namila.RESTSpringTest.Model.Dictionary.AddressType;
import me.namila.RESTSpringTest.Service.Dictionary.AddressTypeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/api/v1/addresstype")
public class AddressTypeController  extends AbstractController<AddressType, AddressTypeServiceImp>
{
    @Autowired
    private AddressTypeServiceImp service;
    public AddressTypeController(AddressTypeServiceImp service)
    {
        super(service);
    }

}
