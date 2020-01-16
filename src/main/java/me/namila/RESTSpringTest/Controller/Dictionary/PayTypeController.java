package me.namila.RESTSpringTest.Controller.Dictionary;


import me.namila.RESTSpringTest.Controller.AbstractController;
import me.namila.RESTSpringTest.Model.Dictionary.PayType;
import me.namila.RESTSpringTest.Service.Dictionary.PayTypeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/api/v1/paytype")
public class PayTypeController extends AbstractController<PayType, PayTypeServiceImp>
{
    @Autowired
    private PayTypeServiceImp service;
    public PayTypeController(PayTypeServiceImp service)
    {
        super(service);
    }
}
