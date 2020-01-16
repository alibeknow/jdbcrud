package me.namila.RESTSpringTest.Controller.Dictionary;


import me.namila.RESTSpringTest.Controller.AbstractController;
import me.namila.RESTSpringTest.Model.Dictionary.Position;
import me.namila.RESTSpringTest.Service.Dictionary.PositionServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/api/v1/position")
public class PositionController extends AbstractController<Position, PositionServiceImp>
{
    @Autowired
    private PositionServiceImp service;
    public PositionController(PositionServiceImp service)
    {
        super(service);
    }
}
