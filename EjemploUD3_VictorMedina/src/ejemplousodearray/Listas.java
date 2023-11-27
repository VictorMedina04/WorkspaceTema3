package ejemplousodearray;

import java.util.Random;

public class Listas {
	
	public void rellenarAleatorio(int desde, int hasta, int lista1 [], int tam) {
		
		Random rnd = new Random (System.nanoTime());
		
		for (int i = 0; i < lista1.length; i++) {
			lista1[i] = rnd.nextInt(hasta-desde+1)+desde;
		}				
	}
	public void mostrarArray(int lista1[]  ) {
		for (int i = 0; i < lista1.length; i++) {
			System.out.print(" "+lista1[i]+"\t|");
		}
	}
	
	//Dos versiones
	//Pasando la lista
	public int [] trucarLista(int lista1[]) {
		int diez =10;
		for (int i = 0; i < lista1.length; i++) {
			lista1[i] = diez;
		}
		
		return lista1;
	}
	//Dos versiones
	//Instanciando en el metodo
}
