package P12;

import java.util.Scanner;

public class p12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Celsius -> Fahrenheit");
		System.out.println("2.Fahrenheit -> Celsius");
		double a = 0.00076;
		double b = 1322.6;
		System.out.println("바꾸고 싶은 단위를 고르시고 수치를 입력해주세요");
		int num = scanner.nextInt();
		double num1 = scanner.nextInt();
		switch (num) {
		case 1:
			System.out.println(num1+ "°C는" + (num1 * (1.8) + 32)  + "°F입니다" );
			break;
		case 2:
			System.out.println(num1+ "°F는" + (num1-32) * 5 / 9 + "°C입니다");
			break;
		}
		}
	}

