package me.namila.RESTSpringTest.criteria.Impl;

import me.namila.RESTSpringTest.Model.Leaders;
import me.namila.RESTSpringTest.criteria.AbstractBuilder;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class LeaderBuilder extends AbstractBuilder<Leaders> {
    @PersistenceContext
    EntityManager entityManager;
}
