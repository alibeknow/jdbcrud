package me.namila.RESTSpringTest.Controller;


import me.namila.RESTSpringTest.Model.Tarif;
import me.namila.RESTSpringTest.Service.TarifServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/api/v1/tarif")
public class TarifController  extends AbstractController<Tarif, TarifServiceImp>
{
    @Autowired
    private TarifServiceImp service;
    public TarifController(TarifServiceImp service)
    {
        super(service);
    }

}