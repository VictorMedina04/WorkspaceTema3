package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		String nombre, aula, fecha;
		Cabecera cabecera1;
		
		
		
		System.out.println("Diga la fecha del día de hoy en formato DD-MM-AAAA");
		fecha = Leer.dato();
		
		System.out.println("Diga la asignatura");
		nombre = Leer.dato();
		
		System.out.println("Diga el aula en que se realizará la prueba");
		aula = Leer.dato();
		
		cabecera1 = new Cabecera (fecha, nombre, aula);
		
		cabecera1.mostrarCabecera();
		
	}
}