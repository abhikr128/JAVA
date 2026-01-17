package collectionFramework;

import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>(5, 3);
		vector.add(1);
		vector.add(1);
		vector.add(1);
		vector.add(1);
		vector.add(1);
		System.out.println(vector.capacity());
		vector.add(1);
		vector.add(1);
		System.out.println(vector.capacity());
		vector.add(1);
		vector.add(1);
		System.out.println(vector.capacity());
		
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Vector<Integer> vector2 = new Vector<Integer>(list);
		System.out.println(vector2);
	}

}
