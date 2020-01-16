package me.namila.RESTSpringTest.criteria.Impl;

import me.namila.RESTSpringTest.Model.TarifScale;
import me.namila.RESTSpringTest.criteria.AbstractBuilder;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class TarifScaleBuilder  extends AbstractBuilder<TarifScale> {
    @PersistenceContext
    EntityManager entityManager;
}
