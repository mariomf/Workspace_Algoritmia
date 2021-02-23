package Algoritmia;

import java.util.Arrays;

public class Anagrama {

	public static void main(String[] args) {
		
		String word1 = "hola";
		String word2 = "lafdh";
		
		if(word1.length() == word2.length()) {
			char[] arrWord1 = word1.toCharArray();
			char[] arrWord2 = word2.toCharArray();
			
			for(int i =0; i < word1.length(); i++) {
				for(int j =0; j < word1.length(); j++) {
					if(arrWord1[i] == arrWord2[j]) {
						arrWord1[i] = ' ';
						arrWord2[j] = ' ';
					}
				}
			}
			if(Arrays.equals(arrWord1, arrWord2)) {
				System.out.println("Its a anagram");
			}else
				System.out.println("NOT an anagram");
			
		}else
			System.out.println("NOT an anagram");

	}

}
