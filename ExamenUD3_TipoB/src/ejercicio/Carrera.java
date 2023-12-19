package ejercicio;

public class Carrera {

	private Corredor[] corredores;
	private int numeroCorredores;
	private double kilometros;

	public Carrera(Corredor[] corredores, int numeroCorredores, double kilometros) {
		this.corredores = corredores;
		this.numeroCorredores = numeroCorredores;
		this.kilometros = kilometros;
	}

	public void agregarCorredor(Corredor corredor) {

		corredores[numeroCorredores++] = corredor;

	}

	public double calcularTiempoSegundos(double tiempoCorredor) {
		double tiempoCorredorSegundos;
		int sesenta = 60;
		tiempoCorredorSegundos = tiempoCorredor * sesenta;

		return tiempoCorredorSegundos;
	}

}
