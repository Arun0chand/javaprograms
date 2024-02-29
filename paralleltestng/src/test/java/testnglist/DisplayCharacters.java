package testnglist;

public class DisplayCharacters {
	
	public static void main(String[] args) {
		
		String inputstr="Hello world 123 @#$%";
				
		System.out.print("Special characters:");
		for(char character:inputstr.toCharArray() ) {
			if(!Character.isLetterOrDigit(character) && !Character.isWhitespace(character)) {
				System.out.print(character +" ");
			}
		}
		System.out.println();

        System.out.print("Numbers: ");
        for (char character : inputstr.toCharArray()) {
            if (Character.isDigit(character)) {
                System.out.print(character + " ");
            }
        }
		
		System.out.println();
		
		System.out.print("Uppercase are:");
		for(char character:inputstr.toCharArray()) {
			if(Character.isUpperCase(character)) {
				System.out.print(character +" ");
			}
		}
System.out.println();
		
		System.out.print("Uppercase are:");
		for(char character:inputstr.toCharArray()) {
			if(Character.isLowerCase(character)) {
				System.out.print(character +" ");
			}
		}
		
		System.out.println();
	}

}
