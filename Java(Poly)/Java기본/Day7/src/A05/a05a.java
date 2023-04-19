package A05;

import java.util.Arrays;
import java.util.Scanner;

public class a05a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String input = scanner.nextLine();
			String[] input1 = input.split("");
			Arrays.sort(input1);
			for (int i = 0; i < input1.length; i++) {
				System.out.print(input1[i]);
			}
			System.out.println();
		}
	}
}
