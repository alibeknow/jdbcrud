package me.namila.RESTSpringTest.Service;

import me.namila.RESTSpringTest.Model.Tarif;
import me.namila.RESTSpringTest.Repository.TarifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TarifServiceImp  extends AbstractService<Tarif, TarifRepository>
{
    @Autowired
    TarifRepository repository;

    public TarifServiceImp(TarifRepository repository)
    {
        super(repository);
        this.repository=repository;
    }
}
