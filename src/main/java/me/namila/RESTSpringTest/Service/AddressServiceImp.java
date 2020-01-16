package me.namila.RESTSpringTest.Service;

import me.namila.RESTSpringTest.Model.Address;
import me.namila.RESTSpringTest.Repository.AddressRepository;
import me.namila.RESTSpringTest.criteria.AbstractBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImp  extends AbstractService<Address, AddressRepository>
{
    @Autowired
    AddressRepository repository;
    AbstractBuilder<Address> abstractBuilder;

    public AddressServiceImp(AddressRepository repository)
    {   super(repository);
        this.repository=repository;
    }
}
