package me.namila.RESTSpringTest.Service;

import me.namila.RESTSpringTest.Model.TarifPlan;
import me.namila.RESTSpringTest.Repository.TarifPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TarifPlanServiceImp  extends AbstractService<TarifPlan, TarifPlanRepository>
{
    @Autowired
    TarifPlanRepository repository;

    public TarifPlanServiceImp(TarifPlanRepository repository)
    {
        super(repository);
        this.repository=repository;
    }
}
