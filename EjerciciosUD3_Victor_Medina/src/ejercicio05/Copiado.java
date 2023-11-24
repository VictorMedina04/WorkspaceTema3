package ejercicio05;

public class Copiado {

	private int numero;
	private String frase;
	
	public Copiado(int numero, String frase) {
		this.frase = frase;
		this.numero = numero;
	}
	
	public void mostrarFrase() {
		for (int i = 0; i < numero; i++) {
			System.out.println(frase);
		}
	}
	
}
