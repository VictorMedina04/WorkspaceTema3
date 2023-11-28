package ejercicio11;

public class GestionNotas {
	
	/*debe poder poner notas a un solo alumno,
	 * mostrar todas sus notas por pantalla
	 * modificar una nota
	 * calcular la media 
	 * dar su número de suspensos.*/
	public void ponerNotas(double []notas, double nota, int asignatura) {
		for (int i = 0; i < notas.length; i++) {
			notas[asignatura]= nota;
		} 
	}
	public void mostrarNotas(double [] notas) {
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
	}
	public void modificarNota(double []notas, int posicion, double nuevoValor) {
		notas[posicion] = nuevoValor;
	}
	
	
}
