package me.namila.RESTSpringTest.Controller.Dictionary;


;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.namila.RESTSpringTest.Controller.AbstractController;
import me.namila.RESTSpringTest.Model.Dictionary.State;
import me.namila.RESTSpringTest.Service.Dictionary.StateServiceImp;

@Validated
@RestController
@RequestMapping("/api/v1/state")
public class StateController extends AbstractController<State, StateServiceImp>
{
    @Autowired
    private StateServiceImp service;
    public StateController(StateServiceImp service)
    {
        super(service);
    }
}
