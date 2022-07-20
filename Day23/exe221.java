package Day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exe221 {
	  public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Input six integers:");
	        String[] input = br.readLine().split(" ", 6);
	        int[] data = new int[6];
	 
	        for (int i = 0; i < 6; i++) {
	            data[i] = Integer.parseInt(input[i]);
	        }
	 
	        for (int j = 0; j < 5; j++) {
	            for (int i = 5; i > j; i--) {
	                if (data[i - 1] < data[i]) {
	                    int swp = data[i];
	                    data[i] = data[i - 1];
	                    data[i - 1] = swp;
	                }
	            }
	        }
	        StringBuilder sb = new StringBuilder(); 
	        for (int i : data) {
	            sb.append(i);
	            sb.append(" ");
	        }
	        System.out.println("After sorting the said integers:");
	        System.out.println(sb.substring(0 , sb.length()-1));
	    }
}
