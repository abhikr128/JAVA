package la_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(31, "Shubham");
		map.put(12, "Neha");
		map.put(21, "Akshit");
		
		System.out.println(map);
		
		System.out.println(map.get(21));
		System.out.println(map.get(25));
		
		System.out.println(map.containsKey(12));
		System.out.println(map.containsValue("Shubham"));
		
		for(int i : map.keySet()) {
			System.out.println(map.get(i));
		}
		
		Set<Map.Entry<Integer, String>> entries = map.entrySet();
		for(Map.Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());	
		}
		for(Map.Entry<Integer, String> entry : entries) {
		    System.out.println(entry.setValue(entry.getValue().toUpperCase()));
		}
		System.out.println(map);
		
	}

}
