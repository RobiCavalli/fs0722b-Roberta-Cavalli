package com.eserciziopizzeria.model;
import jakarta.persistence.Entity;


@Entity

public class PizzaMargherita extends Pizza{
	
	public PizzaMargherita() {
		
	super.nome="PizzaMargherita";
	super.prezzo=4.99;
	super.calorie=800;
	
	}

		
}


