package ejercicio09;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		Random rnd = new Random (System.nanoTime());
		int decimo, desde = 1,hasta = 99999, opcion;
		Sorteo s1; 
		
		System.out.println("//////////////////////////////////////////////////////");
		System.out.println("\tBienvenido a la loteria");
		System.out.println("//////////////////////////////////////////////////////");
		
		do {
			
			System.out.println("""
					1-Comprar un décimo elegido por usted
					2-Comprar un décimo generado aleatoriamente
					0-Salir
					""");
			opcion = Leer.datoInt();
			
			switch (opcion) {
				case 1:
					
					System.out.println("Diga el número del décimo que desea.");
					decimo = Leer.datoInt();
					while (decimo < 1 || decimo > 99999) {
						System.out.println("Diga un número válido");
						decimo = Leer.datoInt();
					}
					//No hay que meterle sysos en ningun caso a ningun metodo que no sirva para mostrar algo
					//Es preferible poner el if en el main o hacer un metodo que pase boleanos y despues enlazarlo 
					//con 
					s1 = new Sorteo(decimo);
					
					System.out.println("Se procede a realizar el sorteo.");
					
					s1.mostrarSorteo(hasta, desde);
					s1.mostrarGanador(hasta,desde);
				break;
				
				case 2 : 
					decimo = rnd.nextInt(hasta-desde+1)+desde;
					
					s1 = new Sorteo(decimo);
					s1.generarDecimoAleatorio(hasta, desde);
					s1.mostrarDecimoAleatorio(hasta, desde);
					
					System.out.println("Se procede a realizar el sorteo.");
					
					s1.mostrarSorteo(hasta, desde);
					s1.mostrarGanador(hasta, desde);
				break;
				
				case 0:
					System.out.println("GRACIAS POR USAR EL PROGRAMA");
					break;
					
				default:
					System.out.println("Inserte un dato válido");
				break;
			}			

		} while (opcion!=0);
	}

}