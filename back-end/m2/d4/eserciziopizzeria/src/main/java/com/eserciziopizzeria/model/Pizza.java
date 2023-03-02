package com.eserciziopizzeria.model;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pizza extends Prodotto {
	double calorie;

	}


