package A11;

import java.util.Scanner;

public class a11a {

	public static void main(String[] args) {
		a11a quick = new a11a();
		quick.quickest();

	}


	public void quickest() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("m/s , km/h , m/ms 순서대로 입력해주세요");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();		
		//   m / s   ->                                      ->    1m / 1s   
		//   k / h   ->   1000m / 60m   ->   1000m / 3600s   ->   (1m / 1s) / 3.6
		//   m / ms  ->   1m / 0.001s   ->   1000m / 1s      ->   (1m / 1s) * 1000
		double b1 = (b / 3.6);
		double c1 = c * 1000;
		if (a > b1 && a >c1) {
			System.out.println("제일 빠른속도는 " + a + "m/s");
		} else if (b1 > a && b1 > c1) {
			System.out.println("제일 빠른속도는 " + b + "km/h");
		} else {
			System.out.println("제일 빠른속도는 " + c + "m/ms");
		}

	}

}

