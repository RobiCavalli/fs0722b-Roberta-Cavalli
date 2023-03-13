package com.GestionePrenotazioneS.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.GestionePrenotazioneS.Model.Edificio;
@Repository
public interface EdificioRepository extends CrudRepository<Edificio, Long> {

}
