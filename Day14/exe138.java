package Day14;

import java.util.ArrayList;
import java.util.Arrays;

public class exe138 {
	public static void main(String[] args) {
		//String [] dict = {"cat", "flag", "green", "country", "w3resource"};
		String [] dict = {"cat", "dog", "red", "is", "am"};
		System.out.println("Original dictionary : "+Arrays.toString(dict));
		System.out.println("Longest word(s) of the above dictionary: "+longestWords(dict));
	}

	 static ArrayList<String> longestWords(String[] dictionary) {
	        ArrayList<String> list = new ArrayList<String>();
	        int longest_length = 0;
	        for (String str : dictionary) {
	            int length = str.length();
	            if (length > longest_length) {
	                longest_length = length;
	                list.clear();
	            }
	            if (length == longest_length) {
	                list.add(str);
	            }
	        }
	        return list;
	    }
}
