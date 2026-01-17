package stream_misc;

public class AnonArrayDemo {
	
	public static void main(String[] args) {
		AnonArrayDemo.sum(new int[][] {{12, 8}, {15, 18}});      // anonymous array -> array without name
	}
	public static void sum(int[] [] n) {                       // created and initialized in a single line
		int total = 0;
		for(int m[] : n) {
			for(int i : m) {
				total = total + i;
			}
		}
		System.out.println(total);
	}

}
