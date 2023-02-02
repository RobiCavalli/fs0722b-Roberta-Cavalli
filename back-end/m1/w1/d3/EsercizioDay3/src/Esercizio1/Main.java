package Esercizio1;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pariDispari("gatto");
		annoBisestile(2018);
		stampaNumero(3);
		contoRovescia(5);
	}

	public static void pariDispari(String a) {
		if ((a.length() % 2) == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

	public static void annoBisestile(int a) {
		if (a % 4 == 0 && a % 100 != 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}
	
	
	//2s
		public static void stampaNumero(int n) {
	        switch(n) {
	        case 1: 
	            System.out.println("uno");
	            break;
	        case 2:
	            System.out.println("due");
	            break;
	        case 3:
	            System.out.println("tre");
	            break;
	        default:
	            System.out.println("ERRORE");
	        }
	    }
		
		// 3s
		
		/*public String[] split(String regex) {
			while ( b != "q") {
				System.out.println(b);
				break;
			}
			
		}*/
		
		//4s
		
		public static void contoRovescia(int a) {
			 for (int i=a; i>=0; i=i-1)
				System.out.println(i);
			}
	}
	
	
	
	

