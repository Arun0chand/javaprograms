package testnglist;

import java.util.Arrays;

public class SortArray {
	
	public static void main(String[] args) {
		
		int [] arr= {12,13,14,56,78};
		
		Arrays.sort(arr);
		System.out.println("Elements sorted array in asending order");
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
