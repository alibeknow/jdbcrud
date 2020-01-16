package me.namila.RESTSpringTest.Controller.Dictionary;


import me.namila.RESTSpringTest.Controller.AbstractController;
import me.namila.RESTSpringTest.Model.Dictionary.System;
import me.namila.RESTSpringTest.Service.Dictionary.SystemServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/api/v1/system")
public class SystemController extends AbstractController<System, SystemServiceImp>
{
    @Autowired
    private SystemServiceImp service;
    public SystemController(SystemServiceImp service)
    {
        super(service);
    }
}
