package la_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUcashe<K, V> extends LinkedHashMap<K, V>{
	
	private int capacity;
	
	public LRUcashe(int capacity) {
		super(capacity, 0.75f, true);
		this.capacity = capacity;
	}
	
	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return size() > capacity;
	}




	public static void main(String[] args) {
		LRUcashe<String, Integer> studentMap = new LRUcashe<>(3);
		studentMap.put("Ankita", 82);
		studentMap.put("Shubham", 78);
		studentMap.put("Vipul", 92);
		studentMap.put("Harsh", 75);
		studentMap.put("Harsh", 96);
		studentMap.put("Ankita", 82);
		studentMap.put("Shubham", 78);
		System.out.println(studentMap);
	}

}
 
