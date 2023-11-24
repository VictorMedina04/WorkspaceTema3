package ejercicio10;

public class Ticket {
	
	private double precioUnitario;
	private String fecha;
	private int numeroPersonas;
	
	public Ticket(double precioUnitario, String fecha, int numeroPersonas) {
		this.precioUnitario = precioUnitario;
		this.fecha = fecha;
		this.numeroPersonas = numeroPersonas;
	}
	public Ticket(double precioUnitario, String fecha) {
		this.precioUnitario = precioUnitario;
		this.fecha = fecha;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getNumeroPersonas() {
		return numeroPersonas;
	}

	public void setNumeroPersonas(int numeroPersonas) {
		this.numeroPersonas = numeroPersonas;
	}

	@Override
	public String toString() {
		return "Ticket [precioUnitario=" + precioUnitario + ", fecha=" + fecha + ", numeroPersonas=" + numeroPersonas
				+ "]";
	}
	
	
}