package practicse;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str="Arun chandakavathe";
		boolean flag=false;
		String org_str=str;
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			if(org_str.equals(rev)) {
				System.out.println("Given string is Palindrome: "+org_str);
				flag=true;
			}
			
		}
		
		if(flag=false) {
			
			System.out.println("Given string is not palindrome: ");
		}
		
		
		
	}

}
