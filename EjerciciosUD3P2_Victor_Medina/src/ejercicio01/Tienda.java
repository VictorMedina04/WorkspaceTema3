package ejercicio01;

public class Tienda {
	
	private Producto []lista;
	
	public Tienda(Producto[] lista) {
		this.lista = lista;
	}	
	public Tienda() {
		this.lista = lista;
	}	
	
	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}
	
	//En una clase Tienda, con un array de productos como atributo se podrá:
	//Listar datos de todos los productos.
	public void imprimirTodosLosProductos() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println((i+1)+"-"+lista[i]);
		}
	}
	public Producto [] buscarTodo() {
		return lista;
	}
	//Comprobar si un producto del array es “frágil” o no, mediante un método que devuelva un tipo boolean.
	
	public boolean comprobarFragilidad(Producto p) {
		if(p.isFragil()) {
			return true;
		}
		else {
			return false;
		}
	}
	public void mostrarFragilidad(Producto p) {
		if(comprobarFragilidad(p)) {
			System.out.println("Es fragil");
		}else {
			System.out.println("No es fragil");
		}
	}
	
	//Añadir un producto a la lista pasando como parámetro un producto.
	public void addProducto(Producto p, int posicion) {
		for (int i = 0; i < lista.length; i++) {
			lista[posicion]=p;
		}
	}
	//Calcular la cantidad invertida por la tienda en comprar
	//todos los productos, es decir, la suma de todos los precios de fábrica.
	
	public void calcularSumaPrecioFabrica(Producto p) {
		double sumaPrecioFabrica;
		
		
	}	
	//- Calcular el PVP, Precio de Venta al Público, 
	//que será un porcentaje, dado como parámetro,
	//sumado al precio de coste.
	public void calcularPVP(double pocentajeGanancias) {
		
	}
	
	/*Calcular las posibles ganancias cuando se hayan
	vendido todos los productos, es decir, la suma 
	de todos los precios de venta al público menos
	la suma de todos los precios de fábrica.*/
}
