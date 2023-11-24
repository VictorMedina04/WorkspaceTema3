package ejercicio07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		Caracruz m = new Caracruz();
		int eleccion;
		int num;
		int opcion;
		
		System.out.println("Bienvenido al programa para jugara a cara o cruz");
		
		do {
			System.out.println("""
					1- Para jugar
					0-Para salir
					""");
			opcion = Leer.datoInt();
			switch(opcion) {
				case 1:
					
					System.out.println("Su oponente seré yo");
					System.out.println("Elija 1-Cara o 2-Cruz");
					eleccion = Leer.datoInt();
					
					num = m.generarMoneda();
					m.lanzarMoneda(eleccion, num);
					m.mostrarMoneda(eleccion, num);
			}
		}while(opcion!=0);		
	}

}