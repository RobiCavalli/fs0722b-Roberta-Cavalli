package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainProject {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 try {
	     System.out.println("Inserire un numero");
		 int x = sc.nextInt();
		 
		 
		 System.out.println("Inserire un  secondo numero");
		 int y = sc.nextInt();
		 
		 int result = x/y;
		 
		 System.out.println("risultato " + result);
		 } catch ( ArithmeticException e) {
			 System.out.println("Non puoi dividere per 05");
		 }
		 
		catch(InputMismatchException e ) {
			System.out.println("Non puoi dividere per una stringa");
		}
		 catch(Exception e ) {
			 System.out.println("Stiamo risolvendo..");
		}finally {
			sc.close();
		}
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
}

}