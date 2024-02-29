package practicse;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,1,2,3};
		System.out.println("Arrays before sort"+Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=0;j<arr.length-1;j++) {
			if(arr[j]>arr[j+1]) {	
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		
	
}
		System.out.println("After sorting"+Arrays.toString(arr));	

	}
}
