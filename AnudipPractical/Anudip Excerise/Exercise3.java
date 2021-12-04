import java.util.Scanner;

public class Exercise3 {
   public static void main(String args[]){
      System.out.println("Input first number");
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
	System.out.println("Input second number:");
      	Scanner s = new Scanner(System.in);
     	 int b = s.nextInt();
      System.out.println("result is: " + a*b);
   }
}