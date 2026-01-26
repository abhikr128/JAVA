package stream_misc;

public class EvenOddPrinterBy2Thread implements Runnable{
	
	static int count = 1;
	Object object;
	
	public EvenOddPrinterBy2Thread(Object object) {
		super();
		this.object = object;
	}
	
	@Override
	public void run() {
		while(count <= 10) {
			if(count%2==0 && Thread.currentThread().getName().equals("Even")) {
				synchronized (object) {
					System.out.println("Thread name: "+Thread.currentThread().getName()+" value: "+count);
					count++;
					try {
						object.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			if(count%2!=0 && Thread.currentThread().getName().equals("Odd")) {
				synchronized (object) {
					System.out.println("Thread name: "+Thread.currentThread().getName()+" value: "+count);
					count++;
					object.notify();
				}
			}
		}
	}
	public static void main(String[] args) {
		Object lock = new Object();
		Runnable r1 = new EvenOddPrinterBy2Thread(lock);
		Runnable r2 = new EvenOddPrinterBy2Thread(lock);
		new Thread(r1, "Even").start();
		new Thread(r2, "Odd").start();
	}

}
