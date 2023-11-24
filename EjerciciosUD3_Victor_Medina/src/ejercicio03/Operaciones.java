package ejercicio03;

public class Operaciones {

	
	public void mostrarParOImpar (int num, int dos) {
		
		if (num % dos == 0) {	
			System.out.println("Este numero es par");
		} else {
			System.out.println("El número es impar");
		}
	}
	
	public boolean elegirPositivoONegativo (int num, int cero) {
		if (num >= cero) {
			return true;
		}else {
			return false;
		}
	}
	public void mostrarPositivoONegativo(int num, int cero) {
		if(elegirPositivoONegativo(num, cero) ) {
			System.out.println("El número es positivo");
		}
		else {
			System.out.println("El número es negativo");
		}
	}
}