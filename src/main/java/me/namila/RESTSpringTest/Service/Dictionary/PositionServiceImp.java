package me.namila.RESTSpringTest.Service.Dictionary;

import me.namila.RESTSpringTest.Model.Dictionary.Position;
import me.namila.RESTSpringTest.Repository.Dictionary.PositionRepositrory;
import me.namila.RESTSpringTest.Service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionServiceImp  extends AbstractService<Position, PositionRepositrory>
{
    @Autowired
    PositionRepositrory repository;

    public PositionServiceImp(PositionRepositrory repository)
    {   super(repository);
        this.repository=repository;
    }
}