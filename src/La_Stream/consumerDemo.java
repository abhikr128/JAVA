package La_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class consumerDemo {
	public static void main(String[] args) {
		
		// Consumer
		Consumer<Integer> consume = x -> System.out.println(x);
		consume.accept(1998);
		
		
		List<Integer> list = Arrays.asList(1, 3, 5);
		Consumer<List<Integer>> printList = x -> {
			for(int i : x) {
				System.out.print(i + " ");
			}
		};
		printList.accept(list);
		System.out.println();
		
		// Supplier
		Supplier<String> supply = () -> "It takes nothing, only gives.";
		System.out.println(supply.get());
		
		// COMBINED example
		Predicate<Integer> predicate = x -> x%2==0;
		Function<Integer, Integer> function = x -> x*x;
		Consumer<Integer> consumer = x -> System.out.println(x);
		Supplier<Integer> supplier = () -> 32;
		
		if(predicate.test(supplier.get())){
			consumer.accept(function.apply(supplier.get()));
		}else {
			System.out.println("Invalid integer");
		}
		
		// BiPredicate, BiConsumer, BiFunction
		BiPredicate<Integer, Integer> isSumEvenBiPredicate = (x,y) -> (x+y)%2==0;
		System.out.println(isSumEvenBiPredicate.test(3, 4));
		
		BiConsumer<Integer, Integer> printBiConsumer =(x, y) -> {
			System.out.println(x);
			System.out.println(y);
		};
		BiFunction<String, String, Integer> resultBiFunction= (x, y) -> (x+y).length();
		System.out.println(resultBiFunction.apply("Abhishek", "Kumar"));
		
		
		// UnaryOperator, BinaryOperator 
		UnaryOperator<Integer> a = x -> 2*x;      //Function<Integer, Integer> a = x -> 2*x;
		
		BinaryOperator<Integer> b = (x, y) -> x+y;   // BiFunction
		
		
		// Method Reference
		List<String> students = Arrays.asList("Ram", "Shyam", "Ghanshyam");
        // students.forEach(x -> System.out.println(x));
		students.forEach(System.out :: println);
	}

}