package Day21;
import java.util.*;

import java.util.Arrays;

public class exe201 {
	public static void main(String[] args) {
		  int[] nums = {1,3,3,5,6,6};
		  int target = 4;
		  System.out.print("Original Array: " + Arrays.toString(nums));
		  System.out.print("\nTarget of subsets: " + target);
		  System.out.print("\nAfter removing duplicate characters: " + partition_k_subsets(nums, target));
		 }
	public static boolean partition_k_subsets(int[] nums, int k) {
		  int sum = Arrays.stream(nums).sum();
		  if (sum % k > 0) {
		   return false;
		  }
		return false;
	}
		static boolean search_subset(int used, int n, boolean[] flag, int[] nums, int target) {
		  if (n == 0) {
		   return true;
		  }
		return false;
}
}