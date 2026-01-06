package stream_misc;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;


public class ParallelStreamDemo {
	// Parallel Stream : A type of stream that enables parallel processing of elements
	// Allow multiple threads to process part of the stream simultaneously
	// This can significantly improve performance for large data sets
	// Workload is distributed across multiple threads
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		List<Integer> list = Stream.iterate(1, x -> x + 1).limit(1000).toList();
		List<Long> factorialslist = list.stream().map(x -> factorial(x)).toList();
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken with sequential stream: "+ (endTime - startTime)+"ms");
		
		startTime = System.currentTimeMillis();
		factorialslist = list.parallelStream().map(x -> factorial(x)).toList();
		// factorialslist = list.parallelStream().map(ParallelStream :: factorial).sequential().toList();
		endTime = System.currentTimeMillis();
		System.out.println("Time taken with parallel stream: "+ (endTime - startTime)+"ms");
		
		// parallel streams are most effective for CPU-intensive or large data sets where tasks are independent.
		// They may add overhead for simple tasks or small data sets.
		
		// cumulative sum 
		// [1, 2, 3, 4, 5] -> [1, 3, 6, 10, 15]
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		AtomicInteger sum = new AtomicInteger(0);
		List<Integer> cumulativeSum = numbers.parallelStream().map(x -> sum.addAndGet(x)).toList();
		System.out.println("Expected cumulative sum: [1, 3, 6, 10, 15]");
		System.out.println("Actual result with parallel stream: " + cumulativeSum);
		
		// Here, parallel stream will not work as tasks are not independent.
		// so, it's better to use stream not parallel stream.
	}
	
	private static long factorial(int n) {
		long result = 1;
		for(int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}

}
