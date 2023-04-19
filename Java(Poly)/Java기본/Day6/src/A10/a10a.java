package A10;

import java.util.Scanner;

public class a10a {

	public static void main(String[] args) {
		a10a tx = new a10a();
		Text1();
	}

	public static void Text1() {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String b = scanner.nextLine();
		int [] a1 = new int [58];
		int [] b1 = new int [58];
		for(int i = (int)'A'; i < (int)'z' + 1; i++) {
			int cnt1 = 0;
			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(j) == (char)i) {
					cnt1++;
					a1[i-(int)'A']= cnt1;
				}
			}
		}

		for(int i = (int)'A'; i < (int)'z' + 1; i++) {
			int cnt2 = 0;
			for (int j = 0; j < b.length(); j++) {
				if (b.charAt(j) == (char)i) {
					cnt2++;
					b1[i-(int)'A'] = cnt2;
				}
			}
		}

		int sum = 0;
		for(int i = (int)'A'; i < (int)'z'; i++) {
			if(a1[i-(int)'A'] != b1[i-(int)'A']) {
				sum += 1;
			} 
		}
		if (sum == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
