package main.java.ieseuropa;

import java.util.Arrays;

public class Array {
	
	public static double mediana (int [] a) {
		Arrays.sort(a);
		double mediana = 0;
		if (a.length % 2 != 0) {
			mediana = a[(a.length/2)];
		}else {
			int n = a[a.length / 2 - 1];
			int m = a[a.length / 2];
			mediana = (n+m) / 2;
		}
		return mediana;
	}

	public static void ordenarDeMenorAMayor(int[] array) {
		Arrays.sort(array);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {2,4,8,3,1,7};
		System.out.println(mediana(a));
		int[] numeros = { 3, 5, 1, 4, 2 };
		System.out.println("Array antes del ordenamiento: " + Arrays.toString(numeros));
		ordenarDeMenorAMayor(numeros);
		System.out.println("Array después del ordenamiento: " + Arrays.toString(numeros));

	}
}
