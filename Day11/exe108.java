package Day11;
import java.util.Scanner;

public class exe108 {

	public static void main(String[]args) {
		 Scanner in = new Scanner(System.in);	
	       System.out.print("Input a positive integer: ");
	        int n = in.nextInt(); 
			if (n>0)
			{
	           System.out.print("The single digit number is: "+(n == 0 ? 0 : (n % 9 == 0 ? 9 : n % 9)));
			}
			System.out.println("\n");
	}
}
