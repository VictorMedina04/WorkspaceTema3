package ejercicio11;

public class GestionNotas {
	
	//poner notas a un solo alumno
	public void ponerNotas(double []notas, double nota, int asignatura) {
		for (int i = 0; i < notas.length; i++) {
			notas[asignatura]= nota;
		} 
	}
	//mostrar todas sus notas por pantalla
	public void mostrarNotas(double [] notas) {
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
	}
	// modificar una nota
	public void modificarNota(double []notas, int posicion, double nuevoValor) {
		notas[posicion] = nuevoValor;
	}
	//calcular la media 
	public double calcularMedia(double []notas, double media) {
		for (int i = 0; i < notas.length; i++) {
			media = notas[i]/notas.length;
		}
		return media;
	}
	public void mostrarMedia(double []notas, double media) {
		System.out.println("La nota media del alumno es: "+calcularMedia(notas, media));
	}
	// dar su número de suspensos.
	public int calcularSuspensos(double []notas, int numeroSuspensos) {
		int cinco = 5;
		for (int i = 0; i < notas.length; i++) {
			if(notas[i]<cinco) {
				numeroSuspensos++;
			}
		}
		return numeroSuspensos;
	}
	public void mostrarSuspensos(double []notas, int numeroSuspensos) {
		System.out.println("El número de suspensos del alumno es: "+calcularSuspensos(notas, numeroSuspensos));
	}
	
}
