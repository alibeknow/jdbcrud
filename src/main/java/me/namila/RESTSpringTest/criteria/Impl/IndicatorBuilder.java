package me.namila.RESTSpringTest.criteria.Impl;

import me.namila.RESTSpringTest.Model.Indicators;
import me.namila.RESTSpringTest.criteria.AbstractBuilder;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class IndicatorBuilder  extends AbstractBuilder<Indicators> {
    @PersistenceContext
    EntityManager entityManager;
}