package Day22;

import java.util.Scanner;

public class exe215 {
	 public static void main(String[] args) {
		   Scanner s = new Scanner(System.in);
		   System.out.println("Input number of months:");
		        int n = s.nextInt();
		        double c = 100000;
		        for(int i = 0; i < n; i++) {
		            c += c*0.04;
		            if(c % 1000 != 0) {
		                c -= c % 1000;
		                c += 1000;
		            }             
		        }
		       System.out.println("\nAmount of debt: ");
		        System.out.printf("%.0f\n",c);
		    }
}
