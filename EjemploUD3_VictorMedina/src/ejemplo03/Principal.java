package ejemplo03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		String nombre;
		double precioNuevo;
		int numRuedas;
		
		Vendedor v2 = new Vendedor("DINOCO.SL",76483, 74);
		Vehiculo v1 = new Vehiculo("Rayo Mcqueen", 9111119.9119, 4);
		
		//Mostrar
		System.out.println(v1);
		
		System.out.println(v1.getNombre());
		System.out.println(v1.getPrecio());
		System.out.println(v1.getRuedas());
		
		//Modificar
		System.out.println("Diga un nuevo precio");
		precioNuevo = Leer.datoDouble();
		v1.setPrecio(precioNuevo);
		
		System.out.printf("El nuevo precio es:%.2f",v1.getPrecio());
		
		System.out.println("Diga un nuevo nombre");
		nombre = Leer.dato();
		v1.setNombre(nombre);
		
		System.out.printf("El nuevo precio es:%.2f",v1.getNombre());
		
		System.out.println("Diga un nuevo numero de ruedas");
		numRuedas = Leer.datoInt();
		v1.setRuedas(numRuedas);
		
		System.out.printf("El nuevo precio es:%.2f",v1.getPrecio());
		
		System.out.println(v2);
	}
}
