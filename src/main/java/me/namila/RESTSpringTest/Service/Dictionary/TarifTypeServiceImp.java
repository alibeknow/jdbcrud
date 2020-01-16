package me.namila.RESTSpringTest.Service.Dictionary;

import me.namila.RESTSpringTest.Model.Dictionary.TarifType;
import me.namila.RESTSpringTest.Repository.Dictionary.TarifTypeRepository;
import me.namila.RESTSpringTest.Service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TarifTypeServiceImp  extends AbstractService<TarifType, TarifTypeRepository>
{
    @Autowired
    TarifTypeRepository repository;

    public TarifTypeServiceImp(TarifTypeRepository repository)
    {   super(repository);
        this.repository=repository;
    }
}