package JavaImportantPrograms;

public class WordsCount {
	
	public static void main(String[] args) {
		
		String words="The greatest lang is java";
		
		int count=1;
		
		for(int i=0;i<words.length()-1;i++) {
			
			if((words.charAt(i)==' ') && (words.charAt(i+1)!=' ')){
				count++;
			}
			
		}
		System.out.println("Number of the words count"+count);
	}

}
