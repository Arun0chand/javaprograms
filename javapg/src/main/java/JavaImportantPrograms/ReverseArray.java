package JavaImportantPrograms;

import java.util.Arrays;

//Java Program for Reversing an array using StringBuilder 



class ReverseArray { 
	public static void main(String[] args) {
   String []arr= {"dallu","mallu","chullu","kallu"};
   
   StringBuilder sb=new StringBuilder();
   for(int i=arr.length;i>0;i--) {
	   
	   sb.append(arr[i-1]).append(" ");
   }
   
   String[] revarr=sb.toString().split(" ");
   
   System.out.println(Arrays.toString(revarr));
	}
} 

