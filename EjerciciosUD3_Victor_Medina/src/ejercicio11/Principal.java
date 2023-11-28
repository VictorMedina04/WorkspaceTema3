package ejercicio11;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		/*.Crear un programa para poner las notas de un alumno (clase Alumno con atributos). Los atributos de un
		alumno son su nombre, curso, un array de notas, número de suspensos y nota media.
		En una clase GestionNotas, el programa debe poder poner notas a un solo alumno, mostrar todas sus notas por
		pantalla, modificar una nota, calcular la media y dar su número de suspensos.
		Probar todo en la clase Principal.
		*/
		int nota, asignatura, tam =5, posicion;
		String nombre, curso;
		double nuevoValor;
		double []notas;
		Alumno a;
		GestionNotas g = new GestionNotas();
		
		System.out.println("Rellene los datos del alumno");
		System.out.println("Introduzca el nombre");
		nombre = Leer.dato();
		System.out.println("Introduzca el curso");
		curso = Leer.dato();
		System.out.println("¿Cuántas asignaturas tiene el alumno?");
		tam = Leer.datoInt();
		
		notas = new double [tam];
		
		//Poner notas
		System.out.println("Introduzca la nota que quiere meter");
		nota = Leer.datoInt();
		System.out.println("Introduzca en que asignatura quiere meterlo");
		System.out.println("""
				1-Programacion
				2-Base de Datos
				3-LMSGI
				4-Entorno
				5-FOL
				""");
		asignatura = Leer.datoInt()-1;
		g.ponerNotas(notas, nota, asignatura);
		
		//Mostrar notas
		g.mostrarNotas(notas);
		
		//Modificar una nota
		System.out.println("Que nota quiere modificar");
		posicion = Leer.datoInt();
		
		System.out.println("Introduzca el valor de la nueva nota");
		nuevoValor = Leer.datoDouble();
		
		
	}

}
