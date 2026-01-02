package La_Stream;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
//import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class CollectorsDemo {

	public static void main(String[] args) {
		// It's a utility class
		// It provides a set of methods to create a common collectors
		
		// 1. Collecting to a list
		List<String> names = Arrays.asList("Alice", "Bewer", "Charlie", "Virat", "Sachin", "Andrew");
		List<String> result = names.stream()
				             .filter(x -> x.startsWith("A"))
				             .collect(Collectors.toList());
		System.out.println(result);
		
		// 2. Collecting to a set
		List<Integer> nums = Arrays.asList(2, 3, 2, 4, 5, 7, 5, 8);
		Set<Integer> result1 = nums.stream()
				               .collect(Collectors.toSet());
		System.out.println(result1);
		
		// 3. Collecting to a specific collection
		ArrayDeque<String> collect = names.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));
		System.out.println(collect);
		
		// 4. Joining Strings  -> concatenates stream elements into a single string
		String concatenatedNames = names.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(concatenatedNames);
		
		// 5. Summarizing data
		// Generates statistical summary (count, min, max, sum, average)
		List<Integer> number = Arrays.asList(2, 3, 5, 6, 8, 9);
		IntSummaryStatistics stats = number.stream().collect(Collectors.summarizingInt(x -> x));
		System.out.println("Avg: " + stats.getAverage());
		System.out.println("Count: " + stats.getCount());
		System.out.println("Max: " + stats.getMax());
		System.out.println("Sum: " + stats.getSum());
		
		// 6. calculating avg direct
		Double res = number.stream().collect(Collectors.averagingInt(x -> x));
		System.out.println("Avg: " + res);
		
		// 7. Grouping elements
		List<String> words = Arrays.asList("Hello", "World", "Java", "Welcomes", "Abhishek");
		System.out.println(words.stream().collect(Collectors.groupingBy(x -> x.length())));
		
		System.out.println(words.stream().collect(Collectors.groupingBy(x -> x.length(), Collectors.joining(", "))));
		System.out.println(words.stream().collect(Collectors.groupingBy(x -> x.length(), Collectors.counting())));
		
		// 8. Partitioning elements
		// Partition elements into two groups (true and false) based on a predicate
		System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5)));
		
		// 9. Mapping and collecting
		// Applies a mapping function before collecting
		List<String> outcome = words.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList()));
		System.out.println(outcome);
		
		// 10. toMap
		
		// Example 1: Collecting names by length
		List<String> l1 = Arrays.asList("Abhishek", "Suman", "Anmol", "Abhimanyu", "Divyanshu");
		System.out.println(l1.stream().collect(Collectors.groupingBy(x -> x.length())));
		
		// Example 2: Counting word occurrences
		String sentence = "hello world hello java world";
		System.out.println(Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting())));
		
		// Example 3: Partitioning even and odd numbers
		List<Integer> l2 = Arrays.asList(2, 4, 5, 3, 6, 8, 9);
		System.out.println(l2.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0)));
		
		// Example 4: Summing value in a map
//		Map<String, Integer> items = new HashMap<>();
//		items.put("Apple", 20);
//		items.put("Mango", 18);
//		items.put("Banana", 12);
//		System.out.println(items.values().stream().collect(Collectors.summarizingInt(x -> x)));
		
		// Example 5: Creating a map from string elements
		List<String> fruits = Arrays.asList("Apple", "Oranges", "Guava");
		System.out.println(fruits.stream().collect(Collectors.toMap(x -> x.toUpperCase(), x -> x.length())));
		
		// Final example
		List<String> fruits2 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple", "orange");
		System.out.println(fruits2.stream().collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> (x + y))));
		
	}

}
