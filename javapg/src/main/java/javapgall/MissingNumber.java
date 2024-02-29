package javapgall;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String senetence=sc.nextLine();

//     String org_sentence="The realworld of india";
     String mod_sentence=removeDuplicate(senetence.toUpperCase());
     System.out.println("Senetence:"+senetence);
     System.out.println("Mofified senetence:"+mod_sentence);
	}
	
	public static StringBuilder removeDuplicate(String input) {
		StringBuilder result=new StringBuilder();
		boolean [] seen=new boolean[256];
		
		for(char ch:input.toCharArray()) 
		{
			
			if(!seen[ch])
			{
				result.append(ch);
				seen[ch]=true;
			}
		}
		
		return result;
		
		
	}
}



