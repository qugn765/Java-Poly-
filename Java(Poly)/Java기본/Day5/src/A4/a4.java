package A4;

import java.util.Scanner;

public class a4 {

	public static void main(String[] args) {
		do {
			cryption();
		}while(true);
	}

	public static void cryption() {
		Scanner scanner = new Scanner(System.in);
		int inputnum = 0;
		System.out.println("#Menu");
		System.out.println("1. Encryption");
		System.out.println("2. Decryption");
		String input = scanner.nextLine();
		inputnum = scanner.nextInt();
		if(inputnum == 1) {
			for (int i = 0; i < input.length(); i++) {
				int index = input.charAt(i);
				index = input.charAt(i) + 1;	
				System.out.print((char)index);
			}
		} else if (inputnum == 2) {
			for (int i = 0; i < input.length(); i++) {
				int index = input.charAt(i);
				index = input.charAt(i) - 1;	
				System.out.print((char)index);

			}

		}
		System.out.println();


	}
}

