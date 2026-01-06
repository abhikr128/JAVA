package stream_misc;

public class demo_count {
	public static void main(String[] args) {
		// Q.no 41. Count words in a sentence
		String sentence = "Once there was a city named Tarapur where people were too tall";
		int count = 0;
		
		for(int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i) == ' ') {         // correct only if there is single space between words
				count++; 
			}
		}
		System.out.println("Total words in sentence are: " + (count + 1));
		
		String sentence2 = "My name is Abhishek Kumar";
		String[] words = sentence2.trim().split("\\s+");   // valid in any case
		System.out.println("Total words count: " + words.length);
	}

}
