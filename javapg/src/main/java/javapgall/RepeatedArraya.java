package javapgall;

public class RepeatedArraya {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,12,3,4,5,5,5};
		int num=5;
		int count=0;
		
		for(int x:arr) {
			
			if(num==x) {
				count++;
			}
		}
		System.out.println("Count is :"+count);
	}

}
