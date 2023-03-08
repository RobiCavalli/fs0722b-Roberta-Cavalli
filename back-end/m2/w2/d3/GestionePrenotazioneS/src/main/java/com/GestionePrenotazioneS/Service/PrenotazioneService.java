package com.GestionePrenotazioneS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.GestionePrenotazioneS.Model.Prenotazione;
import com.GestionePrenotazioneS.repository.PrenotazioneRepository;

public class PrenotazioneService {

	@Autowired
	PrenotazioneRepository prenotazioneRepository;

	public List<Prenotazione> findAllPrenotazioni() {

		return (List<Prenotazione>) prenotazioneRepository.findAll();
	}
		
	
	
	
}
