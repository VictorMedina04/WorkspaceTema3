package ejercicio;

import utilidades.Leer;

public class Principal {
	public static void main(String[] args) {

		String apellido, nombre;
		int dorsal = 0, categoria, opcion, tam, numeroCorredores = 0;
		double tiempoCorredor, kilometros, factorConversion;

		Corredor corredor;
		Corredor[] corredores;

		System.out.println("Cuántos corredores tiene la carrera");
		tam = Leer.datoInt();
		corredores = new Corredor[tam];
		System.out.println("Cuantos kilometros tiene la carrera");
		kilometros = Leer.datoDouble();

		Carrera carrera = new Carrera(corredores, numeroCorredores, kilometros);

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
				while (categoria != 1 && categoria != 2 && categoria != 3) {
					System.out.println("Introduzca la categoria correcta");
					System.out.println(" 1-Juvenil 2-Senior 3-Veterano");
					categoria = Leer.datoInt();
				}
				System.out.println("Cuanto ha tardado el corredor en terminar la carrera");
				tiempoCorredor = Leer.datoDouble();
				corredor = new Corredor(nombre, apellido, dorsal, categoria, tiempoCorredor);
				carrera.agregarCorredor(corredor);
				dorsal++;
				carrera.mostrarArray(corredores);
				break;
			case 2:
				System.out.println("¿Cuánto es el factor de conversión?");
				factorConversion = Leer.datoDouble();
				System.out.println("¿Cuál es el dorsal del corredor?");
				dorsal = Leer.datoInt();

				System.out.printf("El tiempo en segundos del corredor es: %.2f segundos \n",
						carrera.calcularTiempoSegundos(dorsal, factorConversion));
				break;
			}
		} while (opcion != 0);
	}
}
