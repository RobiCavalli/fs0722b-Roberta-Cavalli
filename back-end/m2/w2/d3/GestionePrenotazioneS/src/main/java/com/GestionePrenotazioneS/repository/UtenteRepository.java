package com.GestionePrenotazioneS.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.GestionePrenotazioneS.Model.Utente;
@Repository
public interface UtenteRepository extends CrudRepository<Utente, Long> {

}