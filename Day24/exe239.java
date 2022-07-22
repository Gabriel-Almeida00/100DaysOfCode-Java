package Day24;

import java.util.Scanner;

public class exe239 {
	  public static void main(String[] args) 
      {	
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a sentence (1024 characters. max.)");
		String[] str = ((sc.nextLine()).replace(",", "").replace(".", "")).split(" ");
		int flag = 0;
		System.out.println("\n3 to 6 characters length of words:");
		for(String s: str){
			int l = s.length();
			if(l >= 3 && l <= 6){
				if(flag == 1){
					System.out.print(" ");
				}
					System.out.print(s);
				flag = 1;
			}
		}	
	} 
}
