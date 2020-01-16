package me.namila.RESTSpringTest.Controller;


import me.namila.RESTSpringTest.Model.TarifPlan;
import me.namila.RESTSpringTest.Service.TarifPlanServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/api/v1/tarifplan")
public class TarifPlanController extends AbstractController<TarifPlan, TarifPlanServiceImp>
{
    @Autowired
    private TarifPlanServiceImp service;
    public TarifPlanController(TarifPlanServiceImp service)
    {
        super(service);
    }

}