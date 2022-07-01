package Day2;
import java.util.Scanner;

public class exe12 {

	public static void main (String[]args) {
		double num = 0;
		double x = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input the number(n) you want to calculate the averege: ");
		int n = sc.nextInt();
		
		while(x <= n) {
			System.out.println("Input number " + "("+ (int) x +")" + ":");
			num += sc.nextInt();
			x += 1;
		}
		double avgn = (num / n);
		
		System.out.println("Average:" + avgn);
	}
}
