package Day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exe230 {
	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Input the string:");
	        String str1 = br.readLine();
	 
	        str1 = str1.replaceAll("java", "py_thon");
	        str1 = str1.replaceAll("python", "java");
	        str1 = str1.replaceAll("py_thon", "python");
	        System.out.println("New string:");
	        System.out.println(str1);
	    }
}
