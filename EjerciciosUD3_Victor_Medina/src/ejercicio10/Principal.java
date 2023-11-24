package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int numeroPersonas;
		double precioUnitario = 1.6;
		Ticket ticket;
		String fecha = "22-04-2023";
		double dineroIngresado;
		int opcion, opcion2;
		String contraseya;
		Maquina m1, mSumar;
		
		m1 = new Maquina();
		mSumar = new Maquina();
		ticket = new Ticket(precioUnitario, fecha);
		
		
		System.out.println("//////////////////////////////////////////////////////");
		System.out.println("\tBienvenido al metro");
		System.out.println("//////////////////////////////////////////////////////");
		
		do {
			System.out.println("""
					1-Funciones del cliente
					2-Funciones del trabajador
					//////////////////////////////////////////////////////
					""");
			opcion = Leer.datoInt();
			switch(opcion) {
				case 1:
					
					System.out.println("¿Cuántas personas viajan?");
					numeroPersonas = Leer.datoInt();
					
					ticket = new Ticket(precioUnitario, fecha, numeroPersonas);
					
					m1 = new Maquina(ticket);
					
					System.out.println("Un ticket cuesta "+ ticket.getPrecioUnitario()+"€ por persona");
					System.out.printf("El total a pagar es %.2f€ \n",m1.comprarTicket());
					System.out.println("Ingrese dinero para comprar el ticket");
					dineroIngresado = Leer.datoDouble();
					if(dineroIngresado<m1.comprarTicket()) {
						System.out.println("Usted debe ingresar más dinero para poder comprar el billete");
						System.out.println("//////////////////////////////////////////////////////");
					}
					else {
						m1.comprarTicket();
						System.out.printf("Su cambio es %.2f€ \n",m1.calcularCambio(dineroIngresado));
						System.out.println("//////////////////////////////////////////////////////");
					}
					break;
				case 2:
					//contraseña
					System.out.println("Introduzca la contraseña para iniciar sesión");
					contraseya = Leer.dato();
					
					m1.comprobarContraseya(contraseya);
					m1.mostrarContraseya(contraseya);
					while(m1.comprobarContraseya(contraseya)== false) {
						System.out.println("Vuelva a poner la contraseña");
						contraseya = Leer.dato();
					}
					
					do {
						System.out.println("""
								//////////////////////////////////////////////////////
								-Ha entrado a las funciones de trabajadores
								
								1-Editar precio ticket
								2-Consultar saldo del dia
								3-Vaciar maquina
								//////////////////////////////////////////////////////
								""");
						opcion2 = Leer.datoInt();
						switch(opcion2) {
							case 1:
								System.out.println("Cambie el precio del ticket de hoy");
								m1.cambiarPrecioTicket(precioUnitario);
								System.out.println(ticket.getPrecioUnitario());
								
								break;
							case 2:
								m1.mostrarSaldoDiario();
								break;
							case 3:
								m1.resetearSaldoDiario();
								break;
						}
					}while(opcion2!=0);
					break;
			}
			
		}while(opcion!=0);
		
	}

}
