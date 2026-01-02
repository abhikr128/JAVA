package La_Stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class streamDemo {

	public static void main(String[] args) {
		// Feature introduced in java 8
		// Processes collections of data in a functional and declarative manner.
		// Simplify data processing
		// Embrace functional programming
		// Improve readability and maintainability
		// Enable easy parallelism
		
		// What is stream?
		// A sequence of elements supporting functional and declarative programming
		
		// How to use stream?
		// Source, intermediate operations and terminal operations
		
		List<Integer> nums = Arrays.asList(2, 3, 5, 8, 9, 10); 
		System.out.println(nums.stream().filter(n -> n % 2 == 0)); 
		
		// creating streams
		// 1.from collection
		List<Integer> list = Arrays.asList(2, 3, 5, 8, 9, 10);
		Stream<Integer> stream = list.stream();
		
		// 2. from arrays
		String [] strings = {"a", "bc", "cde"};
		Stream<String>stream1 = Arrays.stream(strings);
		
		// using Stream.of()
		Stream<String> stream2 = Stream.of("a", "b");
		
		// 4. Infinite streams
		Stream<Integer> generate = Stream.generate(() -> 1);
		Stream.iterate(1, x -> x+1 );
		
	}

}
