package javapgall;

import java.util.Scanner;

public class RemoveVowels {
	
	public void remove(String str) {
		
		String str1="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if( !(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')) {
				str1=(str1+ch);
			}
		}
		System.out.println("output"+str1);
		
	}
	public static void main(String[] args) {
		RemoveVowels rv=new RemoveVowels();
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the input");
		String str=sc.nextLine();
		rv.remove(str);
		
	}

}
