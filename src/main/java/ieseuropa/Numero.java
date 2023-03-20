package main.java.ieseuropa;

public class Numero {

	private static int factorial(int numero) {
		int resultado = 1;
		for (int i = 2; i <= numero; i++) {
			resultado *= i;
		}
		return resultado;
	}

	public static void main(String[] args) {
		int num = 5;
		System.out.println("El factorial de " + num + " es " + factorial(num));

	}

}
