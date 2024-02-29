package practicse;

import java.util.Arrays;
import java.util.Collections;

public class Revarray {

	
	public static void main(String[] args) {
		String str="madam";
		String org_string=str;
		String rev="";
		
//		StringBuilder sb=new StringBuilder(str);
//		
//		sb.reverse();
//		System.out.println(sb);
		
		
		for(int i=str.length()-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);
		
		if(org_string.equals(rev)) {
			
			System.out.println("Given string is palindrome:"+rev);
		}
		
		else{
			System.out.println("Given string is not a palindrome");
		}
		
		
	}
}
