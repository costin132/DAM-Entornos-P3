package main.java.ieseuropa;

import java.util.Arrays;

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

	public static void ordenarDeMenorAMayor(int[] array) {
		Arrays.sort(array);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = { 3, 5, 1, 4, 2 };
		System.out.println("Array antes del ordenamiento: " + Arrays.toString(numeros));
		ordenarDeMenorAMayor(numeros);
		System.out.println("Array después del ordenamiento: " + Arrays.toString(numeros));
	}

}
