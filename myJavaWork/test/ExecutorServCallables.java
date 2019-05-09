package test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServCallables {
	
	public static void main(String args []) throws InterruptedException, ExecutionException {
		ExecutorService exe = Executors.newSingleThreadExecutor();
		Future<Object> future= exe.submit(new Callable<Object>(){
			@Override
			public Object call() throws Exception {
				System.out.println("Async Call");
				return "Callable Result";
			}
			
		});		
		System.out.println(future.get());
		exe.shutdown();
	}

}
