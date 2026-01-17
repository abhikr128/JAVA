package comparator;

import java.util.Comparator;

public class PersonNameComp implements Comparator<Person>{
	
	// Comparator by Name
	public int compare(Person p1, Person p2) {
		return p1.getName().compareTo(p2.getName());
	}

}
