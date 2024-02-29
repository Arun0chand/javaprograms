package testnglist;

import java.util.Arrays;

public class Ascend1 {
	public static void main(String[] args) {
		
	
	
	int [] arr= {1,2,3,4,5,6,7};
	
	Arrays.sort(arr);
	
	System.out.println("Elements in the ascending order");
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}

}
}
