package com.SpringWebc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Page1Controller {
@GetMapping("/Home")
public String getpage1() {
	return "NewFile";
	
}
}
	
	

