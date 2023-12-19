package ejercicio;

import utilidades.Leer;

public class Principal {
	public static void main(String[] args) {

		String apellido, nombre;
		int dorsal = 0, categoria, opcion, tam, numCorredores;
		double tiempoCorredor, kilometros;

		Corredor corredor;
		Corredor[] corredores;

		System.out.println("Cuántos corredores tiene la carrera");
		numCorredores = Leer.datoInt();
		corredores = new Corredor[numCorredores];
		System.out.println("Cuantos kilometros tiene la carrera");
		kilometros = Leer.datoDouble();

		Carrera carrera = new Carrera(corredores, numCorredores, kilometros);

		do {
			System.out.println("""
					1-Agregar un corredor
					2-Tiempo del corredor en segundos
					""");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduzca el nombre del corredor");
				nombre = Leer.dato();
				System.out.println("Introduzca el apellido del corredor");
				apellido = Leer.dato();
				System.out.println("Introduzca la categoria del corredor");
				System.out.println(" 1-Juvenil 2-Senior 3-Veterano");
				categoria = Leer.datoInt();

				while (categoria == 1 || categoria == 2 || categoria == 3) {
					System.out.println("Introduzca la categoria del corredor");
					System.out.println(" 1-Juvenil 2-Senior 3-Veterano");
					categoria = Leer.datoInt();
				}
				System.out.println("Cuanto ha tardado el corredor en terminar la carrera");
				tiempoCorredor = Leer.datoDouble();
				corredor = new Corredor(nombre, apellido, dorsal, categoria, tiempoCorredor);
				carrera.agregarCorredor(corredor);
				dorsal++;

				for (int i = 0; i < corredores.length; i++) {
					System.out.println(corredores[i]);
				}

				break;
			case 2:

				break;
			}
		} while (opcion != 0);
	}
}
