package stream_misc;

public class DeadlockDemo {
	
	public static void main(String[] args) {
		
		Object varshaKey = new Object();
		Object harshaKey = new Object();
		
		Thread varsha = new Thread(() -> {
			synchronized (harshaKey) {
				System.out.println("Varsha has got Harsha's key");
				try {
					System.out.println("Varsha sleeping for 3 sec");
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Varsha woke up");
				synchronized (varshaKey) {
					System.out.println("Varsha has got her key");
				}
			}
				
		});
		
		Thread harsha = new Thread(() -> {
			synchronized (varshaKey) {
				System.out.println("Harsha has got Varsha's key");
				try {
					System.out.println("Harsha sleeping for 3 sec");
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Harsha woke up");
				synchronized (harshaKey) {
					System.out.println("Harsha has got her key");
				}
			}
				
		});
		
		varsha.start();
		harsha.start();
		
		
	}
	
}

