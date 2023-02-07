

package Esercizio1;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {

	public static void main(String[] args) {
	
		Set<String> s = new HashSet<String>();
		Set<String> duplicati = new HashSet<String>();
		Scanner sc = new Scanner(System.in);	
		try {
		System.out.println("scrivi quante parole vuoi inserire");		
		int n = sc.nextInt();
					
		System.out.println("Scrivi le parole che vuoi inserire");
		
		for(int i=0; i<n; i++) {
			
			String p = sc.next();
			
			if(s.contains(p)) {
				duplicati.add(p);
			}
			s.add(p);
		}
		System.out.println(s);	
		
		int is = s.size();
		System.out.println("la tua lista è lunga: " + is);
		System.out.println("le parole duplicate sono: " + duplicati);
		}
		catch(java.util.InputMismatchException e) {
			System.out.println("ERRORE, devi inserire un numero intero");
		}
	}
}
	
