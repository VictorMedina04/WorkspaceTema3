package ejercicio;

import java.util.Arrays;

public class Inmobiliaria {
	private Piso []lista;
	private int numVendedores;
	
	public Inmobiliaria(Piso[] lista, int numVendedores) {
		this.lista = lista;
		this.numVendedores = numVendedores;
	}
	
	public Inmobiliaria() {
		
	}

	public Piso[] getLista() {
		return lista;
	}

	public void setLista(Piso[] lista) {
		this.lista = lista;
	}

	public int getNumVendedores() {
		return numVendedores;
	}

	public void setNumVendedores(int numVendedores) {
		this.numVendedores = numVendedores;
	}

	@Override
	public String toString() {
		return "Inmobiliaria [lista=" + Arrays.toString(lista) +", numVendedores="
				+ numVendedores + "]";
	}
	
	
	public void addPiso(Piso p) {
		lista[numVendedores]=p;
		numVendedores++;
	}
	public double calcularPrecioFinal(Piso p, double porcentaje) {
		double precioFinal;
		int cien = 100;
		precioFinal = p.getPrecioVenta()+(p.getPrecioVenta()*porcentaje/cien);
		
		return precioFinal;
	}
	public void mostrarPrecioFinal(Piso p, double porcentaje) {
		System.out.printf("El precio final del piso es %.2f", calcularPrecioFinal(p,porcentaje));
	}
	
	public double calcularPrecioMetroCuadrado(Piso p, double porcentaje) {
		double precioMetroCuadrado = 0;
		precioMetroCuadrado = calcularPrecioFinal(p, porcentaje) / p.getMetrosCuadrados();
		return precioMetroCuadrado;
	}
	public void mostrarPrecioMetroCuadrado(Piso p, double porcentaje) {
		System.out.printf("El precio final del piso es %.2f", calcularPrecioMetroCuadrado(p,porcentaje));
	}
	public Piso buscarId(Piso p, int id) {
		int i = 0;
		boolean encontrado = false;
		
		while(i < lista.length && !encontrado) {
			if(p.getId() == id) {
				encontrado = true;
			}
			else
				i++;
		}
		if(encontrado) {
			return lista[i];
		}
		else
			return null;
	}
	public Piso buscarNuevos(Piso p) {
		int uno = 1;
		int i = 0;
		boolean encontrado = false;
		while(i < lista.length && !encontrado)
		if(p.getEstado() == uno) {
			encontrado = true;
		}
		else 
			i++;
		if(encontrado) {
			return lista[i];
		}
		else
			return null;
	}
}
