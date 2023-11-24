package ejercicio06;

import java.util.Random;

public class Generadora {

	public int generarNum(int desde, int hasta) {
		int num = 0;
		Random rnd = new Random(System.nanoTime());
		num = rnd.nextInt(hasta - desde + 1) + desde;

		return num;
	}

	// Primitiva
	public int generarPrimitiva(int desde, int hasta) {
		int num = 0;
		num = generarNum(desde, hasta);
		return num;
	}

	public void mostrarPrimitiva(int desde, int hasta) {

		System.out.println(" " + generarPrimitiva(desde, hasta));

	}

	// ParesNones
	public int generarNones(int desde, int hasta) {
		int num = 0;
		num = generarNum(desde, hasta);
		return num;
	}

	public void mostrarNones(int valorGeneradoMaquina) {
		System.out.println("La maquina saca " + valorGeneradoMaquina);
	}

	public boolean calcularSumaEsPar(int valorUsusario, int valorGeneradoMaquina) {
		boolean result;
		result = (valorUsusario + valorGeneradoMaquina) % 2 == 0;
		return result;
	}

	public String calcularGanador(boolean esPar, int opcion3) {
		int usuarioEligePares = 2;
		if (usuarioEligePares == opcion3) {
			if (esPar)
				return "el usuario";
			else
				return "la maquina";
		} else {
			if (esPar)
				return "la maquina";
			else
				return "el usuario";
		}

//		if ((usuarioEligePares == opcion3 && esPar) || (usuarioEligePares != opcion3 && !esPar)) {
//			return "el usuario";
//		} else
//			return "la maquina";

	}

	public void mostrarGanadoresParesNones(String ganador) {

		System.out.println("El ganador es " + ganador);
	}

	// Quiniela
	public void seleccionarQuiniela(int numero) {
		int uno = 1;
		int dos = 2;
		int tres = 3;
		if (numero == uno) {

			System.out.println("Ha seleccionado que gana el equipo local");
		}
		if (numero == dos) {
			System.out.println("Ha seleccionado que empatan los equipos");
		}
		if (numero == tres) {
			System.out.println("Ha seleccionado que gana el equipo visitante");
		}
	}

	public int generarQuiniela() {
		int desde = 1;
		int hasta = 3;
		int num = 0;
		num = generarNum(desde, hasta);
		return num;
	}

	public void mostrarQui(int numero) {
		int num = generarQuiniela();
		if (numero == num) {
			System.out.println("Usted ha ganado");
		} else {
			System.out.println("Usted ha perdido");
		}
	}
}