package collectionFramework;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
	public static void main(String[] args) {
		Map<Day, String> enumMap = new EnumMap<>(Day.class);
		enumMap.put(Day.Monday, "Gymming");
		enumMap.put(Day.Wednesday, "Swimming");
		enumMap.put(Day.Sunday, "Restday");
		
		for(Day day : enumMap.keySet()) {
			System.out.println(day + " : " + enumMap.get(day));
		}
	}

}
enum Day {
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}
