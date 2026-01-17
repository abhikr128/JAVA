package collectionFramework;

import java.util.Arrays;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("bananas", "apple", "orange");
		fruits.sort((a, b) -> a.length() - b.length());
		System.out.println(fruits);
		
		List<Integer> nums = Arrays.asList(13, 45, 1, 0, 23);
		nums.sort(null);                    // by default Ascending
		System.out.println(nums);
		
		nums.sort((a, b) -> b - a);         // Descending 
		System.out.println(nums);
	}

}
