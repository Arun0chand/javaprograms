package practicse;

public class MAX {
	
	public static void main(String[] args) {
		
		int arr[]= {2,3,4,5,6,7,12,3,4};
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
			else if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		System.out.println("MAx number is "+max);
		System.out.println("MIN number is"+min);
	}

}
