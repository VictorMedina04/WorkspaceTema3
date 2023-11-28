package ejercicio11;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		/*.Crear un programa para poner las notas de un alumno (clase Alumno con atributos). Los atributos de un
		alumno son su nombre, curso, un array de notas, número de suspensos y nota media.
		En una clase GestionNotas, 
		
		el programa debe poder poner notas a un solo alumno, 
		mostrar todas sus notas por pantalla, 
		modificar una nota, 
		calcular la media y 
		dar su número de suspensos.
		Probar todo en la clase Principal.
		*/
		int nota, asignatura, tam = 7, posicion, opcion, numeroSuspensos = 0;
		String nombre;
		double nuevoValor, media = 0;
		double []notas = new double[tam];
		Alumno a;
		GestionNotas g = new GestionNotas();
		
		System.out.println("-Ha entrado en el programa de notas de 1ºDam");
		System.out.println("Introduzca el nombre");
		nombre = Leer.dato();
		do {
			System.out.println("""
					1-Poner notas
					2-Mostrar las notas del alumno
					3-Cambiar notas
					4-Mostrar la media del alumno
					5-Mostrar número de suspensos del alumno
					0-Salir
					""");
			opcion = Leer.datoInt();
			switch(opcion) {
				case 1:
					System.out.println("Introduzca en que asignatura quiere asignarla");
					System.out.println("""
								1-Programacion
								2-Base de Datos
								3-LMSGI
								4-Entornos de Desarrollo
								5-FOL
								6-Sistemas de información
								7-FOP
								""");
					asignatura = Leer.datoInt()-1;
					System.out.println("Introduzca la nota que quiere asignar");
					nota = Leer.datoInt();
					g.ponerNotas(notas, nota, asignatura);
				break;
				case 2:
					g.mostrarNotas(notas);
				break;
				case 3:
					System.out.println("Que nota quiere modificar ");
					System.out.println("""
							1-Programacion
							2-Base de Datos
							3-LMSGI
							4-Entornos de Desarrollo
							5-FOL
							6-Sistemas de información
							7-FOP
							""");
					posicion = Leer.datoInt();
					
					System.out.println("Introduzca el valor de la nueva nota");
					nuevoValor = Leer.datoDouble();
					
					g.modificarNota(notas, posicion, nuevoValor);										
				break;
				case 4:
					g.calcularMedia(notas, media);
					g.mostrarMedia(notas, media);
				break;
				case 5:
					g.mostrarSuspensos(notas, numeroSuspensos);	
				break;
				default:
					System.out.println("Ópcion incorrecta, introduzca una que sea posible");
				break;
				case 0:
					System.out.println("Grácias por usar el programa");
				break;
			}
				
		}while(opcion != 0);			
	}

}
