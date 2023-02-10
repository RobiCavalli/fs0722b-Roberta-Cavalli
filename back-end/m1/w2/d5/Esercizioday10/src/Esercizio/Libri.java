package Esercizio;

public class Libri extends Catalogo{
	String autore;
	String genere;

	public Libri(String iSBN, String titolo, int annoPubblicazione, int numeroPagine , String autore, String genere) {
		super(iSBN, titolo, annoPubblicazione, numeroPagine);
	this.ISBN = iSBN;
	this.Titolo=titolo;
	this.AnnoPubblicazione=annoPubblicazione;
	this.NumeroPagine=numeroPagine;
	this.autore=autore;
	this.genere= genere;
	}

	
	public  String toString() {
		return(this.Titolo + this.genere);
	}


	public String getAutore() {
		return autore;
	}


	public void setAutore(String autore) {
		this.autore = autore;
	}


	public String getGenere() {
		return genere;
	}


	public void setGenere(String genere) {
		this.genere = genere;
	}
	
   
}


