package me.namila.RESTSpringTest.Service.Dictionary;


import me.namila.RESTSpringTest.Model.Client;
import me.namila.RESTSpringTest.Model.Dictionary.State;
import me.namila.RESTSpringTest.Repository.ClientRepository;
import me.namila.RESTSpringTest.Repository.Dictionary.StateRepository;
import me.namila.RESTSpringTest.Service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateServiceImp extends AbstractService<State, StateRepository>
{
    @Autowired
    StateRepository repository;

    public StateServiceImp(StateRepository repository)
    {
        super(repository);
        this.repository=repository;
    }
}
