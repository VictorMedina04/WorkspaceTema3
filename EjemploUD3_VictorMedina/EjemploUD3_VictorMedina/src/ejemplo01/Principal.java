package ejemplo01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		String nombre;
		int edad;
		double notaMedia;
		Alumno a1;
		Alumno a2;
		
		//Instaciar objetos
			
		System.out.println("Diga el nombre");
		nombre = Leer.dato();
		System.out.println("Diga edad");
		edad = Leer.datoInt();
		System.out.println("Diga nota media");
		notaMedia=Leer.datoDouble();
		
		//No se inicia aqui se hace arriba 
		a1 = new Alumno(nombre, edad, notaMedia);
		
		System.out.println(a1.nombre);
		System.out.println(a1.edad);
		System.out.println(a1.notaMedia);
		
		System.out.println("-------------------------");
		
		System.out.println("Diga el nombre");
		nombre = Leer.dato();
		System.out.println("Diga edad");
		edad = Leer.datoInt();
		System.out.println("Diga nota media");
		notaMedia=Leer.datoDouble();
		
		a2 = new Alumno(nombre, edad, notaMedia);
		
		a1 = new Alumno ();
		a2 = new Alumno ();
		
	}

}
