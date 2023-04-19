package P11;

import java.util.Scanner;

public class P_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for(int i = 2; i < 10; i++) {
			System.out.println(N + " X " + i + " = "+ N*i);
		}

	}

}
