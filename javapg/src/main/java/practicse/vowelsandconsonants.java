package practicse;

public class vowelsandconsonants {
	
	public static void main(String[] args) {
		
		
		String str="Arun chandakavathe".replace(" ", "");
		
		String nstr=str.toLowerCase();	
		System.out.println(nstr);
		
		int vowelscount=0;
		int consonantscount=0;
		
		for(int i=0;i<nstr.length();i++) 
		{
			char ch=str.charAt(i);
			
			if(!(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') ||ch==' ' )
			{
				System.out.print(nstr.charAt(i));
				consonantscount++;
			}
			else 
			{
//				System.out.println(nstr.charAt(i));
				vowelscount++;
			}
		}
		System.out.println("consonant count"+consonantscount);
		System.out.println("Vowels count"+vowelscount);
	}

}
