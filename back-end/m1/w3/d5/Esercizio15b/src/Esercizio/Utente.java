package Esercizio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Utente implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "numerotessera")
private int numerotessera;
@Column(name = "nome")
private String nome;
@Column(name = "cognome")
private String cognome;
@Column(name = "datanascita")
private Date datanascita;


public int getNumerotessera() {
	return numerotessera;
}


public void setNumerotessera(int numerotessera) {
	this.numerotessera = numerotessera;
}


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public String getCognome() {
	return cognome;
}


public void setCognome(String cognome) {
	this.cognome = cognome;
}


public Date getDatanascita() {
	return datanascita;
}


public void setDatanascita(Date datanascita) {
	this.datanascita = datanascita;
}


public Utente() {
	super();
}






}
