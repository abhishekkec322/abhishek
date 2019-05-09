package prep_2019.thread;

public class HelloThread extends Thread {
	
	public static void main (String args []) {
		
	/*	HelloThread thread = new HelloThread();
		thread.start();
	*/	
		// or
		new HelloThread().start();
	}

	public void run() {
		System.out.println("Hello Thread");
	}
	
}
