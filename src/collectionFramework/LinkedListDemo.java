package collectionFramework;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.get(2);
		list.addLast(4);
		list.addFirst(0);
		list.getFirst();
		list.getLast();
		System.out.println(list);
		
		list.removeIf(x -> x % 2 == 0);
		System.out.println(list);
		
		LinkedList<String> animals = new LinkedList<String>(Arrays.asList("cat", "dog", "lion"));
		LinkedList<String> removedAnimals = new LinkedList<String>(Arrays.asList("dog", "tiger"));
		animals.removeAll(removedAnimals);
		System.out.println(animals);
		
	}

}
