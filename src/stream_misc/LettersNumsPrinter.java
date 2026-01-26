package stream_misc;


public class LettersNumsPrinter {
	
	private static boolean printLetter = true;
	
	private static final Object lock = new Object();
	
	public static void main(String[] args) {
		Runnable letterTask = new Runnable() {
			
			@Override
			public void run() {
				for(char ch='A'; ch <= 'Z'; ch++) {
					synchronized (lock) {
						if(!printLetter) {
							try {
								lock.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						System.out.print(ch+" ");	
						printLetter = false;
						lock.notify();
					}
				}
				
			}
		};
		
		Runnable numberTask = new Runnable() {
			
			@Override
			public void run() {
				for(int i=1; i<=26; i++) {
					synchronized (lock) {
						if(printLetter) {
							try {
								lock.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						System.out.print(i + " ");
						printLetter = true;
						lock.notify();
					}
				}
				
			}
		};
		
		Thread t1 = new Thread(letterTask);
		Thread t2 = new Thread(numberTask);
		
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
