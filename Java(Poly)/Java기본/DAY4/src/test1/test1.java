package test1;
import java.util.Scanner;
public class test1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();

		int cnt = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ') {
				cnt++;
			}
		}
		System.out.println(cnt);


		System.out.println((int)'a');
		System.out.println((int)'z');
		for(int i = (int)'a'; i < (int)'z'; i++) {
			cnt = 0;
			for (int j = 0; j < text.length(); j++) {
				if (text.charAt(j) == (char)i) {
					cnt++;
				}
			}
			System.out.println((char)i + " - " + cnt + " ");
		}

	}

}
