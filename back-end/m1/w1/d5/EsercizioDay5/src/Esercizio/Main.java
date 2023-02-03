package Esercizio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("titolo:");
     String titolo = sc.nextLine();
     System.out.println("volume:");
     int volume = sc.nextInt();
     System.out.println("durata:");
     int durata = sc.nextInt();
     System.out.println("luminosità:");
     int luminosità = sc.nextInt();
     
     System.out.println("Quale elemento vuoi ? :");
     int lettore= sc.nextInt();
    
     RegistrazioneAudio Audio = new RegistrazioneAudio( titolo, volume, durata);
     Audio.Play();
     
     Video Video1 = new Video( titolo, durata, volume, luminosità);
     Video1.Lumus();
     
     Immagine Immagine1 = new Immagine( titolo, luminosità);
     Immagine1.Show();

 	ELementoMultimediale[] multimediale = new ELementoMultimediale[4];
 	multimediale[0]= Immagine1;
 	multimediale[1]= Video1;
 	multimediale[2]= Audio;
 	multimediale[3]= Immagine1;
 	
 	 /*switch( lettore) {
 	   case 0:{
 	   
 		   System.out.print(multimediale[0]);
 		   break;
 	   }
	}*/
	
	
	
  
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
   
}
