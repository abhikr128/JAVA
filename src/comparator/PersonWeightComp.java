package comparator;

import java.util.Comparator;

public class PersonWeightComp implements Comparator<Person>{
	
	// Comparator by weight
	public int compare(Person p1, Person p2) {
		//return (int)(p1.getWeight() - p2.getWeight());
		return Double.compare(p1.getWeight(), p2.getWeight());

	}
}
