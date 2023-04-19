package asdasdaasdasdasd;

import java.util.Scanner;

public class sdsdsd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Take input for the string and store it in an array
		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();
		String[] stringArray = inputString.split(" ");

		// Take input for the word and store it in an array
		System.out.print("Enter a word: ");
		String inputWord = scanner.nextLine();
		String[] wordArray = {inputWord};

		// Count how many times the word appears in the string
		int count = 0;
		for (String str : stringArray) {
			if (str.equalsIgnoreCase(inputWord)) {
				count++;
			}
		}

		System.out.println("The word \"" + inputWord + "\" appears " + count + " times in the string.");
	}
}






