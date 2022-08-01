package Day35;

import java.util.Arrays;

public class exe348 {
	  public static void main(String[] args) {
	       int arra_nums[] = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
	       System.out.println("Original array : "+Arrays.toString(arra_nums)); 
	       int j,temp,arr_size;

	        arr_size = arra_nums.length;
	        for (int i = 0; i <arr_size; i++){
	            j = i;  
	            
	           //Shift positive numbers left, negative numbers right
	         
	            while ((j > 0) && (arra_nums[j] >0) && (arra_nums[j-1] < 0)){
	                  temp = arra_nums[j];
	                  arra_nums[j] = arra_nums[j-1];
	                  arra_nums[j-1] = temp;
	                  j--;
	            }
	        }
	       System.out.println("New array : "+Arrays.toString(arra_nums)); 
	    }       
}
