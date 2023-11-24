package ejemploarray02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int [] edades;
		int tam ,suma = 0 ,opcion;
		System.out.println("Diga el tamaño");
		tam=Leer.datoInt();
		
		edades = new int [tam];
		
		//Una vez dado el tamaño del array no cambia a lo largo del programa y la variable tam es una variable que usamos para el tamaño pero no sirve para el for hay que poner nombrearray.length
		
		//Rellenar
		for (int i = 0; i < edades.length; i++) {
			
			System.out.println("Diga una edad para guardar");
			edades [i] = Leer.datoInt();
		}
		
		//Mostrar
		for (int i = 0; i < edades.length; i++) {
			System.out.println(i+1+"La edad es:"+edades [i]);
		}
		
		//Sumar todos los elementos
		for (int i = 0; i < edades.length; i++) {
			
			suma = edades[i]+suma; 
		}
		System.out.println(suma);
	
		//Mostrar elemento
		System.out.println("Diga la posicion a mostrar");
		opcion = Leer.datoInt()-1;
		System.out.println(edades [opcion]);
		
		//Modificar un valor elegido por el usuario
		
		System.out.println("Diga donde guardar el nuevo valor");
		opcion=Leer.datoInt()-1;
		System.out.println("Diga nueva edad");
		edades[opcion]=Leer.datoInt();
		
	}

}