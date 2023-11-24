package ejemploarraybidim02;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int fil, col, hasta, desde, valor;
		int [] [] tabla;
		
		Random rnd = new Random (System.nanoTime());
		
		//Hay que poner primero filas despues columnas y si quiero meter randoms primero desde y despues hasta
				
		System.out.println("Cuantas filas quiere");
		fil = Leer.datoInt();
		
		System.out.println("Cuantas columnas quiere");
		col = Leer.datoInt();
		
		System.out.println("Desde que numero quiere que empiece el array");
		desde = Leer.datoInt();
		
		System.out.println("Hasta que numero quiere que pueda tener el array");
		hasta = Leer.datoInt();
		
		tabla = new int [fil][col];
		
		//Rellenar un array bidimensional
		
		for (int i = 0; i < tabla.length; i++) {
			
			for (int j = 0; j < tabla[i].length; j++) {
				
				tabla [i][j] = rnd.nextInt(hasta-desde+1)+desde;
			}
		}
		for (int i = 0; i < tabla.length; i++) {
			
			for (int j = 0; j < tabla[i].length; j++) {
				
				System.out.print(tabla [i][j]+"\t");
			}
			System.out.println();
		}
		
		//Cambiar el valor de una fila y columna
		
		System.out.println("Diga la fila a cambiar");
		fil = Leer.datoInt()-1;
		
		System.out.println("Diga la columna");
		col = Leer.datoInt()-1;
		
		System.out.println("Introduzca el nuevo valor");
		valor = Leer.datoInt();
		
		tabla[fil][col] = valor;
		
		for (int i = 0; i < tabla.length; i++) {
			
			for (int j = 0; j < tabla[i].length; j++) {
				
				System.out.print(tabla[i][j]+"\t");
			}
			
			System.out.println();
		}
	}
}