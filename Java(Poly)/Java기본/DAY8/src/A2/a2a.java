package A2;

import java.util.Scanner;
import java.util.Stack;

public class a2a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<Integer> b = new Stack<>();
		b.push(1);
		b.push(21);
		b.push(13);
		b.push(34);
		b.push(15);
		b.push(16);

		int cnt = 0;
		int input = scanner.nextInt();
		try {
			while(true) {
				if (input == b.peek()) {
					++cnt;
					System.out.println(cnt);
					break;
				} else {
					++cnt;
					b.pop();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
