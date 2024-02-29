package testnglist;

import java.util.Scanner;

public class Armnumber {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num=sc.nextInt();
		int orgnum=num;
		int cubednum=0;
		while(num>0) {
			
			int rem=num%10;
			cubednum=cubednum+(rem*rem*rem);
			num=num/10;
		}
		if(orgnum==cubednum) {
			System.out.println("Number is a Armstrong number");
		}
		else {
			System.out.println("Number is not a armstrong number");
		}
	}

}
