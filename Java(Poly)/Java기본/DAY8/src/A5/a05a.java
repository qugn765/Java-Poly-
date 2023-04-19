package A5;

import java.util.Scanner;

public class a05a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int[] numbers = {123, 32, 356, 53, 2, 67, 31, 78, 41, 9, 29};
		try {
		for (int i = 0; i < numbers.length; i++) {
			int a = numbers[i];
			String b = Integer.toString(a);
			String c = Integer.toString(input);
			if(b.contains(c)) {
				System.out.print(b + " ");		
			}
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}

