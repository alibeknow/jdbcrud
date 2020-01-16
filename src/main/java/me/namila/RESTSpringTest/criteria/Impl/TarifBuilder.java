package me.namila.RESTSpringTest.criteria.Impl;


import me.namila.RESTSpringTest.Model.Tarif;
import me.namila.RESTSpringTest.criteria.AbstractBuilder;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class TarifBuilder extends AbstractBuilder<Tarif> {
    @PersistenceContext
    EntityManager entityManager;
}

