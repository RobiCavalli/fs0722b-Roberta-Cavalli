package com.GestionePrenotazioneS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionePrenotazioneS.repository.EdificioRepository;

@Service
public class EdificioService {
	@Autowired
	EdificioRepository edificioRepository;
}
