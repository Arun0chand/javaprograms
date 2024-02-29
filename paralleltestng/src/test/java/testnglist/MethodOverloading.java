package testnglist;

public class MethodOverloading {
	
	
	public static int add(int a,int b) {
		int sum=a+b;
//		System.out.println("Print"+sum);
		return sum;
	}
 public static int add(int a,int b,int c) {
	 int sum=a+b+c;
//	 System.out.println("print"+sum);
	 return sum;
 }
 
 public static void main(String[] args) {
	System.out.println(add(1,2));
	System.out.println(add(1,2,3));
}
}
