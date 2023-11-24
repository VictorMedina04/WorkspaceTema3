package ejemploarray01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int tamayo = 4 ,edadLeida ,posicion;
		//Primera forma
		int [] edades;
		edades = new int [tamayo];		
		
		//Seg Forma
		int [] edades2 = new int [tamayo];
		
		//Terc Forma
		int [] edades3 = { 20, 18, 21};
		
		//Guardar valores
		edades [2] = 18;
		
		System.out.println(edades[2]);
		
		System.out.println("Diga que edad tiene y donde guardarla");
		edadLeida=Leer.datoInt();
		posicion=Leer.datoInt()-1;
		System.out.println(edades [posicion] = edadLeida);
		
	}

}