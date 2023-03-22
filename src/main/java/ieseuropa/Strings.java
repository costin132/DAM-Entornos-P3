package main.java.ieseuropa;

public class Strings {
  
  public static void repeticionStrings (String a, String b){
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
	    for (int i = 0; i < num; i++){
	      System.out.print (a + " " + b + " ");
	    }
	}

  public static void main(String[] args) {
		// TODO Auto-generated method stub
    repeticionStrings("hola", "caracola");
  }
  
}
