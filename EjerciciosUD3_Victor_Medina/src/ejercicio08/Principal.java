package ejercicio08;
import utilidades.Leer;
public class Principal {
	public static void main(String[] args) {
		
		double saldo;
		String nombreCuenta;
		double cantidadIngresar;
		double cantidadRetirar;
		double cambioDolar = 1, cambioEuro = 0.92, saldoDolar = 0;
		int opcion1;
		Cuenta c;
		
		System.out.println("//////////////////////////////////////////////////////");
		System.out.println("\tBienvenido a su cuenta de banco");
		System.out.println("//////////////////////////////////////////////////////");
		
		System.out.println("Ingrese el nombre de su cuenta");
		nombreCuenta = Leer.dato();
		System.out.println("¿Cuanto saldo tiene?");
		saldo = Leer.datoDouble();
		
		c = new Cuenta(nombreCuenta,saldo);
		do {
			System.out.println("1-Ingresar");
			System.out.println("2-Retirar");
			System.out.println("3-Ver saldo en $");
			System.out.println("4-Consultar saldo");
			System.out.println("0-Salir");
			System.out.println("//////////////////////////////////////////////////////");
			opcion1 = Leer.datoInt();
			
			switch (opcion1) {
			
				case 1:
					System.out.println("¿Cuánto dinero quiere ingresar en €?");
					cantidadIngresar = Leer.datoDouble();
					c.Ingresar(cantidadIngresar);					
					System.out.println("//////////////////////////////////////////////////////");
				break;
					
				case 2:
					System.out.println("¿Cuánto dinero quiere sacar?");
					cantidadRetirar = Leer.datoDouble();
					c.Retirar(cantidadRetirar);
					System.out.println("//////////////////////////////////////////////////////");
				break;
					
				case 3:
					c.CambiarDolar(cambioDolar, cambioEuro, saldoDolar);
					c.mostrarDolar(saldoDolar);
					System.out.println("//////////////////////////////////////////////////////");
				break;
				
				case 4:
					c.ConsultarSaldo();
					System.out.println("//////////////////////////////////////////////////////");
				break;
				
				default:
					System.out.println("Opción no disponible");
				break;
			}
		}while (opcion1!=0);
	}
}
