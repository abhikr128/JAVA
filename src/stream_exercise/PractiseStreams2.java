package stream_exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PractiseStreams2 {
	public static void main(String[] args) {
		
		// Q.no 17. Partition into true/false
		List<Integer> nums = Arrays.asList(1, 4, 3, 11, 32, 89, 22, 45);
		System.out.println(nums.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0)));
		
		List<String> list = List.of("Hello", "Abhishek", "Welcome", "Back", "To", "GrandArena");
		System.out.println(list.stream().collect(Collectors.partitioningBy(x -> x.length() > 5)));
		
		// Q.no 18. Join strings
		System.out.println(list.stream().collect(Collectors.joining(" ")));	
		
		// Q.no 19. Get distinct characters from words
		List<String> words = Arrays.asList("hello", "world");
        Set<Character> distinctChars =words.stream()
					                 .flatMapToInt(String::chars)      // stream of int (Unicode code points)
					                 .mapToObj(c -> (char) c)          // convert to Character
					                 .collect(Collectors.toSet());     // keep only distinct characters
        System.out.println(distinctChars);
        
        // Q.no 20. Flatten list of lists
        List<List<String>> listOfLists = Arrays.asList(
        		           Arrays.asList("hi", "there"),
        		           Arrays.asList("how", "are", "you"));
        System.out.println(listOfLists.stream().flatMap(x -> x.stream()).map(String :: toUpperCase).toList());
		
        // Q.no 21. Limit elements
        
        // Stream<Integer> generate1 = Stream.generate(() -> 1);
        
        // List<Integer> list2 = Stream.iterate(1, x -> x + 1).limit(11).toList();
        // list2.forEach(System.out::println);
        
        System.out.println(Stream.iterate(1, x -> x + 1).limit(11).toList());
        
        // Q.no 22. Skip elements
        System.out.println(Stream.iterate(1, x -> x + 1).skip(10).limit(100).toList());
        
        // Q.no 23. Peek while processing
        List<Integer> nums1 = List.of(1, 2, 3);
        nums1.stream()
            .peek(n -> System.out.println("Saw: " + n))  // debug/log
            .map(n -> n * 2)
            .forEach(System.out::println);
        // other example
        List<Integer> list3 = Arrays.asList(2, 5, 8, 0);
        System.out.println(list3.stream().peek(n -> System.out.println(n)).map(n -> n + 3).toList());
        
        // Q.no 24. Custom collector
        
        // Q.no 25. Find duplicate elements
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 1);
        Set<Integer> seen = new HashSet<>();
        System.out.println(numbers.stream().filter(n -> !seen.add(n)).toList());
        
        // Q.no 26. Remove null values
        List<String> names = Arrays.asList("Ram", "Shyam", "Ghanshyam", null, "Abhishek", null);
        System.out.println(names.stream().filter(x -> x != null).toList());
        
        // Q.no 27. Sort map by value
        List<Integer> sortMap = Arrays.asList(9, 4, 8, 6, 1, 0, 11);
        System.out.println(sortMap.stream().sorted().toList());
        
        // Q.no 28. Find second highest number
        List<Integer> SecHighest = Arrays.asList(2, 5, 6, 1, 8, 0, 9, 9);
        int result = SecHighest.stream()
        		               .distinct()
        		               .sorted(Comparator.reverseOrder())
        		               .skip(1)
        		               .findFirst().get();
        System.out.println(result);
        
        // Q.no 29. Reverse sort
        List<Integer> revsOrder = Arrays.asList(2, 5, 6, 1, 8, 0, 9);
        System.out.println(revsOrder.stream().sorted(Comparator.reverseOrder()).toList());
        
        // Q.no 30. Find frequency of each element
        List<Integer> freq = Arrays.asList(1, 0, 2, 0, 1, 3, 2, 3, 0, 2);
        System.out.println(freq.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting())));
        
	}
        	
}
