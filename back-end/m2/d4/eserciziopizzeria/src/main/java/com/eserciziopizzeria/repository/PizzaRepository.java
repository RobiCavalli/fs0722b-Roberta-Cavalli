package com.eserciziopizzeria.repository;

import org.springframework.data.repository.CrudRepository;

import com.eserciziopizzeria.model.Pizza;

public interface PizzaRepository extends CrudRepository<Pizza, Long> {

}
