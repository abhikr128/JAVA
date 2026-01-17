package collectionFramework;

public class Person implements Comparable<Person>{
	String name;
	int age;
	double weight;
	
	public Person(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public String toString() {
		return "Person [Name = " + name + ", Age = " + age + ", Weight = " + weight + " kgs]";
	}
	
	public int compareTo(Person other) {
		return this.age - other.age;
	}

}
