package ejercicio07;

import java.util.Random;

public class Caracruz {
	
	public int generarMoneda() {
		int desde = 1;
		int hasta = 2;
		int num;
		
		Random rnd = new Random (System.nanoTime());
		num = rnd.nextInt(hasta-desde+1)+desde;
		
		return num;
	}
	
	public boolean lanzarMoneda(int eleccion, int num) {
		boolean resultado;
		
		if( num == eleccion) {
			resultado = true;
		}
		else {
			resultado = false;
		}
		return resultado;
	}
	
	public void mostrarMoneda(int eleccion, int num) {
		boolean resultado= lanzarMoneda(eleccion,num);
		
		if(resultado) {
			System.out.println("Ha ganado");
		}
		else {
			System.out.println("Ha perdido");
		}
	}	
}