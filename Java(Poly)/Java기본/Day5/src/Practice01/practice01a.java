package Practice01;

import java.util.Scanner;

public class practice01a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		double a = 0;
		int b = 0;

		if (input.contains(".")) {
			a = Double.parseDouble(input);
			System.out.println("double 형 : " + a);
		} else {
			b = Integer.parseInt(input);
			System.out.println("int 형 : " + b);
			a = (double)(b);
		}
		
		if(a==0) {
				System.out.println("Zero");
			} else if (a > 3.14) {
				System.out.println("원주율보다 큽니다");
			} else if (a <= 3.14 && a > 0) {
				System.out.println("원주율보다 작습니다");
			} else {
				System.out.println("음수입니다.");			
			
		}
	}
}
