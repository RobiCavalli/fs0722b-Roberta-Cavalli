package Esercizio2;
import java.util.InputMismatchException;
import java.util.Scanner;


	public class Consumo {

		public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);
	        try {

	        System.out.println("inserisci quanti kilometri hai fatto");
	        int kilometri = sc.nextInt();
	        System.out.println("quanti litri hai consumato");
	        int consumo = sc.nextInt();
	        float diviso = kilometri/consumo;
	        System.out.println(diviso);
	        }
	        catch (ArithmeticException e) {
	            System.out.println("ERRORE!! cambia il valore 0 al consumo");
	        }
	        catch (InputMismatchException e) {
	        System.out.println("ERRORE!!inserisci un numero intero");
	        }

	}

}



