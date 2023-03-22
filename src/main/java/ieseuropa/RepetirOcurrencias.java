package main.java.ieseuropa;

public class RepetirOcurrencias {

	public static String repetirOcurrencias(String cadena) {
		String salida = "";
		for (int i = 0; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
			salida += c;
			if (Character.isLetter(c)) {
				salida += c;
			}
		}
		return salida;
	}

	public static void main(String[] args) {
		System.out.println(repetirOcurrencias("NBA"));
		
	}

}
