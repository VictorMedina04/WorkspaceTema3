package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		/* debemos crear la clase Habitación, una clase Hotel con una lista de Habitaciones y una clase principal
		 *  de prueba para gestionar el hotel 
		 *  Podemos poner todos los métodos en la clase Hotel. Se podrá hacer lo siguiente:
		 *  
		 *  Agregar una habitación a la lista (cuyos atributos serán tipo, precio, qué servicios extra tiene, String con el 
		 *  nombre de cliente asignado, número de días contratados, si está limpia, etc.)
		 *  Ver si está ocupada o no.
		 *  Calcular precio final según número de días, servicios extra contratados y consumo del minibar.
		 *  Mostrar factura.
		 *  Aquellos métodos que se quieran añadir.
		 *  Crear un main de prueba*/
		 
		int numeroDias, suiteD = 1, suiteI = 2, habitacionD = 3, habitacionI = 4, opcion, elegirExtras, elegirMinibar, elegirTipo;
		double precio = 200;
		String nombreCliente, tipo = null;
		boolean ocupada, minibar, serviciosExtras;
		Habitacion ha = new Habitacion();
		Hotel ho = new Hotel();
		
		System.out.println("Nombre cliente");
		nombreCliente = Leer.dato();
		System.out.println("cuantos dias se queda el cliente");
		numeroDias = Leer.datoInt();
		System.out.println("servicios extras, pulse 1 para tenerlos");
		elegirExtras = Leer.datoInt();
		if(elegirExtras == 1) {
			serviciosExtras = true;
		}else {
			serviciosExtras = false;
		}
		System.out.println("minibar, pulse 1 para tenerlo");
		elegirMinibar = Leer.datoInt();
		if(elegirMinibar == 1) {
			minibar = true;
		}else {
			minibar = false;
		}
		System.out.println("Seleccione tipo de habitacion");
		System.out.println("1-Suite doble");
		System.out.println("2-Suite individual");
		System.out.println("3-Habitación doble");
		System.out.println("4-Habitación individual");
		elegirTipo = Leer.datoInt();
		if(elegirTipo == suiteD) {
			tipo = "Suite Doble";
		}
		if(elegirTipo == suiteI) {
			tipo = "Suite Individual";
		}
		if(elegirTipo == habitacionD) {
			tipo = "Habitación Doble";
		}
		if(elegirTipo == habitacionI) {
			tipo = "Habitación Individual";
		}
		ocupada = true;
		ho.calcularPrecioHabitacion(elegirTipo, ha, precio);
		
		ha = new Habitacion(tipo, precio, nombreCliente, numeroDias, ocupada, minibar, serviciosExtras);
		System.out.println(ha.toString());
		
		
	}

}
