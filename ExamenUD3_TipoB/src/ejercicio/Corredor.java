package ejercicio;

public class Corredor {

	private String nombre;
	private String apellido;
	private int dorsal;
	private int categoria;
	private double tiempoCorredor;

	public Corredor(String nombre, String apellido, int dorsal, int categoria, double tiempoCorredor) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.dorsal = dorsal;
		this.categoria = categoria;
		this.tiempoCorredor = tiempoCorredor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public double getTiempoCorredor() {
		return tiempoCorredor;
	}

	public void setTiempoCorredor(double tiempoCorredor) {
		this.tiempoCorredor = tiempoCorredor;
	}

	@Override
	public String toString() {
		return "Corredor [nombre=" + nombre + ", apellido=" + apellido + ", dorsal=" + dorsal + ", categoria="
				+ categoria + ", tiempoCorredor=" + tiempoCorredor + "]";
	}

}
