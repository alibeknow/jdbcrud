package me.namila.RESTSpringTest.Service.Dictionary;

import me.namila.RESTSpringTest.Model.Dictionary.System;

import me.namila.RESTSpringTest.Repository.Dictionary.SystemRepository;
import me.namila.RESTSpringTest.Service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class  SystemServiceImp extends AbstractService<System, SystemRepository> {
    @Autowired
    SystemRepository repository;

    public SystemServiceImp(SystemRepository repository)
    {
        super(repository);
        this.repository=repository;
    }
}
