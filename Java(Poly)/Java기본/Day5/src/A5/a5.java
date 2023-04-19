package A5;

import java.util.Scanner;

public class a5 {

	public static void main(String[] args) {

		do {
			Dataconfirm();
		}while(true);
	}


	public static void Dataconfirm() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Conditions");
		System.out.println("1. The string length should be over 10");
		System.out.println("2. The string length should be under 30");
		System.out.println("3. The string should contains the character 'a'");
		System.out.println("4. The string should contains the character 'b'");
		System.out.println("5. The string should not contains the character 'c'");
		
		String input = scanner.nextLine();
		boolean bl = input.contains("a") && input.contains("b") && !(input.contains("c"));
		bl = bl && input.length() < 30 && input.length() > 10;
		if(bl) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
	}
}
