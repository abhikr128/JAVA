package stream_misc;

public class EvenOddPrint {
	
	// Traditional Method
	
	private static boolean flag = true;
	
	private static final Object lock = new Object();
	
	public static void main(String[] args) {
		Runnable oddNum = new Runnable() {
			
			@Override
			public void run() {
				for(int i=1; i<=20; i++) {
					if(i%2!=0) {
						synchronized (lock) {
							if(!flag) {
								try {
									lock.wait();
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
							System.out.println("Thread Odd: "+ Thread.currentThread().getName()+" : "+ i);
							flag = false;
							lock.notify();
						}
						
					}
				}
				
			}
		};
		
		Runnable evenNum = new Runnable() {
			
			@Override
			public void run() {
				for(int i=1; i<=20; i++) {
					if(i%2==0) {
						synchronized (lock) {
							if(flag) {
								try {
									lock.wait();
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
							System.out.println("Thread Even: "+ Thread.currentThread().getName()+" : "+ i);
							flag = true;
							lock.notify();
						}
						
					}
				}
				
			}
		};
		Thread t1 = new Thread(oddNum);
		Thread t2 = new Thread(evenNum);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
