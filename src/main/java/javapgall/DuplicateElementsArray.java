package javapgall;

public class DuplicateElementsArray {
	
	public static void main(String[] args) {
		
		String arr[]= {"java","sharp","lava","C++"};
		boolean flag=false;
		int duplicate_count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i].equalsIgnoreCase(arr[j])) {
					System.out.println("Duplicate element found"+arr[i]);
					flag=true;
					duplicate_count++;
				}
			}
		}
		
		if(!flag) {
			System.out.println("Duplicate element not found");
		}
		
	System.out.println("duplicate_count :"+duplicate_count);

}
}
