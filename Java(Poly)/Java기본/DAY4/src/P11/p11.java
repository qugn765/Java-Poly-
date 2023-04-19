package P11;

import java.util.Scanner;

public class p11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. South Korea won -> United States Dollar");
		System.out.println("2. United States Dollar -> South Korea won");
		System.out.println("3. South Korea won -> Japan yen");
		System.out.println("4. Japan yen -> South Korea won");
		double a = 0.00076;
		double b = 1322.6;
		double c = 0.10423;
		double d = 9.5941;
		int num = scanner.nextInt();
		System.out.print("선택한 나라의 환율은");
		switch (num) {
		case 1:
			System.out.print("1000(won) -> 0.76(dollar)");
			break;
		case 2:
			System.out.print("1(dolllar) -> 1322.6(won)");
			break;
		case 3:
			System.out.print("1000(won) -> 104.23(yen)");
			break;
		case 4:
			System.out.print("100(yen) -> 959.41(won)");
			break;
		}
		System.out.println("입니다");
		System.out.println("바꾸실 금액을 적어주세요");
		int money = scanner.nextInt();
		int chagemoney = 0;
		switch (num) {
		case 1:
			System.out.println(money*a + "dollar");
			break;
		case 2:
			System.out.println(money*b + "won");
			break;
		case 3:
			System.out.println(money*c + "yen");
			break;
		case 4:
			System.out.println(money*d + "won");
			break;
		}
		
			
		}
	}

