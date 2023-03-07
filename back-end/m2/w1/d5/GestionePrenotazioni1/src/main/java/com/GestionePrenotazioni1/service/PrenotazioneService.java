package com.GestionePrenotazioni1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionePrenotazioni1.model.Prenotazione;
import com.GestionePrenotazioni1.repository.PrenotazioneRepository;

@Service
public class PrenotazioneService {

@Autowired PrenotazioneRepository repo;

public void insertPrenotazione(Prenotazione prenotazione) {
	repo.save(prenotazione);
}
}
