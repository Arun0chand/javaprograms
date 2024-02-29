package testnglist;

public class Repated {
	
	public static void main(String[] args) {
		
		
		String inputString="Welcome@@@@@ to TechActive";
		int [] charCount=new int[256];
		inputString=inputString.toLowerCase();
		
		for(int i=0;i<inputString.length();i++) {
			char c=inputString.charAt(i);
			if(c!=' ') {
				charCount[c]++;
			}
		}
		System.out.println("Repeated characters with there count is:");
		for(int i=0;i<charCount.length;i++) {
			
			if(charCount[i]>1) {
				char repeatedChar=(char)i;
				System.out.println(repeatedChar+" :"+charCount[i]);
			}
		}
	
		
		
	}
}
