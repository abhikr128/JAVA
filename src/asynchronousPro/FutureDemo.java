package asynchronousPro;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {
	
	public String getFirstName() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return "Future";
	}
	
    public String getLastName() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return "Programming";
	}
	
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		System.out.println("main method : executed by thread" + Thread.currentThread().getName());
		long startTime = System.currentTimeMillis();
		
        FutureDemo futureDemo = new FutureDemo();
		Callable<String> firstNameCallable = new Callable<String>() {
			
			@Override
			public String call() throws Exception {
				System.out.println("getFirstName : executed by thread" + Thread.currentThread().getName());
				String firstName = futureDemo.getFirstName();
				return firstName;
			}
		};
		
		Callable<String> lastNameCallable = new Callable<String>() {
			
			@Override
			public String call() throws Exception {
				System.out.println("getLastName : executed by thread" + Thread.currentThread().getName());
				String lastName = futureDemo.getLastName();
				return lastName;
			}
		};
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		Future<String> firstNameFuture = executorService.submit(firstNameCallable);
		Future<String> lastNameFuture = executorService.submit(lastNameCallable);
		
		String firstName = firstNameFuture.get();
		String lastName = lastNameFuture.get();
		
		String completeName = firstName + " " + lastName;
		
		System.out.println(completeName);
	
//		futureDemo.getFirstName();                    // blocking call
//		futureDemo.getLastName();                     // blocking call
//		System.out.println(futureDemo.getFirstName() + " " + futureDemo.getLastName());
		
		System.out.println("Time taken to execute these tasks: "+(System.currentTimeMillis() - startTime));
	}

}
