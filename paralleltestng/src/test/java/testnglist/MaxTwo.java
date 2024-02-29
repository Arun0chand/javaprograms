package testnglist;

public class MaxTwo {
	public static void main(String[] args) {
		
		int [] arr= {111,222,333,444,22,33};
		
	    if(arr.length<2) {
	    	System.out.println("Atleast 2 nubers is requied");
	    	return;
	    }
	    
	    int max1=Integer.MIN_VALUE;
	    int max2=Integer.MIN_VALUE;
	    
	    for(int number:arr) {
	    	
	    	if(number>max1) {
	    		max2=max1;
	    		max1=number;}
	    		else if(number>max2 && number!=max1) {
    				max2=number;
	    			
	    			}
	    		}
	    System.out.println("First number:"+max1);
	    System.out.println(("Second max number"+max2));
	    	}
	    
	}



//










