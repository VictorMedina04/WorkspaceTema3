package ejemplo03;

public class Vehiculo {

	//Atributos
	private String nombre;
	private double precio;
	private int numRuedas;
	
	//Constructor
	public Vehiculo(String nombre, double precio,int numRuedas) {
		
		this.nombre = nombre;
		this.numRuedas = numRuedas;
		this.precio = precio;
		
	}
	//Getters y Setters
	public String getNombre() {
		
		return nombre;
	}
	
	public double getPrecio() {
	
		return precio;
	}
	
	public int getRuedas() {
		
		return numRuedas;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void setRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	
}
