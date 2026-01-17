package comparator;

public class Person {
	String name;
	int age;
	double weight;
	
	public Person(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public String toString() {
		return "Person [Name-" + name + ", age- "+ age + ", weight- " + weight +" kgs]";
	}
}
