package com.GestionePrenotazioni1.model;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Inheritance(strategy =InheritanceType.SINGLE_TABLE)
@Table(name="Utente")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Utente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String nomecompleto;
	private String email;
	//creo oggetti di tipo prenotazione
	
	@OneToMany(mappedBy ="id")
	private List<Prenotazione> prenotazioni;
	
	@OneToOne
	@JoinColumn(name = "postazione", referencedColumnName = "id")
    private Postazione postazione;
}
