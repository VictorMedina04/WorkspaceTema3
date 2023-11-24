package ejercicio01;

public class Cabecera {

	private String fecha;
	private String nombre;
	private String aula;
	
	
	public Cabecera () {
		
	}

	public Cabecera (String fecha, String nombre, String aula) {
		this.fecha=fecha;
		this.nombre=nombre;
		this.aula=aula;
	}
	
	public void mostrarCabecera() {
		System.out.println("***************************************************");
		System.out.println("Fecha: "+fecha);
		System.out.println("Nombre de la Asignatura: "+nombre);
		System.out.println("Aula: "+aula);
		System.out.println("***************************************************");
	}	
}