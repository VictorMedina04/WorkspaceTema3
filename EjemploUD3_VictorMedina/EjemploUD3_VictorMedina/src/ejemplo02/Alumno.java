package ejemplo02;

public class Alumno {

	//Atributos
	String nombre;
	double notaPro;
	double notaBD;
	
	//Constructor
	public Alumno(String nombre, double notaPro, double notaBD) {
		
		this.nombre = nombre;
		this.notaBD = notaBD;
		this.notaPro = notaPro;
	}
	
	//Metodos
	public void mostrarMedia (double media) {
		
		System.out.println("La nota media es: "+media);
		
	}
	
	public double calcularMedia() {
		double suma, media;
		double dos = 2;
		suma = notaPro + notaBD;
		media = suma/dos;
		
		return  media;
	}
	
}