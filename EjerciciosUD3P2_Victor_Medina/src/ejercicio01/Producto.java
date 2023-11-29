package ejercicio01;

public class Producto {
	private double precioFabrica;
	private boolean fragil;
	private String codigo;
	private String nombreProducto;
	private double precioCoste;
	
	public Producto(double precioFabrica, boolean fragil, String codigo, String nombreProducto, double precioCoste) {
		super();
		this.precioFabrica = precioFabrica;
		this.fragil = fragil;
		this.codigo = codigo;
		this.nombreProducto = nombreProducto;
		this.precioCoste = precioCoste;
	}
	
	
	public Producto() {
		
	}


	public double getPrecioFabrica() {
		return precioFabrica;
	}

	public void setPrecioFabrica(double precioFabrica) {
		this.precioFabrica = precioFabrica;
	}

	public boolean isFragil() {
		return fragil;
	}

	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}	
	
	public double getPrecioCoste() {
		return precioCoste;
	}

	public void setPrecioCoste(double precioCoste) {
		this.precioCoste = precioCoste;
	}
	
	@Override
	public String toString() {
		return "Producto [precio de fabrica=" + precioFabrica + ", fragil=" + fragil + ", codigo=" + codigo + ", nombre del producto="
				+ nombreProducto + ", precio de coste=" + precioCoste + "]";
	}

	/*método para calcular el precio de coste,
	que será el precio de fábrica más un porcentaje
	pasado como parámetro que será el coste en el transporte.*/
	public double calcularPrecioCoste(double costeTransporte) {
		int cien = 100;
		precioCoste = precioFabrica + (precioFabrica*costeTransporte/cien);
		return precioCoste;
	}
	public double calcularPVP(double porcentajePVP) {
		double PVP = 0;
		int cien = 100;

		PVP = precioCoste+(precioCoste*porcentajePVP/cien);
		return PVP;
	}
}
