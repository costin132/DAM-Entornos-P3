package main.java.ieseuropa;

public class Strings {
  
  public static void repeticionStrings (String a, String b){
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
	    for (int i = 0; i < num; i++){
	      System.out.print (a + " " + b + " ");
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

  public static void main(String[] args) {
		// TODO Auto-generated method stub
    repeticionStrings("hola", "caracola");
    aMayusculas("marcos");
    aMinusculas("NaChO");
    System.out.print (borrarAparicion ("Hola que tal estas?", "estas"));
  }
  
}
