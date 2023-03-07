package com.GestionePrenotazioni1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.GestionePrenotazioni1.model.Postazione;
@Repository
public interface PostazioneRepository extends CrudRepository<Postazione, Long> {

}
