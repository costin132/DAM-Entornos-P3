package main.java.ieseuropa;

import java.util.Arrays;

public class Array {

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
