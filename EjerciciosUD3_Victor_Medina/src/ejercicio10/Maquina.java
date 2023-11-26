package ejercicio10;

public class Maquina {
	
	private String contraseya = "hola1234";
	private Ticket ticket;
	private double saldoDiario;
	
	
	public Maquina(Ticket ticket) {
	
		this.ticket = ticket;
	}
	
	
	public Maquina() {
		
	}


	public String getContraseya() {
		return contraseya;
	}


	public void setContraseya(String contraseya) {
		this.contraseya = contraseya;
	}


	public Ticket getTicket() {
		return ticket;
	}


	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}


	public double getSaldoDiario() {
		return saldoDiario;
	}


	public void setSaldoDiario(double saldoDiario) {
		this.saldoDiario = saldoDiario;
	}


	//Comprar billetes
	public double comprarTicket() {
		double subTotal;
		subTotal = ticket.getNumeroPersonas() * ticket.getPrecioUnitario();
		return subTotal;

	}
	//Calcular cambio
	public double calcularCambio(double dineroIngresado) {
		double cambio;
		cambio = dineroIngresado - comprarTicket();
		return cambio;
	}
	//Saldo total del dia
	public void calcularSaldoDiario(double dineroIngresado) {

		saldoDiario += dineroIngresado;
	}
	public void mostrarSaldoDiario() {
		System.out.println(saldoDiario+"€");
	}
	//Contador a 0
	public void resetearSaldoDiario() {
		saldoDiario = 0;
	}
	//cambiar precio 
	public void cambiarPrecioTicket(double nuevoPrecio) {
		ticket.setPrecioUnitario(nuevoPrecio);
	}
	//contraseña
	public boolean comprobarContraseya(String contraseya) {
		if(contraseya.equals(getContraseya())) {
			return true;
		}else {
			return false;
		}
	}
	public void mostrarContraseya(String contraseya) {
		if(comprobarContraseya(contraseya)) {
			System.out.println("Contraseña correcta");
		}else {
			System.out.println("Contraseña incorrecta");
		}
	}
}
