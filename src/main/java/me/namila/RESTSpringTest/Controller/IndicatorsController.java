package me.namila.RESTSpringTest.Controller;


import me.namila.RESTSpringTest.Model.Contract;
import me.namila.RESTSpringTest.Model.Indicators;
import me.namila.RESTSpringTest.Service.ContractServiceImp;
import me.namila.RESTSpringTest.Service.IndicatorsServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/api/v1/indicators")
public class IndicatorsController extends AbstractController<Indicators, IndicatorsServiceImp>
{
    @Autowired
    private IndicatorsServiceImp service;
    public IndicatorsController(IndicatorsServiceImp service)
    {
        super(service);
    }

}
