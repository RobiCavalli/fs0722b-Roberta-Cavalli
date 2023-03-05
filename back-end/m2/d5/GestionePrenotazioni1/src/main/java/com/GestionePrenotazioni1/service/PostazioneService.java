package com.GestionePrenotazioni1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.GestionePrenotazioni1.model.Postazione;
import com.GestionePrenotazioni1.repository.PostazioneRepository;

@Service
public class PostazioneService {
	@Autowired PostazioneRepository repo;
	public void insertPostazione(Postazione postazione) {
		repo.save(postazione);
	}
}
