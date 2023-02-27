package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import confingBean.ConfigurationTest;
import confingBean.Test;

@SpringBootApplication
public class DemounoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemounoApplication.class, args);
	
		configWith_Beans();
}

	
public static void configWith_Beans() {
		
		ApplicationContext appCtx = new AnnotationConfigApplicationContext(ConfigurationTest.class);
		
		// Recupero Bean
		Test t1 = (Test) appCtx.getBean("test");
		System.out.println(t1.saluta());
}
}