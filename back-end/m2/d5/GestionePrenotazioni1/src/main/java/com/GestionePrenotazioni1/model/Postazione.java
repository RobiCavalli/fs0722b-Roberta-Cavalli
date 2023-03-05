package com.GestionePrenotazioni1.model;

import jakarta.persistence.*;

import lombok.Data;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name= "Postazione")
@Data
public class Postazione {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
private Long Id;
private String descrizione;
@Enumerated
private PostazioneTipo tipo;
private Integer numeroccupanti;
private Boolean scadenza;
	

	
}
