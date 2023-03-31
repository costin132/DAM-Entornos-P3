package main.java.ieseuropa;

import java.util.Scanner;

public class Strings {
  
  public static void repeticionStrings (String a, String b){
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
	    for (int i = 0; i < num; i++){
	      System.out.print(a + " " + b + " ");
	    }
	}
  
  private static String aMayusculas(String nombre) {
	    return nombre.toUpperCase();
  }
  private static String aMinusculas(String nombre) {
	    return nombre.toLowerCase();
  }
	
  public static String borrarAparicion (String a, String b) {
	    String resultado = a.toLowerCase().replace(b.toLowerCase(), "");
    	return resultado;
  }
  
  public static int contarLetra(String cadena, char letra) {
		int contador = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == letra) {
				contador++;
			}
		}
		return contador;
	}
  
  public static String devolverLongitud(String nombre) {
		int longitud = nombre.length();
		return "La longitud de la cadena es: " + longitud;
	}

  public static void main(String[] args) {
		// TODO Auto-generated method stub
    repeticionStrings("hola", "caracola");
    System.out.println(aMayusculas("\nmarcos"));
    System.out.println(aMinusculas("NaChO"));	
    System.out.println(borrarAparicion ("Hola que tal estas?", "estas"));
	System.out.println("Número de ocurrencias: " + contarLetra("Hola mundo", 'o'));
	System.out.println(devolverLongitud("Hola mundo"));


  }
  
}
