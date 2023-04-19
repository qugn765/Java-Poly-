package test1;

import java.util.Scanner;

public class test1a {
	public static final int ONETIME = 5;
	public static final int RANDOM = 6;
	public static final int EVENNUMBER = 0;
	public static final int ODDNUMBER = 1;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		test1a nm = new test1a();
		System.out.println("5 아니면 6을 입력해주세요 : ");
		int x = scanner.nextInt();
		int output = nm.getRandomNumber(x);
		System.out.println("결과물 : " + output);
		System.out.println();

		int y = scanner.nextInt();
		isEvenNumber(y);

	}

	
	private int getRandomNumber(int b) {
		int a = 0;
		int sum = 0;
		int i = 0;
		if (b == ONETIME) {
			a = (int)(Math.random() * 100);
		} else if (b == RANDOM) {
			while (sum < 100) {
				sum = sum + (int)(Math.random() * 100);
				i++;
			} 
			a = i;
		}
		return a;
	}

	
	
	public static void isEvenNumber(int c) {
		if (c % 2 == EVENNUMBER) {
			System.out.println(c + "는 짝수입니다");
		} else if (c % 2 == ODDNUMBER) {
			System.out.println(c + "는 홀수입니다");
		}
	}

}
