package JavaImportantPrograms;

public class DuplicateCountNumbers {
	
	public static void main(String[] args) {
		
		
		String arr[]= {"Arun","anil","arun","santu","jaggu","aRun"};
		
		int dupcount=0;
		boolean flag=false;
		
		for(int i=0; i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i].equalsIgnoreCase(arr[j])) {
					flag=true;
					dupcount++;
					System.out.println("Element found duplicate:=== "+arr[i]);
					
				}
			}
		}
		if(flag=false) {
			System.out.println("Element not found duplicate");
		}
		
		System.out.println(dupcount++);
		
	}

}
