package testnglist;

public class CountAll {
	
	public static void main(String[] args) {
		
		
		String inputstring="Hello world 23455 $%%^^*";
		
		int specialcharactercount=0;
		int uppercasecharacter=0;
		int smallcasecharacter=0;
		int numbers=0;
		
		System.out.println("Given string is:");
		
		for(char character:inputstring.toCharArray()) {
			if(Character.isLetter(character)){
				if(Character.isUpperCase(character)) {
					uppercasecharacter++;
				}
				else {
					smallcasecharacter++;	
				}
			}
			else if(Character.isDigit(character)) {
				numbers++;
			}
			else if(!Character.isWhitespace(character)) {
				specialcharactercount++;
			}
		
		}
		System.out.println("Print the Special characters count :"+specialcharactercount);
		System.out.println("Print the numbers count"+numbers);
		System.out.println("Print the uppercase"+uppercasecharacter);
		System.out.println("Print the Lowercase"+smallcasecharacter);
	}

}
