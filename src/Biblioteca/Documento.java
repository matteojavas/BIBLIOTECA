package Biblioteca;
import java.util.Date;
import java.util.LinkedList;


public class Documento {
	
	String Codice;
	String Titolo;
	int Anno;
	String Settore;
	String Stato;
	LinkedList<Prestito>listaPrestitiDoc;
	DVD dvd;
	Libro libro;
	Scaffale scaffale;

	 
	public Documento ( String c, String t, int a,String s,String st) {
		this.Codice = c;
		this.Titolo =t;
		this.Anno = a;
		this.Settore = s;
		this.Stato = st;
	}
		@Override
	public String toString() {
		return "Documento [Codice=" + Codice + ", Titolo=" + Titolo + ", Anno=" + Anno + ", Settore=" + Settore
				+ ", Stato=" + Stato + "]";
	}

public void AddPrestito (Prestito prestito) {

}

}
