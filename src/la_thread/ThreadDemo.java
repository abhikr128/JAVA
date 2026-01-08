package la_thread;

class Printer extends Thread{
	public void run() {
		System.out.println("Thread is running");
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		Printer obj = new Printer();
		obj.start();
		System.out.println("Thread is running in main");
	}

}
