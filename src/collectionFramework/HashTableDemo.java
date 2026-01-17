package collectionFramework;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) throws InterruptedException {
		Hashtable<Integer, String> map = new Hashtable<>();
		
		// HashTable is synchronized; Thread-safe
		// No null keys or values
		// Legacy class -> Concurrent HashMap
		// Slower than HashMap
		// Only Linked list in case of collision
		// All methods are synchronized -> and this is the limitation, we got Concurrent HashMap
		
		map.put(1, "One");
		map.put(5, "Five");
		map.put(3, "Three");
		System.out.println(map);
		
		System.out.println(map.get(1));
		System.out.println(map.containsKey(4));
		map.remove(1);
		
		
		Hashtable<Integer, String> map1 = new Hashtable<>();      // Thread-safe
		Thread thread1 = new Thread(() -> {
		    for(int i = 0; i<1000; i++) {
			   map1.put(i, "Thread1");
		    }
		}); 
		
		Thread thread2 = new Thread(() -> {
		    for(int i = 1000; i<2000; i++) {
			   map1.put(i, "Thread2");
		    }
		});
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		System.out.println(map1.size());
	}

}
