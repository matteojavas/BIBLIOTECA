package Biblioteca;

import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class Test {
	

	public static void main(String[] args) {
    LinkedList<Persona>listaPersona = new LinkedList<Persona>();///creato lista persone e inizializzata per inserigli le persone
    
    Scanner tastiera = new Scanner(System.in);
    System.out.println("inserisci nome: ");
    
    String nomeSelezionato =  tastiera.next();
    
    System.out.println("inserisci cognome: ");
    String cognomeSelezionato =tastiera.next();
   

     
		Documento documento1 = new Documento("", "", 0, "", "");
		Persona persona1 = new Persona("matteo","pastore",null,new LinkedList());
		Persona persona2 = new Persona("Giuseppe", "Bruno",null,new LinkedList());
		Persona persona3 = new Persona("Vincenzo", "DeRose",null,new LinkedList());
		DVD dvd1 = new DVD(111);
		DVD dvd2 = new DVD(222);
		DVD dvd3 = new DVD(333);
		DVD dvd4 = new DVD(444);
		Libro libro1 = new Libro(400);
		Libro libro2 = new Libro(500);
		Libro libro3 = new Libro(700);
		Libro libro4 = new Libro(800);
		Utente utente1 = new Utente(340151645, "matteo.p@gmail.com", "matteo.p");
		Utente utente2 = new Utente(333524548, "giuseppe.b@gmail.com", "giuseppe.p");
		Utente utente3 = new Utente(366987512,"vincenzo.d@gmail.com,","vincenzo.d");
		Scaffale scaffale1 = new Scaffale("A");
		Scaffale scaffale2 = new Scaffale("B");
		Scaffale scaffale3 = new Scaffale("C");
		Scaffale scaffale4 = new Scaffale("D");
		Prestito prestito1 = new Prestito("1515c", new Date(12/12/2020), new Date(30/12/2020));
		Prestito prestito2 = new Prestito("1625a", new Date(20/04/2020), new Date(28/04/2020));
		Prestito prestito3 = new Prestito("1784c", new Date(01/05/2020), new Date(17/05/2020));
		persona1.utente = utente1;
		persona2.utente = utente2;
		persona1.listaPrestiti.add(prestito1);
		persona1.listaPrestiti.add(prestito3);
		persona1.listaPrestiti.add(prestito2);
		persona2.listaPrestiti.add(prestito3);
		persona2.listaPrestiti.add(prestito1);
		persona3.listaPrestiti.add(prestito3);
		persona3.listaPrestiti.add(prestito2);
		listaPersona.add(persona3);
		listaPersona.add(persona1);
		listaPersona.add(persona2);
		
       for(Persona  p :listaPersona) {

    	   if (nomeSelezionato.equalsIgnoreCase(nomeSelezionato) && cognomeSelezionato.equalsIgnoreCase(cognomeSelezionato) ) { // per le stringe == non funziona si usa equals
       		
    		   System.out.println(p.listaPrestiti);
    		   
    	   }
    	   
       }
		
	
	}

}
