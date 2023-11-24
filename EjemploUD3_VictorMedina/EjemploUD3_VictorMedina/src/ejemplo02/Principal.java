package ejemplo02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		String nombre;
		double notaPro,notaBD;
		Alumno a;
		double media;
		
		System.out.println("Diga el nombre");
		nombre = Leer.dato();
		System.out.println("Diga su nota de programacion");
		notaPro = Leer.datoDouble();
		System.out.println("Diga nota de base de datos");
		notaBD =Leer.datoDouble();
		
		a = new Alumno(nombre, notaPro, notaBD);
		
		media = a.calcularMedia();
		
		a.mostrarMedia(media);		
	}

}
