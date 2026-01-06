package stream_misc;

public class IsPalindrome {
	public static void main(String[] args) {
		String word = "NAMAN";
		
		for(int i =0; i<word.length()/2; i++) {
			if(word.charAt(i) != word.charAt(word.length()-1-i)) {
				System.out.println("is not palindrome");
				return;
			}
		}
		System.out.println("is palindrome");
	}

}
