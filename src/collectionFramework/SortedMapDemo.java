package collectionFramework;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
	public static void main(String[] args) {
		SortedMap<Integer, String> map = new TreeMap<>((a, b) -> b - a);  // Descending order
		map.put(91, "Shubham");                                    // by default Ascending order
		map.put(99, "Vivek");
		map.put(78, "Vipul");
		map.put(88, "Mohit");
		System.out.println(map);
		
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println(map.headMap(88));
		System.out.println(map.tailMap(88));
	}

}
