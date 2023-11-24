package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		double altura, radio, volumen;
		Cilindro cilindro1;
		System.out.println("///////////////////////////////////////////////////////////////////");
		System.out.println("Bienvenido al programa para calcular el volumen de un cilindro");
		System.out.println("///////////////////////////////////////////////////////////////////");
		
		System.out.println("Introduzca la altura de su cilindro");
		altura = Leer.datoDouble();
		
		System.out.println("Introduzca el radio de su cilindro");
		radio = Leer.datoDouble();
		
		cilindro1 = new Cilindro(radio,altura);
		
		volumen = cilindro1.calcularVolumen();
		
		System.out.printf("El volumen de su cilindro es: %.2f",volumen);
		
	}

}
