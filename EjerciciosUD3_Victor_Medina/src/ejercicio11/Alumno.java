package ejercicio11;

import java.util.Arrays;

public class Alumno {

	private String nombre;
	private double [] notas;
	private int numeroSuspensos;
	private double notaMedia;
	
	public Alumno() {
		
	}

	public Alumno(String nombre, double[] notas, int numeroSuspensos, double notaMedia) {
		
		this.nombre = nombre;
		this.notas = notas;
		this.numeroSuspensos = numeroSuspensos;
		this.notaMedia = notaMedia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public int getNumeroSuspensos() {
		return numeroSuspensos;
	}

	public void setNumeroSuspensos(int numeroSuspensos) {
		this.numeroSuspensos = numeroSuspensos;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre +", notas=" + Arrays.toString(notas)
				+ ", numeroSuspensos=" + numeroSuspensos + ", notaMedia=" + notaMedia + "]";
	}
	
}
