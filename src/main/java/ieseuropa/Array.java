package main.java.ieseuropa;

public class Array {

	public static int calcularMinimo(int[] array) {
		int minimo = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minimo) {
				minimo = array[i];
			}
		}
		return minimo;
	}

	public static void main(String[] args) {
		int[] numeros = { 10, 5, 20, 3, 8 };
		int minimo = calcularMinimo(numeros);
		System.out.println("El mínimo es: " + minimo);
	}
}
