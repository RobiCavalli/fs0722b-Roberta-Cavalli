package com.GestionePrenotazioni1.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.GestionePrenotazioni1.model.Edificio;
import com.GestionePrenotazioni1.service.EdificioService;
@Component
public class Edificiorunner implements ApplicationRunner {
 @Autowired EdificioService eservice;
	@Override
	public void run(ApplicationArguments args) throws Exception {
	
     System.out.println("run");
     
     Edificio e = new Edificio();
     e.setNome("Edificioe");
     e.setCitta("Bari");
     e.setIndirizzo("Bari33");
     
     Edificio f = new Edificio();
     f.setNome("Edificiof");
     f.setCitta("Roma");
     f.setIndirizzo("Roma34");
     
     Edificio g = new Edificio();
     g.setNome("Edificiog");
     g.setCitta("Milano");
     g.setIndirizzo("Milano35");
     
     eservice.insertEdificio(e);
     eservice.insertEdificio(f);
     eservice.insertEdificio(g);
	}
	

}
