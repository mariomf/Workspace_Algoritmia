package Algoritmia;

public class Palindorme {

	public static void main(String[] args) {
		
		String word1 = "laald";
		
		StringBuilder word = new StringBuilder(word1);
		
		word = word.reverse();
		String wordToCompare = word.toString();
		
		if(word1.equals(wordToCompare)) {
			System.out.println("its a palidrom");			
		}else
			System.out.println("is NOT a palidrom");
	}

}
