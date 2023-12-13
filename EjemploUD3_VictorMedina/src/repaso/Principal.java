package repaso;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int opcion, tam;
		String nombre;
		int seccion, lecturaVenta, numProductos = 0, numTrabajadores = 0;
		double precioFabrica;
		boolean enVenta;
		Producto producto;
		Producto[] listado;
		Tienda tienda;

		System.out.println("Cuantos productos caben en su tienda");
		tam = Leer.datoInt();

		listado = new Producto[tam];

		tienda = new Tienda(listado, numProductos, numTrabajadores);

		do {
			System.out.println("Gestion de productos");
			System.out.println("1-Agregar producto");
			System.out.println("2-Mostrar");
			System.out.println("0-Salir");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 1:
				System.out.println("Introduzca el nombre");
				nombre = Leer.dato();
				System.out.println("Introduzca precio de fabrica");
				precioFabrica = Leer.datoDouble();
				System.out.println("Introduzca el número de la sección");
				seccion = Leer.datoInt();
				System.out.println("Introduzca si esta en venta o no \n 1-Si 2-No");
				lecturaVenta = Leer.datoInt();

				if (lecturaVenta == 1) {
					enVenta = true;
				} else {
					enVenta = false;
				}
				producto = new Producto(nombre, precioFabrica, seccion, enVenta);

				tienda.add(producto);
				break;
			case 2:
				tienda.mostrarSinNulos();
				break;

			case 0:
				System.out.println("Ha salido");
				break;
			}
		} while (opcion != 0);

	}
}
