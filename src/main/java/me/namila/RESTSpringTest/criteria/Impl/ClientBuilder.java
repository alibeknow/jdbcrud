package me.namila.RESTSpringTest.criteria.Impl;

import me.namila.RESTSpringTest.Model.Client;
import me.namila.RESTSpringTest.criteria.AbstractBuilder;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ClientBuilder extends AbstractBuilder<Client> {
    @PersistenceContext
    EntityManager entityManager;
}