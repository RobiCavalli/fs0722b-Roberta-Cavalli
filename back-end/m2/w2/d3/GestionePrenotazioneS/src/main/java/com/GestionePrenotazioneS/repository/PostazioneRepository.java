package com.GestionePrenotazioneS.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.GestionePrenotazioneS.Model.Postazione;
@Repository
public interface PostazioneRepository extends CrudRepository<Postazione, Long> {

}
