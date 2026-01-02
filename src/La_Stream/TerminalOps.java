package La_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TerminalOps {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 5, 8);
		
		// 1. collect
		list.stream().skip(1).collect(Collectors.toList());
		list.stream().skip(1).toList();   // Both are same
		
		// 2. for Each
	    list.forEach(x -> System.out.println(x));
	    
	    // 3. reduce : Combines elements to reduce to a single result
	    Optional<Integer> reduced = list.stream().reduce((x,y) -> (x + y));  // (x,y) -> (x + y) = (Integer :: sum) Method reference
	    System.out.println(reduced.get());
        
	    // 4. count
	    
	    // 5. anyMatch, allMatch, noneMatch
	    boolean b = list.stream().anyMatch(x -> x%2 ==0);
	    System.out.println(b);
	    
	    boolean c = list.stream().allMatch(x -> x > 0);
	    System.out.println(c);
	    
	    boolean d = list.stream().noneMatch(x -> x < 7);
	    System.out.println(d);
	    
	    // 6. findFirst, findAny
	    System.out.println(list.stream().findFirst().get());
	    System.out.println(list.stream().findAny().get());
	    
	    // 7. toArray
	    Object[] array = Stream.of(2, 4, 5).toArray();
	    
	    // 7. max/min
	    System.out.println("max: "+ Stream.of(56, 78, 34).max(Comparator.naturalOrder()).get());
	    
	    // 8. forEachOrdered
	    List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	    System.out.println("using for each with parallel stream");
	    number.parallelStream().forEach(System.out :: println);   // output is unordered
	    System.out.println("using forEachOrdered with parallel stream");
	    number.parallelStream().forEachOrdered(System.out :: println);   // output is ordered
	    
	    // example: filtering and collecting names
	    List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
	    System.out.println(names.stream().filter(x -> x.length() > 3).toList());
	    
	    // examples: squaring and sorting numbers
	    List<Integer> nums = Arrays.asList(5, 2, 6, 8, 9);
	    System.out.println(nums.stream().map(x -> x*x).sorted().toList());
	    
	    // example: summing values
	    List<Integer> nums1 = Arrays.asList(3, 2, 5, 6, 8);
	    System.out.println(nums1.stream().reduce((x, y) -> x + y).get());
	    
	    // example: counting occurrence of characters  // traditional method
	    String sentence = "Hello world";
	    int count = 0;
	    for(int i = 0; i< sentence.length(); i++) {
	    	if(sentence.charAt(i) == 'l') {
	    		count++;
	    	}
	    }
	    System.out.println(count);
	    // using stream method
	    String sentence1 = "Hello world";    // .chars converts strings in IntStream.
	    System.out.println(sentence1.chars().filter(x -> x == 'l').count());
	    
	    // example
	    // stream can't be reused after a terminal operation has been called.
	    Stream<String> stream = names.stream();
	    stream.forEach(System.out :: println);     // forEach is a terminal operation
//	    List<String> list2 = stream.map(String :: toUpperCase).toList();   // exception
 
   
	}

}
