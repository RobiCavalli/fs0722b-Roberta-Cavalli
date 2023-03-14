package com.eserservizi_1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table(name="Persone")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private	Long Id ;
private String name;
private String city;
private int age;
	

}
