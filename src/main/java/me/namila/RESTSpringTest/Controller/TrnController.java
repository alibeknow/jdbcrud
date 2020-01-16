package me.namila.RESTSpringTest.Controller;


import me.namila.RESTSpringTest.Model.Trn;
import me.namila.RESTSpringTest.Service.TrnServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/api/v1/trm")
public class TrnController extends AbstractController<Trn, TrnServiceImp>
{
    @Autowired
    private TrnServiceImp service;
    public TrnController(TrnServiceImp service)
    {
        super(service);
    }

}