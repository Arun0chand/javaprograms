package JavaImportantPrograms;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int num=1245671;
		
		StringBuilder rev=new StringBuilder();
		
		rev.append(num);
		rev.reverse();
		
		System.out.println(rev);
		
	}

}
