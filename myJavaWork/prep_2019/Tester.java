/*package prep_2019;

import java.io.IOException;

public class Tester {

	public static void main(String[] args) {
		
		try {
			new AirJet();
		}catch (IOException e) {
			System.out.println("Exception Thrown in Tester");
		}	

	}
	
	class AirPlane{
		
		public AirPlane() throws IOException{
			System.out.println("AirPlane");
			throw new IOException();
		}
	}
	
	class AirJet extends AirPlane{
		
		public AirJet () throws IOException{
			
			try {
				super();
				
			}catch (IOException ex){
				
				System.out.println("Airjet");
			}
		}
	}

}
*/