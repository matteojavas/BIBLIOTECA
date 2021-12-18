package Biblioteca;
import java.util.Date;

public class Prestito {
	
 String autore;
 Date dal;
 Date al;
 Persona persona;
 Documento documento;
 
 public Prestito (String a, Date dI, Date dF) {
	 this.autore = a;
	 this.dal = dI;
	 this.al = dF;
 }
 
 public void AddPersona(Persona persona) {
	}
 
@Override
public String toString() {
	return "Prestito [autore=" + autore + ", dal=" + dal + ", al=" + al + "]";
}
 

}
