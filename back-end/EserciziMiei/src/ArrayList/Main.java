package ArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
	ArrayList <String> canistringati = new ArrayList<>();
	
	canistringati.add("Mario");
	canistringati.add("Briciola");
	canistringati.add("Minu");
	System.out.println( "I cani : " + canistringati);
		
		
	/*for ( String cane : canistringati) {
		System.out.print(cane + " ");
	}*/
     
	String firstdog = canistringati.get(0);
	System.out.println("my best friend:" + firstdog);	
	
	String secondog = canistringati.set(1,"Camomilla");
	for (String cane1 : canistringati) {
	System.out.println(canistringati);
		}
	
	
	canistringati.remove(2);
	for (String cane1 : canistringati) {
	System.out.println("I mie cani  " + cane1);

	}
	
	
	int size = canistringati.size();
	System.out.println(size);
	
	}

}
