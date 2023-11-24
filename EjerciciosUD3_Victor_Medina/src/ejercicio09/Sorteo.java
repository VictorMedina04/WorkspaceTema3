package ejercicio09;

import java.util.Random;

public class Sorteo {
	private int decimo;
	
	public Sorteo(int decimo) {
	
		this.decimo = decimo;
	}
	
	public int getDecimo() {
		return decimo;
	}

	public int generarNum (int hasta, int desde) {
		
		Random rnd = new Random (System.nanoTime());
		
		return rnd.nextInt(hasta-desde+1)+desde;
	}
	
	public void hacerSorteo(int hasta, int desde) {
		
		generarNum(hasta,  desde);
		
	}
	
	public int generarDecimoAleatorio(int hasta, int desde) {
		Random rnd = new Random (System.nanoTime());
		return rnd.nextInt(hasta-desde+1)+desde;
	}
	
	public void mostrarSorteo (int hasta, int desde) {
		
		System.out.println("El número ganador es "+generarNum( hasta, desde));
	}
	
	
	public boolean decirNumGanador (int hasta, int desde) {
		if (decimo == generarNum (hasta, desde) ) {
			return true;
			} else {
				return false;
			}
	}
	
	public void mostrarGanador (int hasta, int desde) {
		if (decirNumGanador (hasta, desde)){
			System.out.println("HAS GANADO EL PREMIO");
			System.out.println("///////////////////////////////");
		} else {
			System.out.println("Perdiste");
			System.out.println("///////////////////////////////");
		}
	}
	public void mostrarDecimoAleatorio (int hasta, int desde) {
		System.out.println("Su décimo generado aleatoriamente es "+generarDecimoAleatorio(hasta, desde));
		System.out.println("///////////////////////////////");
	}
}