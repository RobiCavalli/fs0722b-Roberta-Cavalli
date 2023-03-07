package com.eserciziopizzeria.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import com.eserciziopizzeria.model.PizzaMargherita;
import com.eserciziopizzeria.repository.PizzaRepository;
@Component
public class MenuRunner implements CommandLineRunner{

	@Autowired PizzaRepository pizzarepo;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("run...");
		
	PizzaMargherita p = new PizzaMargherita();	
	pizzarepo.save(p);
		
	}

}
