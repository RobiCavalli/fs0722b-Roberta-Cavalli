package com.GestionePrenotazioni1.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.GestionePrenotazioni1.model.Utente;
import com.GestionePrenotazioni1.service.UtenteService;
@Component
public class UtenteRunner implements ApplicationRunner {
	@Autowired UtenteService uservice;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("utenterun");

		 Utente u = new Utente();
	     u.setNomecompleto("Mario");
	     u.setUsername("Mariouno");
	     u.setEmail("Mario@");
	     
	     Utente u1 = new Utente();
	     u1.setNomecompleto("Luigi");
	     u1.setUsername("Luigino");
	     u1.setEmail("Luigi@");
	     
	     Utente u2 = new Utente();
	     u2.setNomecompleto("Antonio");
	     u2.setUsername("Anto");
	     u2.setEmail("Antonio@");
	     
	     uservice.insertUtente(u);
	     uservice.insertUtente(u1);
	     uservice.insertUtente(u2);
	
		uservice.getUtentebyId(null);
		
		
		
	}

}
