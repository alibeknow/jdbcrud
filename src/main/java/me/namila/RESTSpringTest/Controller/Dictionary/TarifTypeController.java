package me.namila.RESTSpringTest.Controller.Dictionary;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.namila.RESTSpringTest.Controller.AbstractController;
import me.namila.RESTSpringTest.Model.Dictionary.TarifType;
import me.namila.RESTSpringTest.Service.Dictionary.TarifTypeServiceImp;


@Validated
@RestController
@RequestMapping("/api/v1/tariftype")
public class TarifTypeController extends AbstractController<TarifType, TarifTypeServiceImp>
{
    @Autowired
    private TarifTypeServiceImp service;
    public TarifTypeController(TarifTypeServiceImp service)
    {
        super(service);
    }

}
