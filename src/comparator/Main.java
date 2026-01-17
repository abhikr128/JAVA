package comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<Person> people = new ArrayList<>(Arrays.asList(
				new Person("Alice", 30, 75.2),
				new Person("Bob", 25, 62.5),
				new Person("Charlie", 35, 58.8)
		));
		
		System.out.println("Original list: " + people);
		
		Collections.sort(people, new PersonNameComp());
		System.out.println("Compared by name: " + people);
		
		Collections.sort(people, new PersonAgeComp());
		System.out.println("Compared by age: " + people);
		
		Collections.sort(people, new PersonWeightComp());
		System.out.println("Compared by weight: " + people);
	}

}
