package com.GestionePrenotazioneS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionePrenotazioneS.repository.PostazioneRepository;
@Service
public class PostazioneService {
	@Autowired
	PostazioneRepository postazioneRepository;
}
