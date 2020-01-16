package me.namila.RESTSpringTest.Controller;


import me.namila.RESTSpringTest.Model.TarifScale;
import me.namila.RESTSpringTest.Service.TarifScaleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/api/v1/tarifscale")
public class TarifScaleController extends AbstractController<TarifScale, TarifScaleServiceImp>
{
    @Autowired
    private TarifScaleServiceImp service;
    public TarifScaleController(TarifScaleServiceImp service)
    {
        super(service);
    }

}