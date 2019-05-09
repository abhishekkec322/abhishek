package test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServRunnable {
	
	public static void main(String args []) throws InterruptedException, ExecutionException {
		ExecutorService exe = Executors.newSingleThreadExecutor();
		exe.execute(new Runnable(){
			@Override
			public void run() {
				System.out.println("Async Call");
			}
			
		});	
		exe.shutdown();
	}	
}
