package generics;

public class Main {
	
	public static void main(String[] args) {
		Box<Integer> box = new Box<>();        // Box is now type-safe
		box.setValue(3);
		Integer value = box.getValue();
		System.out.println(value);
		
		Pair<String, Integer> pair = new Pair<>("Abhi", 27);
		System.out.println(pair.getKey()+" : "+pair.getValue());
	}

}
