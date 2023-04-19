package A6;

import java.util.Scanner;

public class a06a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputN = scanner.nextInt();
		int inputM = scanner.nextInt();
		try {
			for (int i = 1; i < inputN + 1; i++) {
				for (int j = 1; j < inputM + 1; j++) {
					System.out.println(i + ", "+ j);		
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
