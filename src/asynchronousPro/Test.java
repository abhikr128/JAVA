package asynchronousPro;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
	
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		Future<String> returnValueFromCallable = executorService.submit(new Task());    // No blocking
		
		for(int i=0; i<10; i++) {
			System.out.println("Main method is running.." + " " +"run by thread: "+Thread.currentThread().getName());
		}
		//
		//
		//
		System.out.println(returnValueFromCallable.get());      // Wait...
		//
		//
	}

}

class Task implements Callable<String>{

	@Override
	public String call() throws Exception {
		for(int i = 0; i<10; i++) {
			System.out.println("Doing task by Callable.."+ " " + "run by thread: "+Thread.currentThread().getName());
		}
		return "Done doing my task";
	}
	
}



