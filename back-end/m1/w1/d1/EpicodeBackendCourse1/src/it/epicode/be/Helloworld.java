package it.epicode.be;

import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) {
		// Stampa a console la frase
		System.out.println("This is my first Epicode Java Project!");
		// secondo esercizio

		moltiplica(3, 5);
		concatena ( "ciao", 94);
		String[] animali = {"gatto" , "cane" , "topo" , "coniglio" , "leone"};
		inserisciInArray(animali, "cervo");
		
		//terzo esercizio 
		
		Scanner sc = new Scanner(System.in);
		System.out.println( "Inserisci il tuo nome:");
		String nome = sc.nextLine();
		System.out.println("inserisci la tua eta:");
		String eta = sc.nextLine();
		System.out.println("Inserisci la tua email:");
		String email =sc.nextLine();
		
		System.out.println(nome + " - " +  eta + " - " + email);
		System.out.println(email + " - " +  eta + " - " + nome);
		
		//quarto esercizio 
		 System.out.println(perimetroRettangolo( 1.4 , 8.2));
		 System.out.println(pariDispari(5));
		 System.out.println(perimetroTriangolo( 2.5 , 9.1));
		 
		
		
	}

public static void moltiplica ( int a, int b) {
	int risultato = a * b;
	System.out.println(risultato);

}


public static void concatena (String s , int n) {
	String c = s + " " + n;
	System.out.println(c);
	
}



public static void inserisciInArray ( String[]animali1 , String animale) {
	
	String[] animali2 = new String[6];
	animali2[0] = animali1[0]; 
	animali2[1]= animali1[1];
	animali2[2] = animale;
	animali2[3] = animali1[2];
	animali2[4] = animali1[3];
	animali2[5] = animali1[4];
	
	System.out.println(java.util.Arrays.toString(animali2));
	
}



public static double perimetroRettangolo ( double b , double h) {
	 double p = (b + h) *2;
	 return p;
	
}


public static int pariDispari( int n) {
	return n % 2;
}

public static double perimetroTriangolo (double b, double h ){
	double p = ( b * h ) / 2;
	return p;
}
	
	
	
}













