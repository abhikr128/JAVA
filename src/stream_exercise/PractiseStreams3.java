package stream_exercise;

import java.util.List;
import java.util.Map;

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
        
        // Q.no 35. Sort objects by multiple fields -> in another class
        
	}

}
