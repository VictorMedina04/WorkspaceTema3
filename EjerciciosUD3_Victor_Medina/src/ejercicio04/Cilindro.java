package ejercicio04;

public class Cilindro {
	
	//Atributos
	private double altura;
	private double radio;
	//Constructor
	public Cilindro(double altura, double radio) {
		this.altura = altura;
		this.radio = radio;
	}
	//Metodos
	public double calcularVolumen() {
		int dos = 2;
		double volumen;
		volumen = Math.PI * altura * Math.pow(radio, dos);
		return volumen;
	}
	public void mostrarVolumen(double volumen) {
		System.out.printf("El volumen de su cilindro es: %.2f m^3",volumen);
	}
}
