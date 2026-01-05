package stream_exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class PractiseStreams1 {
	public static void main(String[] args) {
		// Q.no 1. Count elements in a list
		List<Integer> list = Arrays.asList(3, 5, 6, 8, 9, 10);
		System.out.println(list.stream().count());
		
		// Q.no 2. Find even numbers
		System.out.println(list.stream().filter(x -> x % 2 == 0).toList());
		
		// Q.no 3. Convert list of strings to upper-case
		List<String> list2 = Arrays.asList("mango", "guava", "litchi", "apple");
		System.out.println(list2.stream().map(x -> x.toUpperCase()).toList());
		
		// Q.no 4. Sort a list
		System.out.println(list.stream().sorted().toList());
		
		// Q.no 5. Sort using custom comparator
		List<String> names = Arrays.asList("Abhimanyu", "Suman", "Ram", "Anmol", "Abhishek");
		System.out.println(names.stream().sorted((a, b) -> a.length() - b.length()).toList());
		
		List<String> sortedUsingComp = names.stream()
				                             .sorted(Comparator.comparingInt(String::length)
				                             .thenComparing(Comparator.naturalOrder()))
				                             .toList();
		System.out.println(sortedUsingComp);
		
		// Q.no 6. Remove duplicates
		List<Integer> nums = Arrays.asList(1,2,3,2,5,6,1,8,10,5);
		System.out.println(nums.stream().distinct().toList());
		
		// Q.no 7. Find maximum value
		System.out.println(list.stream().max((a, b) -> a.compareTo(b)).get());
		
		// Q.no 8. Find minimum value
		System.out.println(list.stream().min(Integer :: compareTo).get());
		
		// Q.no 9. Sum of numbers
		List<Integer> sumFn = Arrays.asList(7, 8, 3, 5, 6, 1);
		System.out.println(sumFn.stream().reduce((a, b) -> (a + b)).get());
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		// Q.no 10. Average of numbers
		List<Integer> avgFn = Arrays.asList(7, 8, 3, 5, 6, 1);
		Double result = avgFn.stream().collect(Collectors.averagingInt(x -> x));
		System.out.println(result);
		
		// Q.no 11. Convert list to set
		List<Integer> list1 = Arrays.asList(2,3,2,1,5,6,1,8,10,5);
		System.out.println(list1.stream().toList());
		System.out.println(list1.stream().collect(Collectors.toSet()));    // no duplicates in set
		list1.stream().collect(Collectors.toCollection(() -> new TreeSet<>()));  // ordered and no duplicates
		
		// Q.no 12. Check if any element matches condition
		List<String> namesStartsWithA = Arrays.asList("Karan", "Abhinav", "Raj", "Kiran", "Rahul");
		System.out.println(namesStartsWithA.stream().anyMatch(x -> x.startsWith("V")));
		
		// Q.no 13. Check if all match condition
		System.out.println(namesStartsWithA.stream().allMatch(x -> x.length() >= 3));
		
		// Q.no 14. Find first element
		System.out.println(namesStartsWithA.stream().findFirst().get());
		
		// Q.no 15. Convert list to map
		List<String> list3 = List.of("Vikram", "Naina", "Abhishek");
		Map<String, Integer> map = list3.stream().collect(Collectors.toMap(x -> x, y -> y.length()));
		System.out.println(map);
		// sorted by alphabetical order       
		Map<String, Integer> map1 = list3.stream().collect(Collectors.toMap(x -> x, y -> y.length(), (a, b) -> a, TreeMap::new));
		System.out.println(map1);           // lambda instead of TreeMap::new  ----- () -> new TreeMap<>()
		
		// Q.no 16. Group by property
	}

}
