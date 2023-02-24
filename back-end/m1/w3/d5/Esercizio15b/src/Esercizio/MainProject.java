package Esercizio;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.xml.catalog.Catalog;

public class MainProject {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Esercizio15b");
	static EntityManager em =emf.createEntityManager();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utente u =new Utente();
		u.setNome("Mario");
		u.setCognome("ROssi");
		u.setDatanascita(LocalDate.now());
		//aggiungiUtente(u);
		
		Prestito p= new Prestito();
		p.setElementoprestato(0);
		p.setInizioprestito(LocalDate.now());
		p.setRestituzioneffettiva(LocalDate.now());
		p.setRestituzioneprevista(LocalDate.now());
		
		Libri l1 = new Libri();
		l1.setTitolo("HarryPotter");
		l1.setAutore("Rowling");
	    l1.setGenere("Fantasy");
	    l1.setAnnopubblicazione(1994);
	   
	    Libri l2 = new Libri();
		l2.setTitolo("Signore degli Anelli");
		l2.setAutore("Tolkien");
	    l2.setGenere("Fantasy");
	    l2.setAnnopubblicazione(1994);
	    
	    Libri l3 = new Libri();
		l3.setTitolo("Piccolo principe");
		l3.setAutore("Saint-Exupery");
	    l3.setGenere("Avventura");
	    
	    Riviste r1 = new Riviste();
	    r1.setTitolo("Focus");
	    r1.setPeriodicita(Periodicita.SETTIMANALE);
	    
	    Riviste r2 = new Riviste();
	    r2.setTitolo("NewYorker");
	    r2.setPeriodicita(Periodicita.MENSILE);
	    
	    Riviste r3 = new Riviste();
		r3.setTitolo("Vouge");
		r2.setPeriodicita(Periodicita.SETTIMANALE);
	    
	    aggiungiCatalogo1(l1);
	    aggiungiPrestito(p);
	    //rimozione(2);
	    ricercaisbn(1);
	    //Mi fa impostare null di default perchè query da errore
	    Query query = null;
		List risultato = query.getResultList();
	    
	}
   
	
	private static void aggiungiUtente(Utente u ) {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		System.out.println("Utente aggiunto nel db");
	}
	
	private static void aggiungiPrestito(Prestito p ) {
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		System.out.println("Prestito aggiunto nel db");
	}
	
	
	private static void aggiungiCatalogo1(Catalogo l1) {
		em.getTransaction().begin();
		em.persist(l1);
		em.getTransaction().commit();
		System.out.println("Elemento del catalogo-libro aggiunto nel db");
	}
	
	private static void rimozione(Integer id){
		em.getTransaction().begin();
		Libri f=em.find(Libri.class, id);
		em.remove(f);
		em.getTransaction().commit();
		System.out.println("Elemento rimosso  by ISBN");
	}
	
	public static void  ricercaisbn (Integer id) {
		em.getTransaction().begin();
		Catalogo c1 = em.find(Catalogo.class, id);
		em.getTransaction().commit();
		System.out.println("Elemento trovato by Id "  + c1);
	
	}
	
	public static void leggidato(String autore) {
	try {
		Query querySelect = em.createQuery("SELECT libri FROM catologo libri");
		List<Catalogo> resultList = querySelect.getResultList();
		em.getTransaction().begin();
		
		Query queryUpdate = em.createQuery("UPDATE  catalogo Libri SET titolo = :titolo WHERE Libri.titolo =:titolo");
	    queryUpdate.setParameter( "titolo","HarryPotter");
	    int numeroEntitaAggiornate= queryUpdate.executeUpdate();
	
	}finally {
		em.close();
	}
    
	}

		
		
		
		
	}
	
	
	
	
	

