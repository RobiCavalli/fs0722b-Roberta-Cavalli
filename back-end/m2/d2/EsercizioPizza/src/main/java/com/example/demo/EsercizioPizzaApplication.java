package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import Model.Menu;
import configuration.MenuConfiguration;

@SpringBootApplication
public class EsercizioPizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsercizioPizzaApplication.class, args);
	gestioneMenu();
}

	
	public static void gestioneMenu() {
		//dico quale file di configurazione voglio utilizzare
		ApplicationContext appCtx = new  AnnotationConfigApplicationContext(MenuConfiguration.class);
		//vado a leggere il bean
		menu = (Menu) appCtx.getBean("menu");
		((AbstractApplicationContext) appCtx).close();
	}
}
