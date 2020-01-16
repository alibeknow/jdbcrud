package me.namila.RESTSpringTest.criteria.Impl;

import me.namila.RESTSpringTest.Model.Trn;
import me.namila.RESTSpringTest.criteria.AbstractBuilder;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class TrnBuilder  extends AbstractBuilder<Trn> {
    @PersistenceContext
    EntityManager entityManager;
}
