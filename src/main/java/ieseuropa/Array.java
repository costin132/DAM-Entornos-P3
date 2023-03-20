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

	public static void main(String[] args) {
		System.out.println("El máximo es " + saberMaximo());

	}

}
