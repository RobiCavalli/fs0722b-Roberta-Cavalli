package Esercizio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Prestito implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String utente;
	private int elementoprestato;
	private Date inizioprestito;
	private Date restituzioneprevista;
	private Date restituzioneffettiva;
	
	public String getUtente() {
		return utente;
	}

	public void setUtente(String utente) {
		this.utente = utente;
	}

	public int getElementoprestato() {
		return elementoprestato;
	}

	public void setElementoprestato(int elementoprestato) {
		this.elementoprestato = elementoprestato;
	}

	public Date getInizioprestito() {
		return inizioprestito;
	}

	public void setInizioprestito(Date inizioprestito) {
		this.inizioprestito = inizioprestito;
	}

	public Date getRestituzioneprevista() {
		return restituzioneprevista;
	}

	public void setRestituzioneprevista(Date restituzioneprevista) {
		this.restituzioneprevista = restituzioneprevista;
	}

	public Date getRestituzioneffettiva() {
		return restituzioneffettiva;
	}

	public void setRestituzioneffettiva(Date restituzioneffettiva) {
		this.restituzioneffettiva = restituzioneffettiva;
	}

	
	
	public Prestito() {
		super();
	}

	
	
	
}
