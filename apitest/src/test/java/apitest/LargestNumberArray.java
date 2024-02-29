package apitest;

public class LargestNumberArray {
	
	
	public static void main(String[] args) {
		
		int[] arr= {12,13,45,67,89,23};
		
		int val=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>val) {
				
				val=arr[i];
			}
		}
		System.out.println("Largest Number in the Array is:"+val);
	}

}
