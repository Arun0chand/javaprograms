package JavaImportantPrograms;

public class RemoveUppercase {
	
	public static void main(String[] args) {
		
		String remove="The Creative@$%^& World Of the@@ dAy";
		
		int str=remove.length();
		
		for(int i=0;i<str;i++) {
			
			char Characters=remove.charAt(i);
			if(!Character.isUpperCase(Characters)) {
			System.out.print(Characters);	
			}else if(!Character.isWhitespace(Characters)) {
				
				System.out.print(Characters);
			}else if(!Character.isDigit(Characters)) {
				System.out.print(Characters);
			}
		}
	}

}
