package testnglist;

public class DPString {
	
	public static void main(String[] args) {
		
		String [] arr= {"qwe","aa","qwe","arr","arr","aa"};
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					System.out.println("String found duplicate:"+arr[i]);
					flag=true;
				}
			}
		}
		if(flag=false) {
			System.out.println("String not found duplicate:");
		}
	}

}
