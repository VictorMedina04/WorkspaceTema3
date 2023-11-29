package ejercicio02;

public class Hotel {
	
	private Habitacion []lista;
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
	//AÑadir
	public void addHabitacion(Habitacion ha) {
		lista[numHabitacion] = ha;
		numHabitacion ++;
	}
	//buscar nombre
	public Habitacion findByNombreCliente(String nombreCliente) {
		int i = 0;
		boolean encontrado = false;
		
		while(i < lista.length && !encontrado) {
			Habitacion deLista = lista[i];
			if (deLista.getNombreCliente().equalsIgnoreCase(nombreCliente))
				encontrado = true;
			else
				i++;
		}
		if (encontrado)
			return lista[i];//Devolvemos el producto buscado
		else
			return null;
	}

	public boolean comprobarOcupacion(Habitacion ha) {
		if(ha.isOcupada()) {
			return true;
		}else {
			return false;
		}
	}
	public void mostrarOcupacion(Habitacion ha) {
		/*for (int i = 0; i < lista.length; i++) {
			if(comprobarOcupacion(ha)) {
				System.out.println("La habitación "+(i+1)+" esta ocupada");
			}else {
				System.out.println("La habitación "+(i+1)+" no esta ocupada");
			}
		}*/
		if(comprobarOcupacion(ha)) {
			System.out.println("La habitación esta ocupada");
		}else {
			System.out.println("La habitación no esta ocupada");
		}
	}

	//Calcular precio final según número de días, servicios extra contratados y consumo del minibar.
	public void calcularPrecioFinal(Habitacion ha) {
		
	}
	
}
