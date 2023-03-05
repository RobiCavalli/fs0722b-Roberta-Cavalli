package com.GestionePrenotazioni1.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.GestionePrenotazioni1.model.Prenotazione;
import com.GestionePrenotazioni1.service.PrenotazioneService;
@Component
public class Prenotazionerunner implements ApplicationRunner {
	@Autowired PrenotazioneService pservice;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("prenotazionerun");
        
		Prenotazione p = new Prenotazione();
		p.setData(12-12-22);
		p.setScadenza(true);
		
		Prenotazione p2 = new Prenotazione();
		p2.setData(11-12-22);
		p2.setScadenza(true);
		
		Prenotazione p3 = new Prenotazione();
		p3.setData(13-12-22);
		p3.setScadenza(true);
		
		
		pservice.insertPrenotazione(p);
		pservice.insertPrenotazione(p2);
		pservice.insertPrenotazione(p3);
	}

}
