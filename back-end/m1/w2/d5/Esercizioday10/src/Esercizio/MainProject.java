package Esercizio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class MainProject {
static List<Catalogo> archivio =  new ArrayList<Catalogo>();
	public static void main(String[] args) {
	
		    
		    Libri libro1= new Libri("uno","Il gatto con gli stivali", 1995,120,"Charles Perrault","Fantasy");	
		    archivio.add(libro1);
		    Libri libro2 = new Libri("due","Il signore degli anelli", 1990, 220,"Tolkien ","Fantasy");
		    archivio.add(libro2);
		    Riviste Riviste1= new Riviste("tre","NewYorker", 1998, 110,Periodicità.MENSILE);
		    archivio.add(Riviste1);
		    Riviste Riviste2= new Riviste("quattro","Vougue", 1990, 115, Periodicità.SETTIMANALE);
		    archivio.add(Riviste2);
		    System.out.println( "Il catalogo :" + archivio);
     
	AggiuntaElemento("cinque","HarryPotter",1996,120,"Perrault","Fantasy");	    
	AggiuntaElemento("sei","Codegrind", 1997, 120,Periodicità.SETTIMANALE);
	RicercaElemento("cinque", archivio);
	RimuoviElemento( archivio, Riviste1);
	System.out.println(RicercaAnno(archivio, 1990));
	}
	
	
	//AggiuntaElemento

	 public static void AggiuntaElemento(String iSBN, String titolo, int annoPubblicazione, int numeroPagine , String autore, String genere) {
	    	Libri libro1= new Libri(iSBN, titolo, annoPubblicazione, numeroPagine, autore , genere);	
	    	archivio.add(libro1);
	    	System.out.println("Ho aggiunto un libro " + libro1.getTitolo());
	 }
	 
	 public static void AggiuntaElemento(String iSBN, String titolo, int annoPubblicazione, int numeroPagine, Periodicità Periodicità) {
		    Riviste Riviste1= new Riviste(iSBN, titolo, annoPubblicazione, numeroPagine, Periodicità);
	    	archivio.add(Riviste1);
	    	System.out.println("Ho aggiunto una rivista " + Riviste1.getTitolo());
	 }
	 
	 public static void RimuoviElemento(List<Catalogo> archivio, Riviste riviste2) {
	    	archivio.remove(archivio);
	    	
	    	//System.out.println(archivio);
	 }
	 
	//RIcerca per ISBN
	 public static void RicercaElemento (String isBN ,  List archivio) {
	    	List<Catalogo> risultato =(List<Catalogo>) archivio.stream().filter(x -> ((Catalogo) x).getISBN().equalsIgnoreCase(isBN)).collect(Collectors.toList());
			System.out.println(risultato);
	   
	  }

	
	//RIceca per AUTORE
    public static List<Catalogo> RicercaAnno( List<Catalogo> list, int a) {
    return list.stream().filter(e ->e.getAnnoPubblicazione()== a).collect(Collectors.toList());
	

}}
	 

	

	

	


