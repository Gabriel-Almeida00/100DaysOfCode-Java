package Day22;

import java.util.Arrays;
import java.util.Scanner;

public class exe211 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] t = new int[8];
	        System.out.println("Input the heights of eight buildings:");
	        for(int i = 0; i < 8; i++){
	            t[i] = sc.nextInt();
	        }         
	        Arrays.sort(t);
	        System.out.println("\nHeights of the top three buildings:"); 
	        for(int i = 7; i >= 5; i--){
	            System.out.println(t[i]);
	        }
	    }
}
