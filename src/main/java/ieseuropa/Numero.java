package main.java.ieseuropa;

public class Numero {

	private static int factorial(int numero) {
		int resultado = 1;
		for (int i = 2; i <= numero; i++) {
			resultado *= i;
		}
		return resultado;
	}

	private static void pellSeries() { 
		int pell1 = 0, pell2 = 1;
		for (int i = 0; i < 15; i++) {
			System.out.print(pell1 + " ");
			int nextPell = pell2 * 2 + pell1;
			pell1 = pell2;
			pell2 = nextPell;
		}
	}
	public static void main(String[] args) {
		int num = 5;
		System.out.println("El factorial de " + num + " es " + factorial(num));
		System.out.print("La serie de Pell: ");
		pellSeries();
	}

}
