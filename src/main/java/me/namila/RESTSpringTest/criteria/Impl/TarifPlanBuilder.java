package me.namila.RESTSpringTest.criteria.Impl;

import me.namila.RESTSpringTest.Model.TarifPlan;
import me.namila.RESTSpringTest.criteria.AbstractBuilder;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class TarifPlanBuilder  extends AbstractBuilder<TarifPlan> {
    @PersistenceContext
    EntityManager entityManager;
}
