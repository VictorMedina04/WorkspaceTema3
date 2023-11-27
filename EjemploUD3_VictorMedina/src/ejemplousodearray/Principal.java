package ejemplousodearray;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int hasta,desde, tam;
		int lista1[];
		Listas l1;
		
		l1 = new Listas();
		System.out.println("Diga el tamaño");
		tam = Leer.datoInt();
		
		lista1 = new int [tam];
		
		System.out.println("¿Desde?");
		desde = Leer.datoInt();
		System.out.println("¿Hasta?");
		hasta = Leer.datoInt();
		
		
		l1.rellenarAleatorio(desde, hasta, lista1, tam);		
		
		l1.mostrarArray(lista1);
		
		l1.trucarLista(lista1);
		l1.mostrarArray(lista1);
	}

}
