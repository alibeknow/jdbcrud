package me.namila.RESTSpringTest.Service;

import me.namila.RESTSpringTest.Model.TarifScale;
import me.namila.RESTSpringTest.Repository.TarifScaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TarifScaleServiceImp  extends AbstractService<TarifScale, TarifScaleRepository>
{
    @Autowired
    TarifScaleRepository repository;

    public TarifScaleServiceImp(TarifScaleRepository repository)
    {
        super(repository);
        this.repository=repository;
    }
}
