package test.day0325;






public class Test {
	private static int a=2;
	
	
	static int i = 10;
      public static void main(String[] args) {
    	   int n = i++%5; 
    	  modify(a);
          System.out.println(a);
          System.out.println(i);
            System.out.println(n);

      }
      
      
	public static void modify(int a) {
		Test.a += a;
		
		
	}

	   
	            
	   
    
		

   
	
	
}
