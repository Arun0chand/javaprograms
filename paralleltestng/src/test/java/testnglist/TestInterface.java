package testnglist;



interface Bank{  
float rateOfInterest();  
public static final int s = 10;
}  
class SBI implements Bank{  

public float rateOfInterest(){return 9.15f;}  
}  
class PNB implements Bank{  
public float rateOfInterest(){return 9.7f;}  
}  
class TestInterface{  
	
public static void main(String[] args){  
Bank b=new SBI();  
System.out.println("ROI: "+b.s);  

}
}  

