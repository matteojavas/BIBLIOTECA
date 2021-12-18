package Biblioteca;

public class Libro {

	int NumeroPagine;

	
public Libro(int NP) { 
	this.NumeroPagine = NP;
	
}


@Override
public String toString() {
	return "Libro [NumeroPagine=" + NumeroPagine + "]";
}


}
