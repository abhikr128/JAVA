package generics;

public class GenericMethod {
	
	public static void main(String[] args) {
		
		Integer[] intArray = {1, 2, 3, 4};
		String[] stringArray = {"Hello", "World"};
		printArray(intArray);
		printArray(stringArray);
		display(12);
		display(12.5);
	}
	public static <T> void display(T element){
		System.out.println("Generic display: "+element);
	}
	public static void display(Integer element) {
		System.out.println("Integer display: "+element);
	}
	
	public static <T> void printArray(T[] array) {
		for(T element : array) {
			System.out.print(element+ " ");
		}
		System.out.println();
	}
}


