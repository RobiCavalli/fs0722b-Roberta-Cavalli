package Esercizio;

public class Video  extends ELementoMultimediale{
int durata;
int volume;
int luminosità;

	public Video(String titolo , int durata , int volume, int luminosità) {
		super(titolo);
		this.durata = durata;
        this.volume = volume;
        this.luminosità = luminosità;
	}

	public int abbassaLuminosità() {
		return luminosità --;
	}
	public int alzaLuminosità() {
		return luminosità ++;
	}
	
	public void Lumus() {
		
		int b = 0;
		while ( b<luminosità) {
			System.out.print("*");
			b++;
		}
	}
}

