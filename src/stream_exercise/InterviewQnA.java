package stream_exercise;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class InterviewQnA {
	
	public static void main(String[] args) {
		String input = "abhishek";
		
		Map<String, Long> freq = Arrays.stream(input.split(""))
				                 .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(freq);
	}

}
