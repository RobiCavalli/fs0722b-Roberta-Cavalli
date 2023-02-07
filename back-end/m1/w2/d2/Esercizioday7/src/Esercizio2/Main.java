package Esercizio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("definsici un numero per creare una lista");
	        int lista= sc.nextInt();

	        List<Integer> l = new ArrayList<Integer>();

	        for(int i = 0; i<lista ; i++) {
	            int rand1 = (int)(Math.random() * 100);
	            l.add(rand1);
	        }

	        System.out.println(l);
	    }

}


