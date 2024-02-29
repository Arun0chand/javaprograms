package testnglist;

import java.util.Arrays;

public class SumOfArray {
	
	public static void main(String[] args) {
		
		int [] arr= {12,23,4,56,6,7,7};
		System.out.println("Before sorting :"+Arrays.toString(arr));
		
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			
			for(int j=0;j<n-1;j++) {
				if(arr[j]<arr[j+1]) {
					
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	
		
System.out.println("After sorting :"+Arrays.toString(arr));
}
}