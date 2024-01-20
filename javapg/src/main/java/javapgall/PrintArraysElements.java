package javapgall;

import java.util.Arrays;

public class PrintArraysElements {

	
	public static void main(String[] args) {
		
		int arr[]= {12,13,99,211111,3,4,5,6};
		System.out.println("Befor Soting the elements");
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("After sorting");
		System.out.println(Arrays.toString(arr));
	}
}
