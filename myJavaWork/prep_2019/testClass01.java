package prep_2019;

public class testClass01 {

	public static void main(String[] args) {
	System.out.println(divide(4,0));

	}
	
	static int divide(int  a, int b) {
		int c=-1;
		try {
			
		c=a/b;
			
		}
		catch (Exception e) {
			System.out.print("Exc ");
		}
		
		finally {
		
			System.out.println("Finally ");
			
		}
		
		
		
		return c;
	}

}
