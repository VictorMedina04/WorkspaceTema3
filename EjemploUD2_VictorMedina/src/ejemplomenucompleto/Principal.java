package ejemplomenucompleto;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int opcion,cero=0;
		
		System.out.println("/////////////////////////////////////////////////////////////////////////");
		System.out.println("\tRefranero semanal");
		System.out.println("/////////////////////////////////////////////////////////////////////////");
		
		do {
			System.out.println("0.Salir");
			System.out.println("1.Luner");
			System.out.println("2.Martes");
			System.out.println("3.Miércoles");
			System.out.println("4.Jueves");
			System.out.println("5.Viernes");
			System.out.println("6.sábado");
			System.out.println("7.Domingo");
			
			opcion=Leer.datoInt();
			
			switch(opcion) {
				case 1:
					System.out.println("Lunes a mediodía de alegría");
					break;
				case 2:
					System.out.println("Martes ni te cases ni te embarques");
					break;
				case 3:
					System.out.println("Miercoles,mitad de semana mitad de ganas");
					break;
				case 4:
					System.out.println("Jueves, que llega el viernes");
					break;
				case 5:
					System.out.println("Vierne de paranda");
					break;
				case 6:
					System.out.println("Sabado de nefli han chil");
					break;
				case 7:
					System.out.println("Domingo,Dia del Señor,como yo");
					break;
				case 0:
					System.out.println("Noos fuimoooo");
					break;
				default:
					System.out.println("Opción no valida");
			}
		
		}while(opcion!=cero);
		
	}

}
