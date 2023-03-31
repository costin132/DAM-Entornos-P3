package main.java.ieseuropa;

public class Decimal {
	
	public static void ecuacionSegundoGrado(float a, float b, float c) {
		float discriminante = b * b - 4 * a * c;
		if (discriminante < 0) {
			System.out.println("La ecuación no tiene soluciones reales.");
		} else if (discriminante == 0) {
			double x = -b / (2 * a);
			System.out.println("La ecuación tiene una solución real: " + x);
		} else {
			double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
			double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
			System.out.println("La ecuación tiene dos soluciones reales: " + x1 + " y " + x2);
		}
	}	

	public static double redondearAlAlza(float numero) {
	        return Math.ceil(numero);
	}
	
	public static int eliminarDecimales(float numero) {
		return (int) numero;
	}
	
	public static void main(String[] args) {
		float numero = 3.2f;
		double resultado = redondearAlAlza(numero);
		System.out.println("El número " + numero + " redondeado hacia arriba es: " + resultado);
		ecuacionSegundoGrado(2,-5,3);
		System.out.println(eliminarDecimales(34.456f));
	}   
}


