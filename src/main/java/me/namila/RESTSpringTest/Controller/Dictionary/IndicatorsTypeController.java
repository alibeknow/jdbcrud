package me.namila.RESTSpringTest.Controller.Dictionary;


import me.namila.RESTSpringTest.Controller.AbstractController;
import me.namila.RESTSpringTest.Model.Dictionary.IndicatorsType;
import me.namila.RESTSpringTest.Service.Dictionary.IndicatorsTypeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/api/v1/indicatorstype")
public class IndicatorsTypeController  extends AbstractController<IndicatorsType, IndicatorsTypeServiceImp>
{
    @Autowired
    private IndicatorsTypeServiceImp service;
    public IndicatorsTypeController(IndicatorsTypeServiceImp service)
    {
        super(service);
    }
}
