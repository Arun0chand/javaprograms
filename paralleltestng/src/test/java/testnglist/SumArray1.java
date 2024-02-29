package testnglist;

import java.util.Arrays;

public class SumArray1 {

	public static void main(String[] args) {
    
		int arr[]= {1,2,3,4,5};
		int arr1[]= {1,2,3,4,5,6};
		
		if(arr.length!=arr1.length) {
			System.out.println("Two arrays lenght should be equal");
			return;
		}
	      int [] sumarray=new int[arr.length];
	      for(int i=0;i<arr.length;i++) {
	    	  sumarray[i]=arr[i]+arr1[i];
	      }
		System.out.println("Sum of the array:"+Arrays.toString(arr));
		System.out.println("Array 2:"+Arrays.toString(arr1));
		System.out.println("Sum array:"+Arrays.toString(sumarray));
	}
}


