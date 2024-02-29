package testnglist;

public class Large1 {
	
	public static void main(String[] args) {
		
	
	int [] arr= {1,2,3,4};
	int val=arr[0];
	
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i]>val) {
			val=arr[i];
		}
	}
	System.out.println(val);

	}
}
