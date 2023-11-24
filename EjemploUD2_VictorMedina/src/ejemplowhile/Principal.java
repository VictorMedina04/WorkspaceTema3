package ejemplowhile;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int numero,cero=0;
		
		System.out.println("Introduzca un numero");
		numero=Leer.datoInt();
		
		while(numero!=cero) {
			System.out.println(numero);
			System.out.println("Escriba otro numero");
			numero=Leer.datoInt();
		}
		System.out.println("FIN");
	}

}
