package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int opcion, uno = 1, tam;
		Producto p = new Producto();
		Tienda t;
		double precioFabrica, precioCoste = 0, costeTransporte;
		int elegirFragil;
		boolean fragil = false;
		String codigo, nombreProducto;
		Producto lista[];
		/* Escriba una clase Producto, caracterizada por 5 atributos 
		(uno de ellos debe ser precio de fábrica). 
		En esta clase se debe tener el método para calcular el precio de coste,
		que será el precio de fábrica más un porcentaje
		pasado como parámetro que será el coste en el transporte.
		En una clase Tienda, con un array de productos como atributo se podrá:
		- Listar datos de todos los productos.
		- Comprobar si un producto del array es “frágil” o no, mediante un método que devuelva un tipo boolean.
		- Añadir un producto a la lista pasando como parámetro un producto.
		- Calcular la cantidad invertida por la tienda en comprar todos los productos, es decir, la suma de todos los
		precios de fábrica.
		- Calcular el PVP, Precio de Venta al Público, que será un porcentaje, dado como parámetro, sumado al precio
		de coste.
		- Calcular las posibles ganancias cuando se hayan vendido todos los productos, es decir, la suma de todos los
		precios de venta al público menos la suma de todos los precios de fábrica.
		Crear un main de prueba con un menú donde se pueda hacer todo esto.
		*/
		System.out.println("Cuantos productos tiene");
		tam = Leer.datoInt();
		lista = new Producto[tam];
		t = new Tienda(lista, 0);
		do {
			System.out.println("""
					1-Añadir producto
					2-Listar todos los productos
					3-Comprobar fragilidad
					4-Cantidad invertida
					5-PVP
					6-Ganancias
					""");
			opcion = Leer.datoInt();
			switch(opcion) {
				case 1:
					System.out.println("¿Cuál es el precio de fabrica del producto?");
					precioFabrica = Leer.datoDouble();
					System.out.println("¿Cuál es el nombre del producto?");
					nombreProducto = Leer.dato();
					System.out.println("¿Cuál es el codigo del producto?");
					codigo = Leer.dato();
					System.out.println("Si el producto es fragil pulse 1");
					elegirFragil = Leer.datoInt();
					if(elegirFragil==uno) {
						fragil = true;
					}else {
						fragil = false;
					}
					System.out.println("¿Cuánto cuesta el transporte del producto?");
					costeTransporte = Leer.datoDouble();
					p.calcularPrecioCoste(costeTransporte);
					p = new Producto(precioFabrica, fragil, codigo, nombreProducto, precioCoste);
					t.addProducto(p);
					break;
				case 2:
					t.imprimirTodosLosProductos();
					break;
				case 3:
					t.comprobarFragilidad(p);
					t.mostrarFragilidad(p);
					break;
				case 4:
					t.calcularGanancias();
					break;
				case 5:
					break;
			}
		}while(opcion !=0);
	}

}
