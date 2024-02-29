package testnglist;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomNumAndString {
 public static void main(String[] args) {
	
	 Random rand=new Random();
	 int rand_num=rand.nextInt(100);
	 System.out.println(rand_num);
	 
	 RandomStringUtils rs=new RandomStringUtils();
	 for(int i=0;i<10;i++) {
	 String rs1=rs.randomAlphabetic(10);
	 System.out.println(rs1);
}
}
}