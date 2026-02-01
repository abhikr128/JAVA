package asynchronousPro;

import java.util.concurrent.CompletableFuture;

public class CompFutureDemo2 {
	
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
	
	
	public static void main(String[] args){
		
		System.out.println("main method : executed by thread" + Thread.currentThread().getName());
		long startTime = System.currentTimeMillis();
		
        CompFutureDemo2 futureDemo2 = new CompFutureDemo2();
        
        CompletableFuture<String> cfFirstName = CompletableFuture.supplyAsync(() -> futureDemo2.getFirstName());
        CompletableFuture<String> cfLastName = CompletableFuture.supplyAsync(() -> futureDemo2.getLastName());
        
        String finalOutput = cfFirstName.thenCombine(cfLastName, (str1, str2) -> str1 + " " + str2).join();
        
        System.out.println(finalOutput);
    
		System.out.println("Time taken to execute these tasks: "+(System.currentTimeMillis() - startTime));
	}

}

