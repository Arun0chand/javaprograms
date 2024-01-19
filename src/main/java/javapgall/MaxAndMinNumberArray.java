package javapgall;

public class MaxAndMinNumberArray {
	
	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,4,5,6,7,22,3,4,5};
		int min=arr[0];
		int max=arr[0];
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			else if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("min element in a array is:"+min);
		System.out.println("Max element in array is:"+max);
	}

}
