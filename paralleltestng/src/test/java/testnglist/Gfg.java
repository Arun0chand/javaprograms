package testnglist;

 class Look {
	
	Look(String name){
		System.out.println("Constructor with single parameter"+name);
		
	}
	
	Look(String name,int id){
		System.out.println("Construcrot with the 2 parameters"+name+id);
	}
		
	Look(String name,String lastname,int id){
		
		System.out.println("With the 3 parameters"+name+lastname+id);
	}
	
	}
public class Gfg{
	
	public static void main(String[] args) {
		
		Look cs1=new Look("Arun",12);
		Look cs2=new Look("Arun");
		Look cs3=new Look("Arun","arr",12);
		
	}
}

