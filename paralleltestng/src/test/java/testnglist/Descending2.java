package testnglist;

import java.util.Arrays;
import java.util.Collections;

public class Descending2 {
	
	public static void main(String[] args) {
		
		
		Integer [] arr= {12,45,56,78,99};
		
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}

}
