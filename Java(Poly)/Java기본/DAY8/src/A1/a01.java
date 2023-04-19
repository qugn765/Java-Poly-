package A1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class a01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue<Integer> b = new LinkedList<>();
		b.add(1);
		b.add(21);
		b.add(13);
		b.add(34);
		b.add(15);
		b.add(16);
		int cnt = 0;
		int input = scanner.nextInt();
		try {
			while(true) {
				if (input == b.poll()) {
					++cnt;
					System.out.println(cnt);
					break;
				} else {
					++cnt;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
