package A4;

import java.util.Scanner;

public class a04a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String b = scanner.nextLine();
		try {
			System.out.println(a.indexOf(b) + 1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
