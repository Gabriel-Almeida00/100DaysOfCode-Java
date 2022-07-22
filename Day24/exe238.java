package Day24;

import java.util.Scanner;

public class exe238 {
	 public static void main(String[] args) 
	    {
	        Scanner stdIn = new Scanner(System.in);
			    System.out.println("Input the text:");
	            String str = stdIn.next();
	            for(int i = 0; i < str.length(); ++i)
	            {
	                if(str.charAt(i) == '#')
	                {
	                    for(int j = 0; j < (str.charAt(i + 1) - '0'); ++j)
	                    {
	                        System.out.print(str.charAt(i + 2));
	                    }
	                    i += 2;
	                }
	                else
	                {
	                    System.out.print(str.charAt(i));
	                }
	            }
	            System.out.println();
	    }
}
