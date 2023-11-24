package ejercicio08;

public class Cuenta {
	
	private String nombreCuenta;
	private double saldo;
	
	public Cuenta(String nombreCuenta, double saldo) {
		super();
		this.nombreCuenta = nombreCuenta;
		this.saldo = saldo;
	}
	
	//Los getters y setters no hace falta 
	public String getNombreCuenta() {
		return nombreCuenta;
	}


	public void setNombreCuenta(String nombreCuenta) {
		this.nombreCuenta = nombreCuenta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	//No se ponen = en los returns
	public void Ingresar(double cantidadIngresar) {
		saldo = saldo + cantidadIngresar;
	}
	
	public void Retirar(double cantidadRetirar) {
		
		if(saldo >= cantidadRetirar) {
			saldo = saldo - cantidadRetirar;
		}
		else {
			
		}
	}
	
	public double CambiarDolar(double cambioDolar, double cambioEuro,double saldoDolar) {
		
		saldoDolar = (saldo * cambioDolar)/cambioEuro;
		
		return saldoDolar;
	}
	
	public void mostrarDolar(double saldoDolar) {
		System.out.println("Su saldo en $ es "+saldoDolar);
	}
	
	
	public void ConsultarSaldo() {
		System.out.println("Su saldo actual es de "+saldo+"€");
	}
}
