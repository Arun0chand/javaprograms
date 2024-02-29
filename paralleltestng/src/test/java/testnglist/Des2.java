package testnglist;

import java.util.Arrays;
import java.util.Collections;

public class Des2 {
	
	public static void main(String[] args) {
		
		
		Integer [] arr= {1,2,3,4,5,67,8};
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}

}
