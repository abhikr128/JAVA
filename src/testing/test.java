package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class test {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("abc");
		list.add("xyz");
		list.add("lmn");
		List<String> synchronizedList = Collections.synchronizedList(list);
		System.out.println(synchronizedList);
		
		
		List<String> list2 = Arrays.asList("a","c",null,"b");	
		Collections.sort(list2, Comparator.nullsLast(String::compareTo));
		System.out.println(list2);
		
		

//			@Override
//			public int compare(String o1, String o2) {
//				if(o1 == null) return (o2 == null) ? 0 : 1;
//				if(o2 == null) return -1;
//				return o1.compareTo(o2);
//			}
//		});
//		System.out.println(list2);
	}
	
}
