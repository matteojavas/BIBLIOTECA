package Biblioteca;

import java.util.LinkedList;


public class Persona {
	String nome;
	String cognome;
	Utente utente;
	LinkedList<Prestito> listaPrestiti;
	

	
	public Persona ( String n, String c, Utente u, LinkedList<Prestito> p) {
		this.nome = n;
		this.cognome = c;
		this.utente = u;
		this.listaPrestiti = p;
	

	}
	public void AddUtente(Utente utente) {
		
	}
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", utente=" + utente + "]";
	}

	


	}




