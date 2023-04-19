package A3;

import java.util.Scanner;

public class a3 {

	public static void main(String[] args) {
		sum();

	}

	public static void sum() {
		Scanner scanner = new Scanner(System.in);
		int M = scanner.nextInt();
		int N = scanner.nextInt();
		int count = 0;
		for (int i = N; i < M + 1; i++) {
			if (i % N==0) {
				count += i;
				System.out.print(i + " ");
			}
			
		}
		System.out.println("SUM : " + count);

	}
}
