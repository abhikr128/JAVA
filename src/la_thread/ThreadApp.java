package la_thread;

class Sprint extends Thread{
	public void run() {
		System.out.println("Child thread is running...");
		
		for(int i = 0; i < 100; i++) {
			System.out.println("child "+i);
		}
	}
}

public class ThreadApp {
	public static void main(String[] args) {
		Sprint print = new Sprint();
		print.start();
		
		System.out.println("Main thread is running...");
		for(int i = 0; i < 100; i++) {
			System.out.println("main "+i);
		}
	}

}
