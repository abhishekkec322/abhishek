package prep_2019.thread;

public class HelloRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello Runnable");
		System.out.println(Thread.currentThread());
	}
	
	public static void main(String args[]) {
	
		/*HelloRunnable runnable= new HelloRunnable();
		Thread t=new Thread(runnable, "Abhishek");
		t.start();*/
		
		//or		
		new Thread(new HelloRunnable()).start();
	}
}
