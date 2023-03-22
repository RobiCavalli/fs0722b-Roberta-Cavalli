package Map;

import java.util.HashMap;
import java.util.Scanner;

public class MainProject {
	public static HashMap<String,Double> moneyList = new HashMap<String,Double>();
	
	public static void main(String[] args) {
	AddAll();
		 
	 Scanner scan = new Scanner(System.in);
	 String nome =scan.nextLine();
	 if (moneyList.containsKey(nome)) {
		 System.out.println(nome + "ha "+ moneyList.get(nome)+"euro");
	 }
	 else {
		 System.out.println("nome non trovato");
	 }
	
	 
	}
		
	public static void AddAll() {
		moneyList.put("Francesco", 2.2);
		moneyList.put("Marco", 2.5);
		moneyList.put("Laura", 3.4);
		moneyList.put("Giulia", 4.5);
		
	}	
		
		
		
		
		
		
		
	}


