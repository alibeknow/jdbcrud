package me.namila.RESTSpringTest.Service;

import me.namila.RESTSpringTest.Model.Trn;
import me.namila.RESTSpringTest.Repository.TrnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TrnServiceImp  extends AbstractService<Trn, TrnRepository>
{
    @Autowired
    TrnRepository repository;

    public TrnServiceImp(TrnRepository repository)
    {
        super(repository);
        this.repository=repository;
    }
}
