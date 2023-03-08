package com.GestionePrenotazioneS.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.GestionePrenotazioneS.Model.Prenotazione;
@Repository
public interface PrenotazioneRepository extends CrudRepository<Prenotazione, Long> {

}
