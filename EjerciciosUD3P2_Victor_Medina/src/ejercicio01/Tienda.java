package ejercicio01;

public class Tienda {
	
	private Producto []lista;
	private int numeroProducto;
	
	public Tienda(Producto[] lista, int numeroProducto) {
		super();
		this.lista = lista;
		this.numeroProducto = numeroProducto;
	}
	public Tienda() {
		
	}	
	
	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}
		
	public int getNumeroProducto() {
		return numeroProducto;
	}
	public void setNumeroProducto(int numeroProducto) {
		this.numeroProducto = numeroProducto;
	}
	//En una clase Tienda, con un array de productos como atributo se podrá:
	//Listar datos de todos los productos.
	public void imprimirTodosLosProductos() {
		for (int i = 0; i < numeroProducto; i++) {
			System.out.println((i+1)+"-"+lista[i]);
		}
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
	public void addProducto(Producto p) {
		lista[numeroProducto]=p;
		numeroProducto++;
	}
	//Calcular la cantidad invertida por la tienda en comprar
	//todos los productos, es decir, la suma de todos los precios de fábrica.
	
	
	public double calcularGanancias() {
		double sumaTotal = 0;
		for (int i = 0; i < lista.length; i++) {
			sumaTotal = lista[i].calcularPrecioCoste(sumaTotal) + sumaTotal ;
		}
		return sumaTotal;
	}	
		
	/*Calcular las posibles ganancias cuando se hayan
	vendido todos los productos, es decir, la suma 
	de todos los precios de venta al público menos
	la suma de todos los precios de fábrica.*/
}
