package javapgall;

public class ALL {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,22,3,4,5};
		int min=arr[0];
		int max=arr[0];
		int sum=0;
		int mul=1;
		
		for(int num:arr) {
			if(num<min) {
				min=num;
			}
			else if(num>max) {
				max=num;
			}
			sum=sum+num;
			mul=mul*num;
			
		}
		System.out.println("Sum+=== "+sum);
		System.out.println("max+=== "+max);
		System.out.println("min+=== "+min);
		System.out.println("min+=== "+mul);
		
	}

}
