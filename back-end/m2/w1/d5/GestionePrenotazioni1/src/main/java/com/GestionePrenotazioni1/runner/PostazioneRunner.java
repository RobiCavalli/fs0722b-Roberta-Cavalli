package com.GestionePrenotazioni1.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.GestionePrenotazioni1.model.Postazione;
import com.GestionePrenotazioni1.model.PostazioneTipo;
import com.GestionePrenotazioni1.service.PostazioneService;
@Component
public class PostazioneRunner implements ApplicationRunner {
	@Autowired PostazioneService poservice;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("postazionerun");
		
		Postazione po1 = new Postazione();
		po1.setDescrizione("salariunioni");
		po1.setNumeroccupanti(11);
		po1.setScadenza(true);
		po1.setTipo(PostazioneTipo.SALARIUNIONI);
		
		poservice.insertPostazione(po1);
		
		
	}
     
}
