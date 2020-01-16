package me.namila.RESTSpringTest.Service.Dictionary;

import me.namila.RESTSpringTest.Model.Dictionary.AddressType;
import me.namila.RESTSpringTest.Repository.Dictionary.AddressTypeRepository;
import me.namila.RESTSpringTest.Service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AddressTypeServiceImp extends AbstractService<AddressType, AddressTypeRepository>
{
@Autowired
AddressTypeRepository repository;

public AddressTypeServiceImp(AddressTypeRepository repository)
        {   super(repository);
        this.repository=repository;
        }
        }
