package main.java.ieseuropa;

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
	

	public static void main(String[] args) {
		System.out.println("El máximo es " + saberMaximo());
		System.out.println(mediaArray(new int[] { 3, 14, 32, 1}));
		System.out.println(mediaArray(new int[] { 12, 25, 22, 52}));
		System.out.println(mediaArray(new int[] { 1, 84, 23, 43}));

	}

}
