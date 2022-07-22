package Day24;

import java.util.Scanner;

public class exe235 {
	 public static void main(String args[]){
		  System.out.println("Input xp, yp, xq, yq, xr, yr, xs, ys:");
	      Scanner scan = new Scanner(System.in);
	      double x[] = new double[4];
	      double y[] = new double[4];
	      for(int i=0;i<4;i++){
	        x[i] = scan.nextDouble();
	        y[i] = scan.nextDouble();
	      }
	      double a = (x[0] - x[1]) * (x[2] - x[3]);
	      double b = (y[0] - y[1]) * (y[2] - y[3]);
	      if((float)a + (float)b == 0) 
			  System.out.println("Two lines are orthogonal.");
	      else 
			  System.out.println("Two lines are not orthogonal.");
	    }
}
