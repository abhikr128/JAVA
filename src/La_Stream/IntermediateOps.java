package La_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps {
	public static void main(String[] args) {
		// Intermediate operations transform a stream into another stream.
		// They are lazy, meaning they don't execute until a terminal operation is invoked.
		
		// 1. filter
		List<String> list = Arrays.asList("Ram", "Abhishek", "Abhishek", "Shyam", "Mohan");
		Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A"));
		// no filtering at this point
		long res = list.stream().filter(x -> x.startsWith("A")).count();
		System.out.println(res);
		
		// 2. map
		Stream<String> stringStream = list.stream().map(String :: toUpperCase);
		
		// 3. sorted 
		Stream<String> sortedStream = list.stream().sorted();
		Stream<String> sortedUsingComparator = list.stream().sorted((a, b) -> a.length() - b.length());
		
		// 4. distinct
		System.out.println(list.stream().filter(x -> x.startsWith("A")).distinct().count());
		
		// 5. limit
		System.out.println(Stream.iterate(1, x -> x + 1).limit(150).count());
		
		// 6. skip
		System.out.println(Stream.iterate(1, x -> x + 1).skip(10).limit(1000).count());
		
		// 7. peek -> perform an action on each element as it is consumed
        // Stream.iterate(1, x -> x + 1).skip(10).limit(100).peek(System.out::println).count();
		
		// 8. flatMap
		// Handles streams of collections, lists or arrays where each element is itself a collection.
		// Flatten nested structures(e.g lists within lists) so that they can be processed as a single sequence of elements.
		// Transform and flatten elements at the same time.
		List<List<String>> listOfLists = Arrays.asList(
				Arrays.asList("mango", "litchi"),
				Arrays.asList("banana", "guava"),
				Arrays.asList("pears", "apple")
				);
		System.out.println(listOfLists.get(1).get(1));
		System.out.println(listOfLists.stream().flatMap(x -> x.stream()).map(String :: toUpperCase).toList());
		
		List<String> sentences = Arrays.asList(
				"Hello World",
				"Java streams are powerful",
				"flatMap is useful");
		System.out.println(sentences
				    .stream()
				    .flatMap(x -> Arrays.stream(x.split(" ")))
				    .map(String :: toUpperCase)
				    .toList());
	}

}
