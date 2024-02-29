package JavaImportantPrograms;

public class Countleters {
public static void main(String[] args) {
	
	
	String leters="Greatest@#$ world";
	
	int count=1;
	 String lettersWithoutSpecialChars = leters.replaceAll("[^a-zA-Z]", "");
	for(int i=0;i<leters.length()-1;i++) {
		
		 char currentChar = leters.charAt(i);
         if (Character.isLetter(currentChar)){
             count++;
         }
	}
	System.out.println("Count letters"+count);
}
}
