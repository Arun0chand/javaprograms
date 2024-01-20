package javapgall;

import java.util.Arrays;

public class ReverseString {
	public static void main(String[] args) {

		int arr[]= {1,2,3,3,3,4,5,5,5,67};

		int duplicate[]= new int[arr.length];
        for(int i=arr.length,j=0;i>=0;i++,j++) {
        	if(arr[i]!=arr[i+1]) {
        		duplicate[j]=arr[i];
        	}
        }

  System.out.println(Arrays.toString(duplicate));
	}
}