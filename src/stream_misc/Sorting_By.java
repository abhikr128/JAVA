package stream_misc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Person{
	private final String name;
	private final String city;
	
	Person(String name, String city) {
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", city=" + city + "]";
	}
	
}

public class Sorting_By {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Abhishek", "Delhi"),
				new Person("Navin", "Hyderabad"),
				new Person("Vinay", "Mumbai")
				);
		List<Person> sortedResult = people.stream()
				            .sorted(Comparator.comparing(Person :: getName)
				            .thenComparing(Person :: getCity))
				            .toList();
		System.out.println(sortedResult);
	}

}
