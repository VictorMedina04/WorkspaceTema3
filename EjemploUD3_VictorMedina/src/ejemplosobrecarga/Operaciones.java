package ejemplosobrecarga;

public class Operaciones {
	
	public double sumar(double a, double b) {
		return a+b;
	}
	
	public double sumar(int a, double b) {
		return a+b;
	}
	
	public double sumar(double a, int b) {
		return a+b;
	}
	
}
