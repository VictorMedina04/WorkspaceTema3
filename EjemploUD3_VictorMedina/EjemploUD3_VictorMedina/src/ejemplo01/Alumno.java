package ejemplo01;

public class Alumno {
	
	//Primero los atributos, nunca se inicializan valores
	
	String nombre;
	int edad;
	double notaMedia;
	
	//Constructores
	//Sirven para crear un objetos con valores
	 
	public Alumno(String nombre, int edad, double notaMedia) {
		
		//lo que hay dentro son parametos o argumentos
		this.nombre = nombre;
		this.edad = edad;
		this.notaMedia = notaMedia;
	}
	
	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Alumno() {
		
	}
	//Despues de declarar los atributo van los Metodos
	// publico/privado-tipo de devolucion-nombre-(parametros){cuerpo}
	
	//Los void son tipo de variable que esta 'vacio'
	public void mostrarDatos (String calle) {
		
		System.out.println("Los datos del alumno son:");
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+ edad);
		System.out.println("Nota Media: "+notaMedia);
	}
}
