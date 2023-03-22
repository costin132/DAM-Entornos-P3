package main.java.ieseuropa;

public class Decimal {
	
	public static void ecuacionSegundoGrado(double a, double b, double c) {
		double discriminante = b * b - 4 * a * c;
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


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
