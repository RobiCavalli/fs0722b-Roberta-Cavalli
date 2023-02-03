package Esercizio;

public class Immagine extends ELementoMultimediale{
	int luminosità;
	
	public Immagine(String titolo , int luminosità) {
		super(titolo);
        this.luminosità = luminosità;
	}
	public int abbassaLuminosità() {
		return luminosità --;
	}
	public int alzaLuminosità() {
		return luminosità ++;
	}
	
	public void Show() {
		
		int c = 0;
		while (c<luminosità) {
			System.out.print( titolo );
			c++;
		}
		
		int d = 0;
		while ( d<luminosità) {
			System.out.print("*");
			d++;
		}
	}
}


	