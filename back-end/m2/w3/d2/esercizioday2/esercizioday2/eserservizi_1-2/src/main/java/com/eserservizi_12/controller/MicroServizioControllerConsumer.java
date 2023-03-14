package com.eserservizi_12.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/os")
public class MicroServizioControllerConsumer {
	
	@GetMapping("/get-string")
	public String test() {
		RestTemplate rt = new RestTemplate();
		String rtUrl = "http://localhost:8082/app/data1";
		ResponseEntity<String> response = rt.getForEntity(rtUrl, String.class);
		
		return "Core Mcroserv : " + response.getBody();
	}

	@GetMapping("/get-people")
	public String getPeople() {
		RestTemplate rt = new RestTemplate();
		String rtUrl = "http://localhost:8082/app/data2";
		String response = rt.getForObject(rtUrl, String.class);
		
		return "Core Mcroserv : " + response;
	}
	
	@GetMapping("/get-people-json")
	public Object getJsonPeople() {
		RestTemplate rt = new RestTemplate();
		String rtUrl = "http://localhost:8082/app/data3";
		Object response = rt.getForObject(rtUrl, Object.class);
		
		return response;
	}
}
