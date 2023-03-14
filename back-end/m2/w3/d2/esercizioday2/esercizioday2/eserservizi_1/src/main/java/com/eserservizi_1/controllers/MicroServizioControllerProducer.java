package com.eserservizi_1.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.eserservizi_1.models.Persona;
import com.eserservizi_1.repository.PersonaRepository;


@RestController
@RequestMapping("/app")
public class MicroServizioControllerProducer {
	@Autowired PersonaRepository repo;
	
	@GetMapping("/data1")
	public String test() {
		return "BE String content";
	}
	
	
	
	@GetMapping("/data2")
	public ResponseEntity<List<Persona>> string_persona() {

        List<Persona> persone = repo.findAll();
        
        
        return new ResponseEntity<List<Persona>>(persone,HttpStatus.OK);
    }
	
	
	
	
	@GetMapping(value= "/data3",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Persona>> json_Persona() {

        List<Persona> persone = repo.findAll();
        
        
        return new ResponseEntity<List<Persona>>(persone, HttpStatus.OK);
    }

}
