package comparator;

import java.util.Comparator;

public class PersonAgeComp implements Comparator<Person>{
	
    // Comparator by Age
	public int compare(Person p1, Person p2) {
		return p1.getAge() - p2.getAge();
	}
}
