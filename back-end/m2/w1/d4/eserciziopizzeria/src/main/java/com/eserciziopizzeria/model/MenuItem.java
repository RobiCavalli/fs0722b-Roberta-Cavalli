package com.eserciziopizzeria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public  abstract class MenuItem {
	
@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long id;
String nome;
Double prezzo;
Double calorie;

}
