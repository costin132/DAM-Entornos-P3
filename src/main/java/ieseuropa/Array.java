package main.java.ieseuropa;

import java.util.Arrays;

public class Array {
	

	private static int saberMaximo() { 
		int[] array = { 1, 3, 8, 5, 2 };
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	

	public static double mediaArray(int[] datos) {
		int cantDatos = 0;
		double acumulador = 0L;
		for(int i = 0; i < datos.length; i++) {
			acumulador = acumulador + datos[i];
			cantDatos++;
		}
		return acumulador/cantDatos;
	}
	

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
		System.out.println("El máximo es " + saberMaximo());
		System.out.println(mediaArray(new int[] { 3, 14, 32, 1}));
		System.out.println(mediaArray(new int[] { 12, 25, 22, 52}));
		System.out.println(mediaArray(new int[] { 1, 84, 23, 43}));
    int [] a = {2,4,8,3,1,7};
		System.out.println(mediana(a));
		int[] numeros = { 3, 5, 1, 4, 2 };
		System.out.println("Array antes del ordenamiento: " + Arrays.toString(numeros));
		ordenarDeMenorAMayor(numeros);
		System.out.println("Array después del ordenamiento: " + Arrays.toString(numeros));


	}
}
