package ejemplosobrecarga;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {		
		
		Operaciones o = new Operaciones();
		
		o.sumar(6.3, 3.7);
		o.sumar(2.5, 4);
		o.sumar(6, 6.7);
		
	}

}
