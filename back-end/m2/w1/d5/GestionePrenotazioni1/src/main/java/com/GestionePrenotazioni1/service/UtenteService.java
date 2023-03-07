package com.GestionePrenotazioni1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionePrenotazioni1.model.Utente;
import com.GestionePrenotazioni1.repository.UtenteRepository;
@Service
public class UtenteService {

	@Autowired UtenteRepository repo;

	public void insertUtente(Utente utente) {
		repo.save(utente);
	}
	
	public Utente getUtentebyId(Long id) {
		 return repo.findById(id).get();
		
	}
	
	
	
}
