package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int numero;
		String frase;
		Copiado frase1;
		System.out.println("Que frase tiene que repetir");
		frase = Leer.dato();
		
		System.out.println("Diga cuentas veces quiere que se repita");
		numero = Leer.datoInt();
		
		frase1 = new Copiado(numero,frase);
		
		frase1.mostrarFrase();
		
	}

}
