package testnglist;

public class Swap1Numbers {
	public static void main(String[] args) {

    String s1="java";
    String s2="mava";
     System.out.println("Before Swapping ");
     System.out.println("s1=>"+s1);
     System.out.println("s2=>"+s2);
      
    s1=s1+s2;//javamava=8
    s2=s1.substring(0, s1.length()-s2.length());//8-4=4 java
    s1=s1.substring(s2.length());//mava
    
     
     System.out.println("After Swapping ");
     System.out.println("s1=>"+s1);
     System.out.println("s2=>"+s2);
     
	}
}
