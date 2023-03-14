package com.eserservizi_1.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.eserservizi_1.models.Persona;
import com.eserservizi_1.repository.PersonaRepository;
@Component
public class PersonaRunner implements ApplicationRunner {

	@Autowired PersonaRepository repo;
	@Override
	public void run(ApplicationArguments args) throws Exception {
	System.out.println("MicroServizioProducer run");
	setPersone();
	}
private void setPersone() {
	Persona p1 = Persona.builder().name("Simona").city("Catania").age(25).build();
	Persona p2 = Persona.builder().name("Giada").city("Sardegna").age(22).build();
	Persona p3=  Persona.builder().name("Roberta").city("Bari").age(25).build();
	
	repo.save(p1);
	repo.save(p2);
	repo.save(p3);
}
}
