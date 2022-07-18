package Day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class exe209 {
	 public static void main(String[] args) {
		  {
		   Scanner s = new Scanner(System.in);
		   System.out.println("Input number of elements of the array: ");
		   int n = s.nextInt();
		   System.out.println("Input number format: 2 3 4 5: ");
		   int arr[] = new int[n];
		   System.out.println("Enter elements:");
		   for (int i = 0; i < n; i++)
		    arr[i] = s.nextInt();
		   System.out.println("Enter target sum:");
		   int sum = s.nextInt();
		   int A[] = new int[arr.length];
		   A = Arrays.copyOf(arr, arr.length);
		   System.out.println("A solution set is:");
		   Subsets(A, sum);
		   System.exit(0);
		  }
}

	 public static void Subsets(int[] A, int sum) {
		  Map < Integer, List < Integer >> hashMap = new HashMap < > ();
		  insert(hashMap, 0, -1);
		  int sum_so_far = 0;
		  for (int index = 0; index < A.length; index++) {

		   sum_so_far += A[index];
		   if (hashMap.containsKey(sum_so_far - sum)) {
		    List < Integer > list = hashMap.get(sum_so_far - sum);
		    for (Integer value: list) {
		     Subsets(A, value + 1, index);
		    }
		   }
		   insert(hashMap, sum_so_far, index);
		  }
		 }

	 private static < K, V > void insert(Map < K, List < V >> hashMap, K key, V value) {
		  if (!hashMap.containsKey(key)) {
		   hashMap.put(key, new ArrayList < > ());
		  }
		  hashMap.get(key).add(value);
		 }
		 public static void Subsets(int[] A, int i, int j) {
		  System.out.print("{ ");
		  for (int k = i; k <= j; k++) {
		   System.out.print(A[k] + " ");
		  }
		  System.out.println("}");
		 }
	
	}
	
	

