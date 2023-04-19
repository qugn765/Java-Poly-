package P8;

import java.util.Arrays;
import java.util.Scanner;

public class p08a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		String a = "";
		int cnt = 0;
		while(true) {
			cnt = 0;
			try {
				input = scanner.nextInt();
				String[] num = new String[input];
				a = scanner.nextLine();
				num = new String[input];
				String inputnum = scanner.nextLine();
				String[] input1 = inputnum.split(" ");
				for(int i = 0; i < input1.length; i++) {
					num[i] = input1[i];
				}
				Arrays.sort(num);
				if (cnt ==0) {
					for (int j = 0; j < num.length; j++) {
						System.out.print(num[j] + " ");
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("error");
			}		
		}
	}
}

