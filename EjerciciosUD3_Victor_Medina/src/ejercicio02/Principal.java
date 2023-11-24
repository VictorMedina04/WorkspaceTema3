package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		Double radio, area;
		Circulo circulo1;
		
		System.out.println("////////////////////////////////////////////////////////////////////////");
		System.out.println("\tBienvenido al programa para calcular el area de un circulo");
		System.out.println("////////////////////////////////////////////////////////////////////////");
		System.out.println("Diga el radio del círculo en cm");
		radio = Leer.datoDouble();
		
		circulo1 = new Circulo (radio);
		
		area= circulo1.calcularArea();
		
		System.out.printf("El área del círculo será %.2f cm^2",area);
	}

}