package ejemplodowhile;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int num=1,tope;
		
		System.out.println("Introduzca un número tope");
		tope=Leer.datoInt();
		
		do {
			
			System.out.println(num++);
			
		}while(num<=tope);
		
		System.out.println("Continue");
		
		/*
		do {
			System.out.println("Introduzca un número");
			
		}while();
		
		*/
	}

}
