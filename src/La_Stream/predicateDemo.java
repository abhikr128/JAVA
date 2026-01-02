package La_Stream;

import java.util.function.Predicate;

public class predicateDemo {
	public static void main(String [] args) {
		Predicate<Integer> isEven = x -> x%2==0;
		System.out.println(isEven.test(7));
		
		Predicate<String> isStartWithA = x -> x.startsWith("A");
		System.out.println(isStartWithA.test("Abhishek"));
		
		Predicate<String> endsWithKPredicate = x -> x.toLowerCase().endsWith("k");
		System.out.println(endsWithKPredicate.test("Abhishek"));
		
		Predicate<String>andPredicate = isStartWithA.and(endsWithKPredicate);
		System.out.println(andPredicate.test("Aniket"));
	}

}
