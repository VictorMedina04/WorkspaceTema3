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

		Producto producto2 = new Producto("Pantalon", 2.5, 1, true);
		Producto producto3 = new Producto("Lechuga", 5.7, 2, false);
		Producto producto4 = new Producto("Cebolla", 2.4, 2, true);

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
				tienda.mostrarListaSinNulos();
				break;

			case 0:
				System.out.println("Ha salido");
				break;
			}
		} while (opcion != 0);

	}
}
