package javapgall;

import java.util.Arrays;



import java.util.Arrays;

import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		
	
		   
		        String names = "anil sandeep naga arun";
		        String[] words = names.split(" ");

		        for (int i = words.length - 1; i >= 0; i--) 
		        {
		            if (words[i].equals("naga")|| words[i].equals("sandeep"))
		            {
		                for (int j = words[i].length() - 1; j >= 0; j--) 
		                {
		                    System.out.print(words[i].charAt(j));
		                }
		                
		            } else {
		                System.out.print(words[i]);
		            }

		           System.out.print(" ");
		        }

		        
		        
		    }
		}
	







