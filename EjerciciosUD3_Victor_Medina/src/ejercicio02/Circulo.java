package ejercicio02;

public class Circulo {

	//Atributo
	private double radio;
	
	public Circulo () {
		
	}
	
	//Constructor
	public Circulo (double radio) {
		this.radio = radio;
	}
	
	//Metodos
	public double calcularArea () {
		int dos = 2;
		double area;
		area = Math.PI * Math.pow(radio, dos); 
		return area;
	}
	
	public double convertirMetros (double area) {
		double diezMil = 10000;
		return calcularArea()/diezMil;		
	}
}