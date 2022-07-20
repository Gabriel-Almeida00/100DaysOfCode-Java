package Day23;

import java.util.Scanner;

public class exe222 {
	 public static void main(String args[]){
	        Scanner in = new Scanner(System.in);
			System.out.println("Input P(x1,y1),separated by a space.");
	        double x1 = in.nextDouble(), y1 = in.nextDouble();
			System.out.println("Input Q(x2,y2),separated by a space.");
	        double x2 = in.nextDouble(), y2 = in.nextDouble();
			System.out.println("Input R(x3,y3),separated by a space.");
	        double x3 = in.nextDouble(), y3 = in.nextDouble();
			System.out.println("Input S(x4,y4),separated by a space.");
	        double x4 = in.nextDouble(), y4 = in.nextDouble();
	        double p1 = x2 - x1, p2 = y2 - y1, q1 = x4 - x3, q2 = y4 - y3,
	        r1 = x3 - x1, r2 = y3 - y1, s1 = x4 - x1, s2 = y4 - y1;
	        if(Math.abs(p1*q2 - p2*q1)<1e-9)
	           System.out.println("Two lines are parallel.");
	        else
	           System.out.println("Two lines are not parallel.");
	     }
}
