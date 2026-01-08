package la_thread;

class X extends Thread{
	public void run() {
		System.out.println("Thread A is running...");
		for(int i = 0; i<21; i++) {
			System.out.println("Hi "+i);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Y extends Thread{
	public void run() {
		System.out.println("Thread B is running...");
		for(int i = 0; i<21; i++) {
			System.out.println("Hello "+i);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadAB {
	
	public static void main(String[] args) {
		X objA = new X();
		Y objB = new Y();
		
		objA.start();
		objB.start();
	}

}
