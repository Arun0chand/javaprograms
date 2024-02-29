package testnglist;

 class Mainclass {
	
	public void add(int a) {
		System.out.println("example oveloading");
	}
    public void add(int a,int b,int c) {
    	System.out.println("Example");
    }
}
 class Overding2 extends Main{
	 

		public void add(int a) {
			System.out.println("Overind done");
		}
	 
	
}
 class Main{
	 
	 public static void main(String[] args) {
		
		 Mainclass ov1=new Mainclass();
		 ov1.add(2);
		 Overding2 ov2=new Overding2();
		 ov2.add(3);
		 
	}
	 
 }