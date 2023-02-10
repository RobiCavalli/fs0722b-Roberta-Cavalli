package Esercizio;

public class Riviste extends Catalogo {
Periodicità Periodicità;
public Riviste(String iSBN, String titolo, int annoPubblicazione, int numeroPagine, Periodicità Periodicità) {
		super(iSBN, titolo, annoPubblicazione, numeroPagine);
		this.ISBN = iSBN;
		this.Titolo=titolo;
		this.AnnoPubblicazione=annoPubblicazione;
		this.NumeroPagine=numeroPagine;
        this.Periodicità = Periodicità;
}

public  String toString() {
	return(this.Titolo + this.Periodicità);
}

public Periodicità getPeriodicità() {
	return Periodicità;
}

public void setPeriodicità(Periodicità periodicità) {
	Periodicità = periodicità;
}



}
