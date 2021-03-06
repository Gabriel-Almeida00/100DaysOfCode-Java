package Day24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exe233 {
	 public static void main(String[] args) throws NumberFormatException,IOException {
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        StringBuilder builder = new StringBuilder();
	        int max = 50000;
	        System.out.print("Input an even number: "); 
	        boolean[] primes = new boolean[max + 1];
	        int count = 1;
	        for (int i = 3; i <= max; i += 2) {
	            if (!primes[i]) {
	                count++;
	                if (i <= Math.sqrt(max)) {
	                    for (int j = i; j <= max / i; j += 2) {
	                        primes[(int) (i * j)] = true;
	                    }
	                }
	            }
	        }
	        int[] prime = new int[count];
	        prime[0] = 2;
	        int count2 = 1;
	        for (int i = 3; i <= max; i += 2) {
	            if (!primes[i]) {
	                prime[count2] = i;
	                count2++;
	            }
	        }
	        int[] g = new int[max + 1];
	        for (int i = 0; i <= prime.length; i++) {
	            for (int j = i; j < prime.length && prime[i] + prime[j] <= max; j++) {
	                g[prime[i] + prime[j]]++;
	            }
	        }
	 
	           int n = Integer.parseInt(reader.readLine());
	           builder.append(g[n]).append('\n');
			   System.out.print("\nNumber of combinations: "); 
	           System.out.print(builder);
	 
	    }
}
