package la_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>(9, 0.5f, true);  // (Initial Capacity, load factor, access order)
		map.put("Shubham", 81);                                           // Double linked list
		map.put("Pranav", 88);
		map.put("Shweta", 92);                                           // Not thread safe
		
		map.get("Shubham");
		map.get("Pranav");
		map.get("Shubham");
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		HashMap<String, Integer> hashmap = new HashMap<>();
		LinkedHashMap linkedhashmap = new LinkedHashMap(hashmap);
		
		hashmap.put("Orange", 10);
		hashmap.put("Apple", 15);
		hashmap.put("Guava", 25);
		Integer res = hashmap.getOrDefault("Vipul", 0);
		System.out.println(res);
		
		Integer put = hashmap.put("Orange", 11);
		System.out.println(hashmap);
	}

}
