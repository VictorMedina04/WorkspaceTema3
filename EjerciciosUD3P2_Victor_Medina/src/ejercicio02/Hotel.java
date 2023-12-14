package ejercicio02;

import java.util.Arrays;

public class Hotel {

	private Habitacion[] lista;
	private int numHabitacion;

	public Hotel(Habitacion[] lista, int numHabitacion) {
		this.lista = lista;
		this.numHabitacion = numHabitacion;
	}

	public Habitacion[] getLista() {
		return lista;
	}

	public void setLista(Habitacion[] lista) {
		this.lista = lista;
	}

	public int getNumHabitacion() {
		return numHabitacion;
	}

	public void setNumHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
	}

	@Override
	public String toString() {
		return "Hotel [lista=" + Arrays.toString(lista) + ", numHabitacion=" + numHabitacion + "]";
	}

	// AÑadir
	public void addHabitacion(Habitacion ha) {
		lista[numHabitacion] = ha;
		numHabitacion++;
	}

	// buscar nombre
	public Habitacion findByNombreCliente(String nombreCliente) {
		int i = 0;
		boolean encontrado = false;

		while (i < lista.length && !encontrado) {
			Habitacion deLista = lista[i];
			if (deLista.getNombreCliente().equalsIgnoreCase(nombreCliente))
				encontrado = true;
			else
				i++;
		}
		if (encontrado)
			return lista[i];
		else
			return null;
	}

	public boolean comprobarOcupacion(Habitacion ha) {
		boolean result;
		if (ha.isOcupada()) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	public void mostrarOcupacion(Habitacion ha) {

		if (comprobarOcupacion(ha)) {
			System.out.println("La habitación esta ocupada");
		} else {
			System.out.println("La habitación no esta ocupada");
		}
	}

	public double calcularServiciosExtras(Habitacion ha) {
		int quince = 15, cien = 100;
		double precioServicios;
		if (ha.isServiciosExtras()) {
			precioServicios = ha.getPrecio() + (ha.getPrecio() * quince) / cien;
		} else {
			precioServicios = 0;
		}
		return precioServicios;
	}

	public double calcularMiniBar(Habitacion ha) {
		int quince = 15, cien = 100;
		double precioMiniBar;
		if (ha.isMinibar()) {
			precioMiniBar = ha.getPrecio() + (ha.getPrecio() * quince) / cien;
		} else {
			precioMiniBar = 0;
		}
		return precioMiniBar;
	}

	// Calcular precio final según número de días, servicios extra contratados y
	// consumo del minibar.
	public double calcularPrecioFinal(Habitacion ha) {
		double precioFinal;
		precioFinal = (ha.getPrecio() + calcularMiniBar(ha) + calcularServiciosExtras(ha) * ha.getNumeroDias());
		return precioFinal;
	}

}
