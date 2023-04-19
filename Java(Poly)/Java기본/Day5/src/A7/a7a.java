package A7;

import java.util.Scanner;

public class a7a {

	public static void main(String[] args) {
		Grade();

	}

	public static void Grade() {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum = 0;
		double grade = 0;
		double gradesum = 0;
		for (int j = 0; j < num; j++) {
			int num1 = scanner.nextInt();
			String extra = scanner.nextLine();
			String gd = scanner.nextLine();
			if(gd.equals("A+")){
				grade = 4.5 * num1;
			} else if(gd.equals("A0")) {
				grade = 4.0 * num1;
			} else if(gd.equals("B+")) {
				grade = 3.5 * num1;
			} else if(gd.equals("B0")) {
				grade = 3.0 * num1;
			} else if(gd.equals("C+")) {
				grade = 2.5 * num1;
			} else if(gd.equals("C0")) {
				grade = 2.0 * num1;
			} else {
				grade = 0;
			}
			sum = sum + num1;
			gradesum = gradesum + grade;
		}
		System.out.println((gradesum / sum));
	}
}

