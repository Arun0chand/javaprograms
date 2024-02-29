package JavaImportantPrograms;

public class Palindrome {
	public static void main(String[] args) {
		
		
		int num=1212;
		int org_num=num;
		
		int rev=0;
		
		while(num!=0) {
			
			rev=rev*10+num%10;
			num=num/10;
		}
		
		if(org_num==rev) {
			
			System.out.println("Number found to be palindrome"+rev);
		}else {
			System.out.println("Number is not a palindrome");
		}
	}

}
