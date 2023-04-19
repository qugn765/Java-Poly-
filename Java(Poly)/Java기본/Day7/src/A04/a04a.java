package A04;

import java.util.Scanner;

public class a04a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		for (int i = 0; i < input.length(); i++) {
			int index = input.charAt(i);
			for (int j = 97; j < 123; j++) {
				index = input.charAt(i);
				if (j == index) {
					index = 219-j;
					System.out.print((char)index);
				}
			}

		}

	}

}

