package La_Stream;

import java.util.function.Function;

public class functionDemo {
	public static void main(String[] args) {
		// Function Interface
		Function<Integer, Integer> doubleIt = x -> 2*x;
		Function<Integer, Integer> tripleIt = x -> 3*x;
		System.out.println(doubleIt.apply(75));
		System.out.println(doubleIt.andThen(tripleIt).apply(15));
		
		Function<Integer, Integer> id = Function.identity();
		System.out.println(id.apply(12));
	}

}
