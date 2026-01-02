package Lambda;

public class ThreadDemo {
	public static void main(String[] args) {
		Runnable thread1 = () -> {
			for(int i=1; i<=10; i++) {
				System.out.println("Value of i is "+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t = new Thread(thread1);
		t.start();
		
		Runnable thread2 = () -> {
			for(int i=1; i<=10; i++) {
				System.out.println(i*2);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t2 = new Thread(thread2);
		t2.start();
	}

}