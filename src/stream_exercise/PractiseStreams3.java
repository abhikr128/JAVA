package stream_exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class PractiseStreams3 {
	
	public static void main(String[] args) {
		// Q.no 31. Find longest string
		List<String> longString = List.of("Today", "is", "the", "most", "important", "occasion");
		System.out.println(longString.stream().max((a, b) -> a.length() - b.length()).get());
		
		// Q.no 32. Remove empty string
		List<String> list = List.of("Today", "is","", "the", "most", "important","", "occasion");
		System.out.println(list.stream().filter(x -> x.length() > 0).toList());
		System.out.println(list.stream().filter(s -> !s.isEmpty()).toList());   // other way
		
		// Q.no 33. Convert map keys to list
		Map<String, Integer> scores = Map.of(
										"Alice", 82,
										"Bob", 78,
										"Carol", 92
										);
		System.out.println(scores.keySet().stream().toList());
		
		// Q.no 34. Convert map values to list
		Map<String, Integer> scoresValues = Map.of(
											"Alice", 82,
											"Bob", 78,
											"Carol", 92
											);
        System.out.println(scoresValues.values().stream().toList());
        
        // Q.no 35. Sort objects by multiple fields -> in another package 'stream_misc'
        
        // Q.no 36. Parallel stream -> in another package 'stream_misc'
        
        // Q.no 37. Find nth highest salary 
        List<Integer> salaries = Arrays.asList(1000, 1200, 800, 750, 2100, 4500, 2500);
        Integer fourth_highest = salaries.stream()
        		                  .distinct()
        		                  .sorted(Comparator.reverseOrder())
        		                  .skip(3).findFirst().get();
        System.out.println(fourth_highest);
        
        // Q.no 38. Find employees older than 30
        Map<String, Integer> older = Map.of(
					        		"Rahul", 28,
					        		"Abhiraj", 34,
					        		"Ganesh", 43);
        older.entrySet().stream().filter(x -> x.getValue() > 30).forEach(y -> System.out.println(y.getKey()));
        
        // Q.no 39. Convert primitive array to stream
        int [] arr = {3, 5, 8, 9, 0};
        IntStream stream = Arrays.stream(arr);
        stream.filter(x -> x > 4).forEach(x -> System.out.println(x));
        
        int[] numbers = {1, 2, 3};
        System.out.println(Arrays.stream(numbers).boxed().toList());
        
        // Q.no 40. Get top 5 elements
        List<Integer> getTop5 = Arrays.asList(90, 78, 67, 29, 89, 56, 39, 48, 98, 28, 21, 12);
        System.out.println(getTop5.stream().sorted(Comparator.reverseOrder()).limit(5).toList());
        
        // Q.no 41. Count words in a sentence
        String sentence = "Once there was a city named Tarapuram which went extinct today";
        System.out.println(Arrays.stream(sentence.split("\\s+")).collect(Collectors.counting()));
        System.out.println(Arrays.stream(sentence.trim().split("\\s+")).count());  // safer version
        
        // Q.no 42. Character frequency
        String sentense2 = "hello Abhi, welcome to office";
        System.out.println(sentense2.chars()
        		                    .mapToObj(c -> (char)c)
        		                    .collect(Collectors.groupingBy(c -> c, Collectors.counting())));
        
        // Q.no 43. Check Palindrome using streams
        String word = "reviver";
        
        boolean isPalindrome = IntStream.range(0, word.length()/2)
        		                        .allMatch(i -> word.charAt(i) == word.charAt(word.length()-1-i));
        System.out.println(isPalindrome);
        
        // Q.no 44. Find common elements in two lists
        List<String> list1 = Arrays.asList("mango", "apple", "banana", "litchi");
        List<String> list2= Arrays.asList("mango", "orange", "banana", "guava");
        
        Set<String> commonList = list1.stream().filter(list2 :: contains).collect(Collectors.toSet());
        System.out.println(commonList);     // (list2 :: contains) can be written as (x -> list2.contains(x))
        
        // Q.no 45. Get only numbers from mixed list
        
	}

}
