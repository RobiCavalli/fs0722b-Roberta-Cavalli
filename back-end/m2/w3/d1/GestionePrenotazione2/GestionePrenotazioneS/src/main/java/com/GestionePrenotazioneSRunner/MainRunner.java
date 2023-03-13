package com.GestionePrenotazioneSRunner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.GestionePrenotazioneS.Model.Edificio;
import com.GestionePrenotazioneS.Model.Postazione;
import com.GestionePrenotazioneS.Model.Prenotazione;
import com.GestionePrenotazioneS.Model.TipoPostazione;
import com.GestionePrenotazioneS.Model.Utente;
import com.GestionePrenotazioneS.repository.EdificioRepository;
import com.GestionePrenotazioneS.repository.PostazioneRepository;
import com.GestionePrenotazioneS.repository.PrenotazioneRepository;
import com.GestionePrenotazioneS.repository.UtenteRepository;

@Component
public class MainRunner implements ApplicationRunner {

	@Autowired
	EdificioRepository edificioRepository;
	@Autowired
	PostazioneRepository postazioneRepository;
	@Autowired
	PrenotazioneRepository prenotazioneRepository;
	@Autowired
	UtenteRepository utenteRepository;
	@Value("${gestioneprenotazioni.init}")
	private int controllo;

	public void creaDatiIniziali() {
		Edificio ed = new Edificio();
		ed.setCittà("Maranello");
		ed.setIndirizzo("via del bello 4");
		ed.setNome("casa mia");
		edificioRepository.save(ed);

		Postazione pos = new Postazione();
		pos.setDescrizione("bellina");
		pos.setEdificio(ed);
		pos.setNumeroMassimoOccupanti(10);
		pos.setTipo(TipoPostazione.PRIVATO);
		postazioneRepository.save(pos);

		Utente ut = new Utente();
		ut.setNomeintero("robi");
		ut.setUsername("ro");
		ut.setEmail("robi@gmail.com");
		utenteRepository.save(ut);

		Prenotazione pr = new Prenotazione();
		pr.setPostazione(pos);
		pr.setUtente(ut);
		pr.setDataPrenotazione(LocalDate.of(2023, 03, 8));
		prenotazioneRepository.save(pr);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub

	}

}
