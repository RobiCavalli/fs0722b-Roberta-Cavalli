package com.GestionePrenotazioneS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionePrenotazioneS.repository.UtenteRepository;

@Service
public class UtenteService {
	@Autowired UtenteRepository utenteRepository;
}
