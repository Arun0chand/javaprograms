package JavaImportantPrograms;

import java.util.Arrays;

public class BubbleSorting {


	public static void main(String[] args) {

	int arr[]= {22,1,2,44,5,6,77,33};
	
	int len=arr.length;
	System.out.println(Arrays.toString(arr));
	
	for(int i=0;i<len-1;i++) {
		
		for(int j=0;j<len-1;j++) {
			
			if(arr[j]>arr[j+1]) {
				
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	
	System.out.println(Arrays.toString(arr));
	}
}
