package testnglist;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SP {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		
		String inputstring="Hello 1234 given";
		
		System.out.println("Given String is:"+inputstring);
		
		System.out.print("Print the special Characters");
		for(char character:inputstring.toCharArray()) {
			
			if(!Character.isLetterOrDigit(character) && !Character.isWhitespace(character)) {
				System.out.println(character+" ");
			}
		}
		System.out.println();
		
		System.out.print("Print the numbers:");
		for(char character:inputstring.toCharArray()) {
			if(Character.isDigit(character)) {
				System.out.println(character+" ");
			}
		}
		System.out.println();
		
		System.out.print("Print the uppercase letters:");
		for(char character:inputstring.toCharArray()) {
			if(Character.isUpperCase(character)) {
				System.out.println(character+" ");
			}
		}
		System.out.println();
		System.out.print("Print the lower case letters");
		for(char character:inputstring.toCharArray()) {
			if(Character.isLowerCase(character)) {
				System.out.println(character+" ");
			}
		}
	}

}
