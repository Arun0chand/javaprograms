package JavaImportantPrograms;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		String str="madam";
		String org_string=str;
		
		int len=str.length();
		String rev= "";
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
		if(org_string.equals(rev)) {
			
			System.out.println("String is a Palindrome"+org_string);
		}else {
			
			System.out.println("String is not a palindrome" + org_string);
		}
	}

}
