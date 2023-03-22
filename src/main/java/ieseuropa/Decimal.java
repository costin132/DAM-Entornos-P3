package main.java.ieseuropa;

public class Decimal {

	public static double redondearAlAlza(float numero) {
	        return Math.ceil(numero);
	}
	public static void main(String[] args) {
		float numero = 3.2f;
		double resultado = redondearAlAlza(numero);
		System.out.println("El número " + numero + " redondeado hacia arriba es: " + resultado);
	}   
}

