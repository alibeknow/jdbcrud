package me.namila.RESTSpringTest.criteria.Impl;

import me.namila.RESTSpringTest.Model.Contract;
import me.namila.RESTSpringTest.criteria.AbstractBuilder;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class ContractBuilder extends AbstractBuilder<Contract> {
    @PersistenceContext
    EntityManager entityManager;
}
