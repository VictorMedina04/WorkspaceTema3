package repaso;

import java.util.Arrays;

public class Tienda {

	private Producto[] listado;
	private int numProductos;
	private int numTrabajadores;

	public Tienda(Producto[] listado, int numProductos, int numTrabajadores) {
		this.listado = listado;
		this.numProductos = numProductos;
		this.numTrabajadores = numTrabajadores;
	}

	public Producto[] getListado() {
		return listado;
	}

	public void setListado(Producto[] listado) {
		this.listado = listado;
	}

	public int getNumProductos() {
		return numProductos;
	}

	public void setNumProductos(int numProductos) {
		this.numProductos = numProductos;
	}

	public int getNumTrabajadores() {
		return numTrabajadores;
	}

	public void setNumTrabajadores(int numTrabajadores) {
		this.numTrabajadores = numTrabajadores;
	}

	@Override
	public String toString() {
		return "Tienda [listado=" + Arrays.toString(listado) + ", numProductos=" + numProductos + ", numTrabajadores="
				+ numTrabajadores + "]";
	}
	
	
	public void add(Producto producto) {

		listado[numProductos++] = producto;
	}

	
	public void mostrarArray(Producto[] lista) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				System.out.println(lista[i]);
			}
		}
	}

	public void mostrarActivos() {
		for (int i = 0; i < numProductos; i++) {
			if (listado[i].isEnVenta()) {
				System.out.println(listado[i]);
			}
		}
	}
	
	public int buscarID(int id) {
		int i = 0;
		boolean encontrado = false;
		while (i < numProductos && !encontrado) {
			if (listado[i].getId() == (id))
				encontrado = true;
			else
				i++;
		}
		if (encontrado)
			return i;
		else
			return -1;
	}

	
	public Producto buscarIDV2(int id) {
		int i = 0;
		boolean encontrado = false;
		while (i < numProductos && !encontrado) {
			if (listado[i].getId() == (id))
				encontrado = true;
			else
				i++;
		}
		if (encontrado)
			return listado[i];
		else
			return null;
	}

	
	public Producto[] buscarBySeccion(int seccion) {
		int i = 0;

		Producto[] listaEncontrados = new Producto[numProductos];
		while (i < numProductos) {

			if (listado[i].getSeccion() == seccion) {
				listaEncontrados[i] = listado[i];
			}
			i++;
		}
		return listaEncontrados;
	}

	public double calcularPrecioFinal(double ganancia, int id) {
		Producto producto;
		producto = buscarIDV2(id);
		double cien = 100;

		return producto.getPrecioFabrica() + producto.getPrecioFabrica() * ganancia / cien;
	}

	
	public void modificarPrecioPorSeccion(int seccion, double nuevoPrecio) {

		for (int i = 0; i < numProductos; i++) {
			if (listado[i].getSeccion() == seccion) {
				listado[i].setPrecioFabrica(nuevoPrecio);
			}
		}
	}

	public double hacerDescuento(double descuento, double ganancias, int id) {

		double cien = 100;
		double resultado;

		resultado = calcularPrecioFinal(ganancias, id) - calcularPrecioFinal(ganancias, id) * descuento / cien;

		return resultado;
	}

	public int eliminarUnaSeccion(int seccion) {
		int eliminados = 0;
		for (int i = 0; i < numProductos; i++) {
			if (listado[i].getSeccion() == seccion) {
				listado[i].setEnVenta(false);
				eliminados++;
			}
		}
		return eliminados;
	}
}
