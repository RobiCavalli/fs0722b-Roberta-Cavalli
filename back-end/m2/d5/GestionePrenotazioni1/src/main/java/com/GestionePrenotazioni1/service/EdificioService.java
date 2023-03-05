package com.GestionePrenotazioni1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionePrenotazioni1.model.Edificio;
import com.GestionePrenotazioni1.repository.EdificioRepository;

@Service
public class EdificioService {
	
@Autowired EdificioRepository repo;

public void insertEdificio(Edificio edificio) {
	repo.save(edificio);
}

}
