package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableDemo{
	public static void main(String[] args) {
		List<Person> people = new ArrayList<>(Arrays.asList(
				new Person("Abhishek", 26, 63.5),
				new Person("Ankita", 25, 45.7),
				new Person("Santosh", 31, 73.2)
				));
		
		System.out.println("Original people list: " + people);
		Collections.sort(people);
		System.out.println("Sorted people list: " + people);
	}
}