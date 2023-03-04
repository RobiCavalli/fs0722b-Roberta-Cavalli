package com.GestionePrenotazioni1.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.GestionePrenotazioni1.service.EdificioService;
@Component
public class Testrunner implements ApplicationRunner {
 @Autowired EdificioService eservice;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
     System.out.println("run");
	}

}
