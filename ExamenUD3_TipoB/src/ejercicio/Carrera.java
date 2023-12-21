package ejercicio;

public class Carrera {

	private Corredor[] corredores;
	private int numeroCorredores;
	private double kilometros;

	public Carrera(Corredor[] corredores, int numeroCorredores, double kilometros) {
		this.corredores = corredores;
		this.numeroCorredores = numeroCorredores;
		this.kilometros = kilometros;
	}

	public void agregarCorredor(Corredor corredor) {

		corredores[numeroCorredores++] = corredor;

	}

	public Corredor buscarDorsal(int dorsal) {
		int i = 0;
		boolean encontrado = false;

		while (i < numeroCorredores && !encontrado) {
			if (corredores[i].getDorsal() == dorsal) {
				encontrado = true;
			} else {
				i++;
			}
		}
		if (encontrado) {
			return corredores[i];
		} else {
			return null;
		}
	}

	public double calcularTiempoSegundos(int dorsal, double factorConversion) {
		double tiempoCorredorSegundos;
		Corredor corredor = buscarDorsal(dorsal);

		tiempoCorredorSegundos = corredor.getTiempoCorredor() * factorConversion;

		return tiempoCorredorSegundos;
	}

	public void mostrarArray(Corredor[] lista) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				System.out.println(lista[i]);
			}
		}
	}

	public Corredor[] buscarVeteranos() {
		Corredor[] listaVeteranos = new Corredor[numeroCorredores];
		for (int i = 0; i < numeroCorredores; i++) {
			if (corredores[i].getCategoria() == 3) {
				listaVeteranos[i] = corredores[i];
			}
		}
		return listaVeteranos;
	}

}
