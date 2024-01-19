package javapgall;

import java.util.Scanner;

public class CountVowelsConsnso {
	
	public static void main(String[] args) {
		CountVowelsConsnso obj=new CountVowelsConsnso();
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the String");
		String str=sc.nextLine();
		obj.count(str);
		
		
	}
	
	public  void count(String str) {
		int vowelscount=0;
		int consonanatscount=0;
		str=str.toUpperCase().replace(" ", "");
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='A' ||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				vowelscount++;
			}else {
				consonanatscount++;
			}
		}
		System.out.println("Number of the voels count"+vowelscount);
		System.out.println("Number of the consonanats count"+consonanatscount);
		
	}

}
