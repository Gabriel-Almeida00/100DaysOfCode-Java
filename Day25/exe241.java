package Day25;

import java.util.Scanner;

public class exe241 {
	 public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
			System.out.println("Input a positive integer:");
		    int[] temp = new int[2001];
		    int[] ans = new int[4001];
		    for(int i=0;i<=1000;i++){
		    for(int j=0;j<=1000;j++){
		    temp[i+j]++;
		     }
		       }
		    for(int i=0;i<=2000;i++){
		    for(int j=0;j<=2000;j++){
		    ans[i+j]+=temp[i]*temp[j];
		     }
		        }
			      int n = sc.nextInt();
		          System.out.println("Number of combinations of a,b,c,d:");
		          System.out.println(ans[n]);      
		     }
}
