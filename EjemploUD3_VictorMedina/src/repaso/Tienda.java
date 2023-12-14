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

	// VERBO EN INFINITIVO, SIN Ñ NI TILDES, QUE INDIQUE QUE HACE EL METODO, LA
	// SEGUNDA PALABRA EN MAYUSCULA Y LA PRIMERA EN MINUSCULA, SIEMPREE
	// ENSERIO SIEMPRE, QUERIDO GUAPO PERFECTO Y MARAVILLOSO YO DEL FUTURO
	// SIEMPREEEEEE
	public void add(Producto producto) {

		listado[numProductos++] = producto;
	}

	public void mostrarListaSinNulos() {
		for (int i = 0; i < numProductos; i++) {
			System.out.println(listado[i]);
		}
	}

	// MODIFICAR,ELIMINAR,AÑADIR,BUSCAR
	public void buscar() {
		int i = 0;
		boolean encontrado = false;

		while (i < listado.length && !encontrado) {

		}
	}

	public void modificar() {

	}

}
