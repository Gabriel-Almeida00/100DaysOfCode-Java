package Day24;

import java.util.Arrays;
import java.util.Scanner;

public class exe231 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);         
			System.out.println("Input an integer created by 8 numbers from 0 to 9:");
	        String s = sc.next();
	        int[] num = new int[8];
	        for(int i=0;i<8;i++){
	               num[i] = Integer.valueOf(s.substring(i,i+1));
	            }
	        Arrays.sort(num);
	        int a = 0;
	        int b = 0;
	        int c = 1;
	        for(int i=0;i<8;i++){
	            a += num[i]*c;
	            b += num[7-i]*c;
	            c *= 10;
	           }
			System.out.println("Difference between the largest and the smallest integer from the given integer:");   
	        System.out.println(a-b);                 
	    }   
}
