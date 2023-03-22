package main.java.ieseuropa;

public class Decimal {
	
	public static int eliminarDecimales(float numero) {
		return (int) numero;
	}

	public static void main(String[] args) {
		float numeroDecimal = 3.1416f;
		int numeroSinDecimales = Decimal.eliminarDecimales(numeroDecimal);
		System.out.println("El número " + numeroDecimal + " sin decimales es: " + numeroSinDecimales);
	
	}
}
