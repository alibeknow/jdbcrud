package me.namila.RESTSpringTest.Service.Dictionary;


import me.namila.RESTSpringTest.Model.Dictionary.AddressType;
import me.namila.RESTSpringTest.Model.Dictionary.IndicatorsType;
import me.namila.RESTSpringTest.Repository.Dictionary.AddressTypeRepository;
import me.namila.RESTSpringTest.Repository.Dictionary.IndicatorsTypeRepository;
import me.namila.RESTSpringTest.Service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndicatorsTypeServiceImp  extends AbstractService<IndicatorsType, IndicatorsTypeRepository>
{
    @Autowired
    IndicatorsTypeRepository repository;

    public IndicatorsTypeServiceImp(IndicatorsTypeRepository repository)
    {   super(repository);
        this.repository=repository;
    }
}
