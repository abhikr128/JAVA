package La_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluationDemo {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Andrew", "Bob", "Christiano", "Dewald");
		Stream<String> streamNames = names.stream()
				                    .filter(name -> {
				                    	System.out.println("Filtering: "+ name);
				                    	return name.length() > 3;
				                    });
		System.out.println("Before terminal operation");
		
		List<String> result = streamNames.collect(Collectors.toList());
		
		System.out.println("After terminal operation");
		
		System.out.println(result);
	}

}
