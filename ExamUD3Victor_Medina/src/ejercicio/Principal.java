package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		String direccion;
		int metrosCuadrados, estado, id, numVendedores, tam = 10, opcion;
		double precioVenta, porcentaje, precioNuevo;
		Piso p = new Piso();
		
		Piso []lista;
		Inmobiliaria in = new Inmobiliaria ();
		
		System.out.println("////////////////////////////////////////////////");
		System.out.println("Bienvenido al programa de la inmobiliaria");
		System.out.println("////////////////////////////////////////////////");
		
		System.out.println("Cuantos pisos quiere tener como maximo a la venta");
		tam = Leer.datoInt();
		lista = new Piso [tam];
		
		do {
			System.out.println("""
					1-Añadir un piso
					2-Precio final del piso
					3-Pisos nuevos
					4-Precio por metro cuadrado
					5-Modificar precio del piso
					6-Previsión de ganancias con los seminuevos
					7-Vender todos los pisos
					""");
			opcion = Leer.datoInt();
			switch(opcion) {
				case 1:
					System.out.println("Cual es la direccion");
					direccion = Leer.dato();
					System.out.println("Cuantos metros cuadrados tiene");
					metrosCuadrados = Leer.datoInt();
					System.out.println("Cual es el estado del piso");
					System.out.println("1-Nuevo");
					System.out.println("2-Seminuevo");
					System.out.println("3-Hace falta una manita");
					estado = Leer.datoInt();
					while(estado < 1 && estado > 3) {
					System.out.println("1-Nuevo");
					System.out.println("2-Seminuevo");
					System.out.println("3-Hace falta una manita");
					}
					System.out.println("Cual es el precio de venta");
					precioVenta = Leer.datoDouble();
					
					System.out.println("cual es su id");
					id = Leer.datoInt();
					
					p = new Piso(direccion, metrosCuadrados, estado, precioVenta, id);
					in = new Inmobiliaria(lista, 0);
					in.addPiso(p);
					System.out.println("////////////////////////////////////////////////");
					break;
				case 2:
					System.out.println("Introduzca el id del piso");
					id = Leer.datoInt();
	
					System.out.println("Cuanto porcentaje quiere ganar");
					porcentaje = Leer.datoDouble();
					
					in.calcularPrecioFinal(in.buscarId(p, id), porcentaje);		
					
					in.mostrarPrecioFinal(p, porcentaje);
					System.out.println("////////////////////////////////////////////////");
					System.out.println("");
					
					break;
				case 3:
					System.out.println(in.buscarNuevos(p));
					break;
					
				case 4:
					System.out.println("Seleccione el id del piso");
					id = Leer.datoInt();
					System.out.println("Cuanto porcentaje quiere ganar");
					porcentaje = Leer.datoDouble();
					in.calcularPrecioMetroCuadrado(in.buscarId(p, id), porcentaje);
					in.mostrarPrecioMetroCuadrado(p, porcentaje);
					System.out.println("////////////////////////////////////////////////");
					System.out.println("");
					break;
				default:
						System.out.println("Introduzca un número valido");
						System.out.println("////////////////////////////////////////////////");
						break;
				case 0:
					System.out.println("Gracias por usar el programa");
					System.out.println("////////////////////////////////////////////////");
					break;
			}
		}while(opcion != 0);

	}

}
