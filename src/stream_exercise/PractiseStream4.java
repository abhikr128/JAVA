package stream_exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PractiseStream4 {

	public static void main(String[] args) {
		// Q.no 46. Handle optional values safely
		Optional<String> maybeName = Optional.of("Abhi");

        List<String> result =maybeName
	                        .stream()              
	                        .map(String::toUpperCase)
	                        .collect(Collectors.toList());

        System.out.println(result);
		
        // Q.no 47. Sort list of strings by last character
        List<String> names = List.of("abhi", "carolina", "john", "bravo");
        System.out.println(names.stream().sorted(Comparator.comparing(x -> x.charAt(x.length()-1))).toList());
        
        // Q.no 48. Filter numbers starting with 1
        List<Integer> nums = Arrays.asList(12, 23, 34, 18, 101, 81, 15);
        System.out.println(nums.stream().map(x -> String.valueOf(x)).filter(s -> s.startsWith("1")).toList());
        
        // Q.no 49. Find duplicate characters in string
        String s = "programming";
        Set<Character> duplicates =s.chars()
					                 .mapToObj(c -> (char)c)
					                 .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
					                 .entrySet().stream()
					                 .filter(e -> e.getValue() > 1)
					                 .map(Map.Entry::getKey)
					                 .collect(Collectors.toSet());

        System.out.println(duplicates); 
        
        // Q.no 50. Convert stream back to array
        Stream<Integer> nums1 = Stream.of(10, 20, 30);
        Integer[] arr = nums1.toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));
        
        Stream<String> names1 = Stream.of("Tom", "Jerry", "Spike");
        String[] arr1 = names1.toArray(String[]::new);
        System.out.println(Arrays.toString(arr1));
	}

}
