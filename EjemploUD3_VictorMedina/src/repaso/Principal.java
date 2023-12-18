package repaso;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int opcion, tam;
		String nombre;
		int seccion, lecturaVenta, numProductos = 0, numTrabajadores = 0, id;
		double precioFabrica, ganancias, nuevoPrecio, descuento;
		boolean enVenta = false;
		Producto producto;
		Producto[] listado;
		Tienda tienda;

		System.out.println("Cuantos productos caben en su tienda");
		tam = Leer.datoInt();

		listado = new Producto[tam];

		tienda = new Tienda(listado, numProductos, numTrabajadores);

		Producto producto2 = new Producto("Pantalon", 2.5, 1, true, 1);
		Producto producto3 = new Producto("Lechuga", 5.7, 2, false, 2);
		Producto producto4 = new Producto("Cebolla", 2.4, 2, true, 3);
		tienda.add(producto2);
		tienda.add(producto3);
		tienda.add(producto4);

		do {
			System.out.println("");
			System.out.println("Gestión de productos");
			System.out.println("1-Agregar producto");
			System.out.println("2-Mostrar lista");
			System.out.println("3-Buscar por sección");
			System.out.println("4-Mostrar activos");
			System.out.println("5-Buscar por id un producto");
			System.out.println("6-Calcular PVP");
			System.out.println("7-Cambiar el precio por seccion");
			System.out.println("8-Hacer descuento");
			System.out.println("9-Borrar sección");
			System.out.println("0-Salir");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 1:
				System.out.println("Introduzca el nombre");
				nombre = Leer.dato();
				System.out.println("Introduzca el id");
				id = Leer.datoInt();
				System.out.println("Introduzca precio de fábrica");
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
				producto = new Producto(nombre, precioFabrica, seccion, enVenta, id);

				tienda.add(producto);

				break;
			case 2:
				tienda.mostrarArray(listado);
				break;
			case 3:
				System.out.println("Diga sección");
				seccion = Leer.datoInt();
				tienda.mostrarArray(tienda.buscarBySeccion(seccion));
				break;
			case 4:
				tienda.mostrarActivos();
				break;
			case 5:
				System.out.println("Introduzca el id");
				id = Leer.datoInt();
				producto = tienda.buscarIDV2(id);

				if (producto == null) {
					System.out.println("Producto no encontrado");
				} else {
					System.out.println(producto);
				}
				break;
			case 6:
				System.out.println("Introduzca el id");
				id = Leer.datoInt();
				System.out.println("Diaga cuanto porcentaje quierer ganar");
				ganancias = Leer.datoDouble();
				System.out.printf("El precio de venta es: %.2f €\n", tienda.calcularPrecioFinal(ganancias, id));
				break;
			case 7:
				System.out.println("Introduzca el nuevo precio que quiere");
				nuevoPrecio = Leer.datoDouble();
				System.out.println("Indique la seccion");
				seccion = Leer.datoInt();
				tienda.modificarPrecioPorSeccion(seccion, nuevoPrecio);
				break;
			case 8:
				System.out.println("Introduzca el descuento");
				descuento = Leer.datoDouble();
				System.out.println("Diga las ganancias");
				ganancias = Leer.datoDouble();
				System.out.println("Introduzca el id");
				id = Leer.datoInt();
				System.out.printf("El producto con descuento es: %.2f",
						tienda.hacerDescuento(descuento, ganancias, id));
				break;
			case 9:
				System.out.println("Indique la seccion");
				seccion = Leer.datoInt();
				tienda.eliminarUnaSeccion(seccion);
				break;

			case 0:
				System.out.println("Ha salido");
				break;
			}
		} while (opcion != 0);

	}
}
