package ejercicio03;

public class Vendedor {
	/*En la clase Vendedor
	tendremos como características un array de Móviles y total vendido (se pueden añadir más atributos si se
	quiere o precisa). Se deben crear métodos que hagan las siguientes operaciones:
	- Comprobar cuántos móviles le quedan sin vender.
	- Mostrar precio final de un producto haciendo algún descuento al precio unitario si es de segunda mano.
	- Podemos incluir también, si se quiere, la posibilidad de ofrecer cambio.
	- Calcular cuánto dinero se debe tener en el bolsillo cuando se hayan vendido todos los móviles.*/
	private Movil []lista;
	private int numMovil;
	private double totalVendido;
	
	public void addMovil(Movil mo) {
		lista[numMovil] = mo;
		numMovil ++;
	}
	public void findbyId() {
		int i = 0;
		boolean encontrado = false;
	}
}
