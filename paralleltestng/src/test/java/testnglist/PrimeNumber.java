package testnglist;

import java.util.Arrays;

public class PrimeNumber {
  public static void main(String[] args) {
	
	int a[]= {1,2,3,5,6,7,8,9,12,13};
	System.out.println("These are the prime number : ");
	for(int b:a) {
		
		int count=0;
		for(int i=1;i<=b;i++) {
			
			if(b%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(b);
		}
	}
	  
}
}











