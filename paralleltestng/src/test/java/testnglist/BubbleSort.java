package testnglist;

import java.util.Arrays;

public class BubbleSort {
 public static void main(String[] args) {
	
	 
	 int [] arr= {1,9,4,6,2,3,5};
	 
	 System.out.println("Before sorting the array"+Arrays.toString(arr));
	 
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
	 System.out.println("After sorting "+Arrays.toString(arr));
	 System.out.println("even numbers are:");
	 for(int number:arr) {
		 if(number%2==0) {
			System.out.println(number); 
		 }
	 }
		 System.out.println("odd numbers are:");
		 for(int number1:arr) {
			 if(number1%2==1) {
				System.out.println(number1); 
			 }
    
}
		 System.out.println("First number:"+arr[0]);
		 System.out.println("Last number:"+(arr[n-1]));
}
 
}