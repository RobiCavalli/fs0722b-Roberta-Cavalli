package com.GestionePrenotazioni1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.GestionePrenotazioni1.model.Edificio;
@Repository
public interface EdificioRepository extends CrudRepository<Edificio, Long> {

}
