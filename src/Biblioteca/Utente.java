package Biblioteca;

public class Utente {
	
	int numero;
	String email;
	String password;
	
	public Utente(int n, String e, String p) {
	this.numero = n;
	this.email = e;
	this.password = p;
	}
	
		

	@Override
	public String toString() {
		return "Utente [numero=" + numero + ", email=" + email + ", password=" + password + "]";
	}
	
	
}
