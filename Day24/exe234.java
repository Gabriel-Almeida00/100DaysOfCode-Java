package Day24;

import java.util.Scanner;

public class exe234 {
	public static void main(String[] args){ 
        Scanner scan = new Scanner(System.in);
		System.out.println("Input number of straight lines:");
     	int n=scan.nextInt();
		System.out.println("Number of regions:");
        System.out.println((n * (n + 1) >> 1) + 1);
    }
}
