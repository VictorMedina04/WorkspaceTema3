package ejemploparametros;

public class Principal {
	public static void main(String[] args) {
		
		int x = 1;
		int y = 2;
		/*
		 * El metodo estatico lo puede crear en la clase principal 
		 * ya que no esta asignado a ningun objeto
		 * 
		 * 
		 * en este ejemplo lo que hace es copiar los valores pero se pierden ya que no llama al metodo donde se han copiado
		 * unos valores distintos*/
		System.out.print("Valores de x e y antes de la modificación: ");
		
		System.out.println(" x = " + x + "; y = " + y);
		modifyPrimitiveTypes(x, y);
		
		System.out.print("Valores de x e y después de la modificación: ");
		
		System.out.println(" x = " + x + "; y = " + y);
	}
	
		private static void modifyPrimitiveTypes(int x, int y) {
			x = 5;
			y = 10;
			System.out.print("Valores de x e y después de la modificación: ");
			
			System.out.println(" x = " + x + "; y = " + y);
		}
	
	}