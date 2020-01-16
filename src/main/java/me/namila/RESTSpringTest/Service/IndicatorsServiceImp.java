package me.namila.RESTSpringTest.Service;

import me.namila.RESTSpringTest.Model.Indicators;
import me.namila.RESTSpringTest.Repository.IndicatorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndicatorsServiceImp extends AbstractService<Indicators, IndicatorsRepository>
{
    @Autowired
    IndicatorsRepository repository;

    public IndicatorsServiceImp(IndicatorsRepository repository)
    {
        super(repository);
        this.repository=repository;
    }
}
