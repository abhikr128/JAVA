package Stream_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class practiseStreams2 {
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
					                 .flatMapToInt(String::chars)          // stream of int (Unicode code points)
					                 .mapToObj(c -> (char) c)              // convert to Character
					                 .collect(Collectors.toSet());         // keep only distinct characters
        System.out.println(distinctChars);
        
        // Q.no 20. Flatten list of lists
        List<List<String>> listOfLists = Arrays.asList(
        		           Arrays.asList("hi", "there"),
        		           Arrays.asList("how", "are", "you"));
        System.out.println(listOfLists.stream().flatMap(x -> x.stream()).map(String :: toUpperCase).toList());
		
	}	
}
