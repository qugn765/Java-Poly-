package A8;

import java.util.Scanner;

public class a8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("#Menu");
		System.out.println("1. Encoder");
		System.out.println("2. Decoder");
		System.out.println("3. Exit");
		String input = scanner.nextLine();
		int num = scanner.nextInt();
		
		if (num==1) {
			for( int i = 0; i < input.length(); i++) {
				int index = input.charAt(i) - 96;
				System.out.print(index + " ");
			}
		} else if (num==2) {
			for( int i = 0; i < input.length(); i++) {
				int index = input.charAt(i) + 48;
				char a = (char)index;
				System.out.print(a + " ");
			} 
		}
	}

}
