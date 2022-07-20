package Day23;

import java.util.Scanner;

public class exe224 {
	public static void main(String[]args) {
	Scanner in=new Scanner(System.in);
    System.out.println("Input x1, y1, r1: (numbers are separated by a space)");
	double x1 = in.nextDouble(),y1=in.nextDouble(),r1=in.nextDouble();
	System.out.println("Input x2, y2, r2: (numbers are separated by a space)");
	double x2 = in.nextDouble(),y2=in.nextDouble(),r2=in.nextDouble();
	double l = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	if(l>r1+r2)
		System.out.println("Circumference of C1  and C2  intersect");
	else if(r1>l+r2)
		System.out.println("C2  is in C1");
	else if(r2>l+r1)
		System.out.println("C1  is in C2");
	else
		System.out.println("C1 and C2  do not overlap");
}
}
