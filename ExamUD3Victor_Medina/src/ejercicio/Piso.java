package ejercicio;

public class Piso {
	private String direccion;
	private int metrosCuadrados;
	private int estado;
	private double precioVenta;
	private int id;
	
	public Piso(String direccion, int metrosCuadrados, int estado, double precioVenta, int id) {
		this.direccion = direccion;
		this.metrosCuadrados = metrosCuadrados;
		this.estado = estado;
		this.precioVenta = precioVenta;
		this.id = id;
	}
	public Piso() {
		
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Piso [direccion=" + direccion + ", metrosCuadrados=" + metrosCuadrados + ", estado=" + estado
				+ ", precioVenta=" + precioVenta + ", id=" + id + "]";
	}
	
}
