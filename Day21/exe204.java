package Day21;

import java.util.Scanner;

public class exe204 {
	public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
          System.out.print("Input x : ");
          int x = in.nextInt();  
		      System.out.print("Input n : ");
		      int n = in.nextInt(); 
	      	System.out.print("Input y : ");
	      	int y = in.nextInt(); 
	      	    double result = Math.pow(x, n);
		     double result1 = result % y;
		   System.out.println("x^n % y = " + result1); 
    }
}
