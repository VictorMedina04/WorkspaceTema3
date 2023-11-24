package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int opcion, opcion2, hasta, desde, tamañoPrimitiva = 6, numero, valorUsusario, opcion3;
		Generadora g = new Generadora();

		System.out.println("///////////////////////////////////////////");
		System.out.println("Bienvenido al programa para elegir un sorteo");
		System.out.println("///////////////////////////////////////////");

		do {
			System.out.println("""
					1-Quiniela
					2-PareNone
					3-Primitiva
					0-Salir
					///////////////////////////////////////////
					""");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				do {
					System.out.println("""
							1-Jugar quiniela
							0-Salir al menu
							///////////////////////////////////////////
							""");
					opcion2 = Leer.datoInt();
					switch (opcion2) {
					case 1:

						System.out.println("Ha entrado en el sorteo de la quiniela");

						System.out.println("Seleccione 1-Local 2-Empate 3-Visitante");
						numero = Leer.datoInt();
						System.out.println("///////////////////////////////////////////");
						g.generarQuiniela();
						g.mostrarQui(numero);

						break;
					}
				} while (opcion2 != 0);
				break;
			case 2:
				do {

					System.out.println("""
							1-Jugar pares o Nones
							0-Salir al menu
							""");
					opcion2 = Leer.datoInt();

					switch (opcion2) {
					case 1:
						System.out.println("Ha entrado al juego de pares o nones");

						desde = 0;
						hasta = 10;

						System.out.println("¿Que quiere pares(pulsa 2) o nones(pulsa 1)?");
						opcion3 = Leer.datoInt();

						System.out.println("Indique el número que quiere sacar de 0 a 10");
						valorUsusario = Leer.datoInt();

						int valorGeneradoMaquina = g.generarNones(desde, hasta);
						g.mostrarNones(valorGeneradoMaquina);

						boolean esPar = g.calcularSumaEsPar(valorUsusario, valorGeneradoMaquina);

						String ganador = g.calcularGanador(esPar, opcion3);

						g.mostrarGanadoresParesNones(ganador);

						break;
					}
				} while (opcion2 != 0);
				break;
				
			case 3:

				do {
					System.out.println("""
							1-Continuar
							0-Salir al menu
							""");

					opcion2 = Leer.datoInt();

					switch (opcion2) {

					case 1:
						System.out.println("Ha entrado en el sorteo de la primitiva");

						System.out.println("¿Desde que número empieza la primitiva?");
						desde = Leer.datoInt();

						System.out.println("¿Hasta que número es la primitiva?");
						hasta = Leer.datoInt();

						System.out.println("Sus números son:");
						for (int i = 0; i < tamañoPrimitiva; i++) {

							g.mostrarPrimitiva(desde, hasta);
						}
						break;
					}
				} while (opcion2 != 0);
				break;
			}
		} while (opcion != 0);
	}
}