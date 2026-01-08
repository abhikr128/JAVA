package la_thread;

class Counter{
	int count;
	public synchronized void increment () {
		count++;
	}
}

//class A implements Runnable{
//	public void run() {
//		System.out.println("Thread A...");
//		
//		for(int i =0; i <20; i++) {
//			c.increment();
//		}
//	}
//}

//class B implements Runnable{
//	public void run() {
//		System.out.println("Thread B...");
//		
//		for(int i =0; i <20; i++) {
//			c.increment();
//		}
//	}
//}

public class Runble_Thread {
	public static void main(String[] args) throws InterruptedException {
		
//		A objA = new A();
//		B objB = new B();
		
		Counter c = new Counter();
		
		Runnable objA = () -> {
			System.out.println("Thread A...");
			
			for(int i =0; i <250; i++) {
				c.increment();
			}
		};
		
		Runnable objB = () -> {
			System.out.println("Thread B...");
			
			for(int i =0; i <250; i++) {
				c.increment();
			}
		};
		Thread t1 = new Thread(objA);
		Thread t2 = new Thread(objB);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(c.count);
		
	}

}
