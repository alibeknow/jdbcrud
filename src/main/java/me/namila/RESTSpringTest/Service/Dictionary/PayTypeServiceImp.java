package me.namila.RESTSpringTest.Service.Dictionary;

import me.namila.RESTSpringTest.Model.Dictionary.PayType;
import me.namila.RESTSpringTest.Repository.Dictionary.PayTypeRepository;
import me.namila.RESTSpringTest.Service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayTypeServiceImp  extends AbstractService<PayType, PayTypeRepository>
{
    @Autowired
    PayTypeRepository repository;

    public PayTypeServiceImp(PayTypeRepository repository)
    {
        super(repository);
        this.repository=repository;
    }
}