package apitest;

import java.util.Arrays;
import java.util.Collections;

public class LargestNumber {

	
	public static void main(String[] args) {
		
		Integer [] arr= {1,2,3,4,5,6,7,8,9};
		 Arrays.sort(arr,Collections.reverseOrder());
		 
		 System.out.println("Elements in the descending order");
		 System.out.println(Arrays.toString(arr));
		
	}
}
