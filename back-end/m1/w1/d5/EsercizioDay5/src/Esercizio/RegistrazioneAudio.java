package Esercizio;

public class RegistrazioneAudio extends ELementoMultimediale{
int volume;
int durata;

	public RegistrazioneAudio(String titolo, int volume, int durata) {
		super(titolo);
		this.volume = volume;
		this.durata = durata;
	}
	
	public int abbassaVolume() {
		return volume --;
	}
	public int alzaVolume() {
		return volume ++;
	}
	
	
	public void Play() {
		int i = 0;
		while (i<durata) {
			System.out.print( titolo );
			i++;
		}
		 int a = 0;
		while (a<volume) {
			System.out.print("!");
			a++;
		}
	}
}
