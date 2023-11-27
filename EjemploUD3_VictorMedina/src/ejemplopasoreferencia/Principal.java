package ejemplopasoreferencia;

import utilidades.Leer;

public class Principal {
	
	public static void main(String[] args) {
		
		int diaAct, mesAct;
		
		Fecha nacimiento = new Fecha(22, 04, 2004 );
		Fecha contratacion = new Fecha(06, 9, 2027 );
		
		Empleado empleado = new Empleado("Victor", "Medina", nacimiento,contratacion);
		System.out.println(empleado);
		
		System.out.println("Qué día es hoy");
		diaAct=Leer.datoInt();
		
		System.out.println("¿Qué mes?");
		mesAct=Leer.datoInt();
		
		Fecha actual= new Fecha (diaAct, mesAct);
		
		empleado.felicitarCumple(actual);
		System.out.println(empleado);
		System.out.println("****************");
		
		empleado.rejuvenecer(nacimiento);
		System.out.println(empleado);
		/*Una vez cambiado el valor del producto no se puede
		 *  resetear el valor ya que se machaca por completo*/
		//Compara con el paso por copia
		/*
		int a=2;
		Numero miNumero= new Numero ();
		System.out.println(miNumero.modificar(a));//Cambia la copia, vale 6
		miNumero.mostrar(a);*///El a del main no ha cambiado, vale 2
		}
}
