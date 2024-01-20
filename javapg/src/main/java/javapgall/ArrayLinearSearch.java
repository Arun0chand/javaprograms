package javapgall;

public class ArrayLinearSearch {
	
	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,4,5,2,3,4,6,7,8,1};
		int searchelement=4;
		boolean flag=false;
		
		for(int x:arr) {
			
			if(searchelement==x) {
				
				System.out.println("Element found ");
				flag=true;
				break;
				
				
				
			}
			
			
		}
		if(flag==false) {
			
			System.out.println("Element no found");
		}
	}

}
