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
		 
		int numeroDias, tipo, opcion, elegirExtras, elegirMinibar, cien = 100;
		double precio = 200, porcentajeHabitacion, porcentaje;
		int tam;
		String nombreCliente = null;
		boolean ocupada = false, minibar, serviciosExtras;
		Habitacion ha = null;
		Habitacion [] lista;
		Hotel ho;
		
		/*System.out.println("Añada un porcentaje por tipo de habitacion");
		porcentaje = Leer.datoDouble();
		porcentajeHabitacion = precio * porcentaje / cien;*/
		
		System.out.println("Bienvenido a las funciones del hotel");
		System.out.println("Cuantas habitaciones hay en el hotel");
		tam = Leer.datoInt();
		lista = new Habitacion [tam];
		ho = new Hotel(lista, 0);
		
		do {		
			System.out.println("""
					1-Registrar cliente
					2-Ocupación
					3-Cobrar
					4-Imprimir factura
					""");
			opcion = Leer.datoInt();
			switch(opcion) {
				case 1:
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
					tipo = Leer.datoInt();
					while(tipo < 0 || tipo > 4) {
					System.out.println("Seleccione tipo de habitacion");
					System.out.println("1-Suite doble");
					System.out.println("2-Suite individual");
					System.out.println("3-Habitación doble");
					System.out.println("4-Habitación individual");
					tipo = Leer.datoInt();
					}
					ocupada = true;
					ha = new Habitacion(tipo, precio, nombreCliente, numeroDias, ocupada, minibar, serviciosExtras);
					ho.addHabitacion(ha);
					break;
				case 2:
					System.out.println("Introduzca el nombre del cliente");
					nombreCliente = Leer.dato();
					ho.mostrarOcupacion(ho.findByNombreCliente(nombreCliente));
					break;
				case 3:
					break;
				case 4:
					break;
			}
		}while(opcion != 0);
		
		
		
	}

}
