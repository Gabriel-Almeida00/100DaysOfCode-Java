package Day23;

import java.util.Scanner;

public class exe227 {
	 public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	         
	        String strs[] = sc.nextLine().split(" ");
	        int max_Length = 0;
	        int indexL = 0;
	        int max_Frequency = 0;
	        int indexF = 0;
	        System.out.println("Input a text in a line:");
	        for (int i = 0; i < strs.length; i++)
	        {
	            if (max_Length < strs[i].length())
	            {
	                indexL = i;
	                max_Length = strs[i].length();
	            }
	            int ctr = 0;
	            for (int j = i; j < strs.length; j++)
	            {
	                if (strs[i].equals(strs[j]))
	                {
	                    ctr++;
	                }
	            }
	            if (max_Frequency < ctr)
	            {
	                indexF = i;
	                max_Frequency = ctr;
	            }
	        }
			System.out.println("Most frequent text and the word which has the maximum number of letters:");
	        System.out.println(strs[indexF] + " " + strs[indexL]);
	    }
}
