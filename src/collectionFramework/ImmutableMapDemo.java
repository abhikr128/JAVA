package collectionFramework;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("Ankit", 87);
		map1.put("Vikas", 92);
		System.out.println(map1);
		
		Map<String, Integer> map2= Collections.unmodifiableMap(map1);
		// map2.put("Rahul", 95);      throws exceptions
		System.out.println(map2);
		
		Map<String, Object> map3 = Map.of("A", 1, "B", 2, "C", 3);   // Limitation- Can store upto 10 key-value pairs
		// map3.put("D", 4);       // throws exception
		System.out.println(map3); 
		
		Map<String, Integer> map4 = Map.ofEntries(Map.entry("A", 1), Map.entry("B", 2), Map.entry("C", 3));
		System.out.println(map4);           // Can stores more than 10 K-V pairs
	}

}
