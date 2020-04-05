package ets;

/**
 * clase programaComposicionCono
 * Esta clase lo que hace es imprimir los objetos 5 veces
 * @author javie
 *
 */

public class ProgramaComposicionCono {

	/**
	 * Imprime por pantalla los objetos del Circuito.java y de cono.java
	 * @param datos
	 */

	private static void imprimir(Object datos) {
		System.out.println(datos);
	}

	/**
	 * Imprime por pantalla 5 valores direfentes
	 * @param args
	 */
	
	public static void main(String[] args) {
		java.util.Random aleatorio = new java.util.Random();
		for (int i = 1; i <= 5; i++) {
			int radio = aleatorio.nextInt(9) + 1;
			
			/**
			 * imprime el objeto cono
			 */
			
			Cono cono = new Cono(0, 0, radio, i, "Azul");
			cono.imprimir();
		}
	}

}
