package Esercizio1;

public class Operaio extends Dipendente {

	public Operaio(double stipendioBase, int matricola, int stipendio, double importoOrarioStraordinario, String mansione) {
		super(stipendioBase, matricola, stipendio, importoOrarioStraordinario, mansione);
		
	}
	public double getstipendioBase() {
		return stipendioBase;
	}
}



