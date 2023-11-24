package ejemploaleatorios;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int valorDado = (int)Math.floor(Math.random()*6+1);
		int hasta,desde,resultado,tope;
		
		Random num= new Random (System.nanoTime());
		
		System.out.println("Introduzca desde que numero quiere que salga");
		desde=Leer.datoInt();
		System.out.println("Hasta que número quiere que salga");
		hasta=Leer.datoInt();
		System.out.println("Diga cuántos");
		tope=Leer.datoInt();
		
		for (int i=0; i<tope; i++) {
		
			resultado=num.nextInt(hasta-desde+1)+desde;
			System.out.println(resultado);
		}
	}

}