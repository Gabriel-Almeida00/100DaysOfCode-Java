package Day25;

import java.util.Scanner;

public class exe247 {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Input three integers (a,b,c):");
	            long a = in.nextLong();
	            long b = in.nextLong();
	            long c = in.nextLong();
				System.out.println("Check whether (a + b) is greater than c?");
	            System.out.println(a + b > c);
	       }
}
