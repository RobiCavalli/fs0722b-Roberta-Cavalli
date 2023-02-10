package Esercizio;

public abstract class Catalogo {
String ISBN;
String Titolo;
int AnnoPubblicazione;
int NumeroPagine;
public Catalogo(String iSBN, String titolo, int annoPubblicazione, int numeroPagine) {
	super();
	ISBN = iSBN;
	Titolo = titolo;
	AnnoPubblicazione = annoPubblicazione;
	NumeroPagine = numeroPagine;
}
public String getISBN() {
	return ISBN;
}
public void setISBN(String iSBN) {
	ISBN = iSBN;
}
public String getTitolo() {
	return Titolo;
}
public void setTitolo(String titolo) {
	Titolo = titolo;
}
public int getAnnoPubblicazione() {
	return AnnoPubblicazione;
}
public void setAnnoPubblicazione(int annoPubblicazione) {
	AnnoPubblicazione = annoPubblicazione;
}
public int getNumeroPagine() {
	return NumeroPagine;
}
public void setNumeroPagine(int numeroPagine) {
	NumeroPagine = numeroPagine;
}
@Override
public String toString() {
	return "Catalogo [ISBN=" + ISBN + ", Titolo=" + Titolo + ", AnnoPubblicazione=" + AnnoPubblicazione
			+ ", NumeroPagine=" + NumeroPagine + ", getISBN()=" + getISBN() + ", getTitolo()=" + getTitolo()
			+ ", getAnnoPubblicazione()=" + getAnnoPubblicazione() + ", getNumeroPagine()=" + getNumeroPagine() + "]";
}


}
