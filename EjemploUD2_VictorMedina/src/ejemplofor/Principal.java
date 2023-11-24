package ejemplofor;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int tope;
		String palabra;
		
		System.out.println("¿Cuánto es el tope?");
		tope=Leer.datoInt();
		System.out.println("Introduzca la palabra que quiera escribir");
			palabra=Leer.dato();
			
		for(int i=0;i<tope;i++) {
			
			System.out.println(palabra);
		}

	}

}
