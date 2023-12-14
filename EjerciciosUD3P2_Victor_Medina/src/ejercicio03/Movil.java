package ejercicio03;

public class Movil {
	/*
	 * Los atributos de la clase Móvil serán, como mínimo, marca, modelo, vendido o
	 * no, nuevo o de segunda mano y precio unitario.
	 */
	private int marca;
	private String modelo;
	private boolean vendido;
	private boolean nuevo;
	private double precioUnitario;
	private int id;

	public Movil(int marca, String modelo, boolean vendido, boolean nuevo, double precioUnitario, int id) {
		this.marca = marca;
		this.modelo = modelo;
		this.vendido = vendido;
		this.nuevo = nuevo;
		this.precioUnitario = precioUnitario;
		this.id = id;
	}

	public int getMarca() {
		return marca;
	}

	public void setMarca(int marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isVendido() {
		return vendido;
	}

	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}

	public boolean isNuevo() {
		return nuevo;
	}

	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Movil [marca=" + marca + ", modelo=" + modelo + ", vendido=" + vendido + ", nuevo=" + nuevo
				+ ", precioUnitario=" + precioUnitario + ", id=" + id + "]";
	}
}
