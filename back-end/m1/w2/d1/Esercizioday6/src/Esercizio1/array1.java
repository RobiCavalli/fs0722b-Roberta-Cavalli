
package Esercizio1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class array1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		
		array[0] = (int) (Math.random()*10);
		array[1] = (int) (Math.random()*10);
		array[2] = (int) (Math.random()*10);
		array[3] = (int) (Math.random()*10);
		array[4] = (int) (Math.random()*10);
		
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		try {
			System.out.println("se vuoi cambiare un numero della lista, decidi in quale posizione vuoi cambiarlo (da 1 a 5) se invece non vuoi cambiare premi 0");
			int scelta = sc.nextInt();
		
		switch(scelta) {
			case 0:
				System.out.println("hai deciso di non cambiare nulla");
				break;
			case 1:
				System.out.println("che numero sostituire alla prima posizione");
				int primo = sc.nextInt();
				array[0] = primo;
				break;
			case 2:
				System.out.println("che numero sostituire alla seconda posizione");
				int secondo = sc.nextInt();
				array[1] = secondo;
				break;
			case 3:
				System.out.println("che numero sostituire alla terza posizione");
				int terzo = sc.nextInt();
				array[2] = terzo;
				break;
			case 4:
				System.out.println("che numero sostituire alla quarta posizione");
				int quarto = sc.nextInt();
				array[3] = quarto;
				break;
			case 5:
				System.out.println("che numero sostituire alla quinta posizione");
				int quinto = sc.nextInt();
				array[4] = quinto;
				break;
			default:	
				System.out.println("hai scelto un numero più grande del 5, ristampo l'array senza modifiche");
		}}
		catch ( InputMismatchException e) {
			System.out.println("ERRORE!! scegli un numero intero");
		}
								
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	
	}
}
