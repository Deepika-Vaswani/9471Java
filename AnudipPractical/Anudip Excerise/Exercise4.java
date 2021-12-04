import java.util.*;

public class Exercise4 {
   public static void main(String args[]){
	int a, b;
      System.out.println("Input first number");
      Scanner sc = new Scanner(System.in);
     	 a = sc.nextInt();
     	 b = sc.nextInt();
	
      System.out.println(a + " + " + b + " = " + a+b);
	
	 System.out.println(a + " + " + b + " = " + a*b);
 	System.out.println(a + " + " + b + " = " + a - b);
	 System.out.println(a + " + " + b + " = " + a/b);
	 System.out.println(a + " + " + b + " = " + a%b);
   }
}