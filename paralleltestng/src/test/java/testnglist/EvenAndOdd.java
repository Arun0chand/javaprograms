package testnglist;

import java.util.Arrays;

public class EvenAndOdd {
 public static void main(String[] args) {
	
	 
	 
	 int arr[]= {1,2,3,4,5,6,7,8,9};
	 
	 System.out.print("Print the odd numbers in a array:");
	 
	 for(int i=0;i<arr.length;i++) {
		 if(arr[i]%2!=0) {
			System.out.println((arr[i]+" ")); 
		 }
	 }
	 System.out.print("Print the even numbers in a array:");
	 
	 for(int i=0;i<arr.length;i++) {
		 if(arr[i]%2==0) {
			 System.out.println(arr[i]+" ");
		 }
	 }
}
}
