package me.namila.RESTSpringTest.criteria.Impl;

import me.namila.RESTSpringTest.Model.Address;
import me.namila.RESTSpringTest.criteria.AbstractBuilder;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AddressBuilder extends AbstractBuilder<Address> {
@PersistenceContext
EntityManager entityManager;
}