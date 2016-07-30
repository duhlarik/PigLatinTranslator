package sundayReview;

import java.util.Scanner;

public class Sunday72416Review {

	public static void main(String[] args) {

		String choice = "yes";

		Scanner scan1 = new Scanner(System.in);

		System.out.println("This is a Pig Latin Converter.");

		while (choice.equalsIgnoreCase("yes")) {

			System.out.println("Enter a word to convert it to Pig Latin.");

			String word = scan1.nextLine().toLowerCase();

			int indexNumber = indexOfVowel(word);
			convertToPig(word, indexNumber);

			System.out.println("Would you like to enter another word?");

			choice = scan1.nextLine();

			if (choice.equalsIgnoreCase("no")) {
				System.out.println("Goodbye!");
			}
		}
		scan1.close();
	}

	public static int indexOfVowel(String word) {
		int i;
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		for (i = 0; i < word.length(); i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (word.charAt(i) == vowels[j]) {
					return i;
				}
			}
		}
		return i;
	}

	public static void convertToPig(String word, int indexNumber) {
		if (indexNumber == 0) {

			System.out.println("The Pig Latin of the word is " + word + "ay\n");

		} else {

			String afterVowel = word.substring(indexNumber);
			String beforeVowel = word.substring(0, indexNumber);
			String pig = afterVowel + beforeVowel + "ay";
			System.out.println("The Pig Latin of the word is " + pig + "\n");

		}
	}

}
