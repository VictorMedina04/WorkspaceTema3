package ejemploarraybidimensional;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int fil , col ;
		int [] [] tabla;
		
		//Forma de rellenar y representar un array bidimensional
		
		System.out.println("Cuantas filas quiere");
		fil = Leer.datoInt();
		System.out.println("Cuantas columnas quiere");
		col = Leer.datoInt();
		
		tabla = new int [fil][col];
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla [i][j] = 6;
			}
		}
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				System.out.print(tabla [i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}