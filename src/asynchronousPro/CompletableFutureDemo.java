package asynchronousPro;

import java.util.concurrent.CompletableFuture;


public class CompletableFutureDemo {
	
	public String getName() {
		
		System.out.println("getName : executed by: " + Thread.currentThread().getName());
			
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return "Completable Future";
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main method : executed by: " + Thread.currentThread().getName());
		CompletableFutureDemo completableFutureDemo = new CompletableFutureDemo();
		
		CompletableFuture.supplyAsync(() -> completableFutureDemo.getName())
		                                             .thenApply(str -> str.toUpperCase())
		                                             .thenAccept(str -> System.out.println(str));
		
		System.out.println("Done...");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
