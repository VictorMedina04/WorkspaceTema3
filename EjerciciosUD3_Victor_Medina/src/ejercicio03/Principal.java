package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int num, dos=2, cero=0;
		Operaciones op1, op2;	
		
		System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("\tBienvenido al programa para calcular si es par o impar y negativo o positivo");
		System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////");
		
		System.out.println("Diga número para comprobar si es par o impar");
		num = Leer.datoInt();
		
		op1 = new Operaciones ();
		
		op1.mostrarParOImpar(num, dos);
		
		System.out.println("Diga número para comprobar si es positivo o negativo");
		num = Leer.datoInt();
		
		op2 = new Operaciones ();

		op2.mostrarPositivoONegativo(num, cero);	
	}
}
