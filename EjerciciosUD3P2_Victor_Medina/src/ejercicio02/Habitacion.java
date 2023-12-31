package ejercicio02;

public class Habitacion {
	private int tipo;
	private double precio;
	private String nombreCliente;
	private int numeroDias;
	private boolean ocupada;
	private boolean minibar;
	private boolean serviciosExtras;
	
	public Habitacion(int tipo, double precio, String nombreCliente, int numeroDias, boolean ocupada, boolean minibar,
			boolean serviciosExtras) {
		this.tipo = tipo;
		this.precio = precio;
		this.nombreCliente = nombreCliente;
		this.numeroDias = numeroDias;
		this.ocupada = ocupada;
		this.minibar = minibar;
		this.serviciosExtras = serviciosExtras;
	}
	public Habitacion() {
		
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getNumeroDias() {
		return numeroDias;
	}

	public void setNumeroDias(int numeroDias) {
		this.numeroDias = numeroDias;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public boolean isMinibar() {
		return minibar;
	}

	public void setMinibar(boolean minibar) {
		this.minibar = minibar;
	}

	public boolean isServiciosExtras() {
		return serviciosExtras;
	}

	public void setServiciosExtras(boolean serviciosExtras) {
		this.serviciosExtras = serviciosExtras;
	}
	@Override
	public String toString() {
		return "Habitacion [tipo=" + tipo + ", precio=" + precio + ", nombreCliente=" + nombreCliente + ", numeroDias="
				+ numeroDias + ", ocupada=" + ocupada + ", minibar=" + minibar + ", serviciosExtras=" + serviciosExtras
				+ "]";
	}
	public double calcularPrecioHabitacion(int tipo, double porcentajeHabitacion) {
		int uno = 1, dos = 2, tres = 3, cuatro = 4;
		double precioTotal = 0;
		if(tipo == uno) {
			precioTotal = precio*porcentajeHabitacion;
		}
		if(tipo == dos) {
			precioTotal = precio*porcentajeHabitacion;
		}
		if(tipo == tres) {
			precioTotal = precio*porcentajeHabitacion;
		}
		if(tipo == cuatro) {
			precioTotal = precio*porcentajeHabitacion;
		}
		return precioTotal;
	}
}
