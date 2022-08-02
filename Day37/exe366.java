package Day37;

import java.util.Arrays;

public class exe366 {
	public static int largest_sum(int[] A)
	{
		int max_ele_val = 0;
		int max_end = 0;
		for (int i: A)
		{
			max_end = max_end + i;
			max_end = Integer.max(max_end, 0);

			max_ele_val = Integer.max(max_ele_val, max_end);
		}
		return max_ele_val;
	}
	public static void main(String[] args)
	{
		int[] A = {1, 2, -3, -4, 0, 6, 7, 8, 9};
		System.out.println("\nOriginal array: "+Arrays.toString(A));
		System.out.println("The largest sum of contiguous sub-array: " + largest_sum(A));
	}
}
