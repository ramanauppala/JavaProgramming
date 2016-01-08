package Arrays;

import java.util.Arrays;

public class FindTopTwo { 
	
	public static void main(String args[]) { 
		
		getTop2InArray(new int[]{46,20, 34, 21, 87, 92, 55,88});
	}
	
	public static void getTop2InArray(int[] numbers) { 
		int max1 = Integer.MIN_VALUE; 
		int max2 = Integer.MIN_VALUE; 
		
		for (int number : numbers) { 
			if (number > max1) { 
				max2 = max1; 
				max1 = number; 
			} else if (number > max2) { 
				max2 = number; 
			} 
		} 
		
		System.out.println("Given integer array : " + Arrays.toString(numbers)); 
		System.out.println("First maximum number is : " + max1); 
		System.out.println("Second maximum number is : " + max2); 
	} 

		
} 
	
	

