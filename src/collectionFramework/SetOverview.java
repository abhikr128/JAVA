package collectionFramework;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetOverview {
	public static void main(String[] args) {
		
		// Set is a collection that doesn't contain duplicate elements
		// Faster operations
		// Map -> HashMap, LinkedHashMap, TreeMap, EnumMap
		// Set -> HashSet, LinkedHashSet, TreeSet, EnumSet
		
		Set<Integer> set = new HashSet<>();              // HashSet -> Unordered and unsorted
		set.add(12);
		set.add(9);
		set.add(18);
		System.out.println(set);
		
		Set<Integer> set1 = new LinkedHashSet<>();       // LinkedHashSet -> Ordered
		set1.add(12);
		set1.add(9);
		set1.add(18);
		System.out.println(set1);
		
		Set<Integer> set2 = new TreeSet<>();             // TreeSet -> Sorted
		set2.add(12);
		set2.add(9);
		set2.add(18);
		System.out.println(set2);
		
		// For thread safety
		Set<Integer> set3 = new ConcurrentSkipListSet<>();
		
		// Unmodifiable
		Set<Integer> set4 = Set.of(12, 5, 6, 8, 34);	// We can add any no. of elements
		
	}
}
