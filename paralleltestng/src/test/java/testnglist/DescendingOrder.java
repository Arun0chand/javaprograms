package testnglist;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
	
	public static void main(String[] args) {
		
		
		Integer [] arr= {12,34,2,3,4,5};
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("Arrays in descindig order"+Arrays.toString(arr));
	}

}
