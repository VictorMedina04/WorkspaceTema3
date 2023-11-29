package ejercicio02;

public class Hotel {
	
	private Habitacion []lista;
	private int numHabitacion;
	//agregar,calcularpf y comprabar ocp
	
	
	
	
	
	
	
	
	
	public double calcularPrecioHabitacion(int elegirTipo, Habitacion ha, double precio, ) {
		if(elegirTipo == 1) {
			precioTotal = ha.getPrecio() * porcentaje;
		}
		if(elegirTipo == 2) {
			
		}
		if(elegirTipo == 3) {
			
		}
		if(elegirTipo == 4) {
			
		}
		return precio;
	}
	
	public void addHabitacion(Habitacion ha) {
		lista[numHabitacion] = ha;
		numHabitacion ++;
	}
	//Calcular precio final según número de días, servicios extra contratados y consumo del minibar.
	public void calcularPrecioFinal(Habitacion ha) {
		
	}
}
