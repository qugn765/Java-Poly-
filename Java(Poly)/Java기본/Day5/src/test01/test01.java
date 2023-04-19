package test01;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		/*
		 * 다음 조건을 만족하는 프로그램을 작성하세요 
		 * 1. 사용자로부터 3개의 정수형 숫자를 입력받아 변수에 대입하세요[1점] 
		 * 2. 홀수만 입력받을수 있고, 짝수라면 재입력하도록 예외처리하세요[2점] 
		 * 2. 입력값은 1에서 999 사이의 값만 입력할 수 있고 그 외의 값은 재입력하도록예외 처리하세요[2점] 
		 * 3. 특별한 함수 사용없이 비교 연산자와 조건문을 통해 3개의 숫자를 큰 순서대로 출력하세요[2점] 
		 * 4. 특별한함수 사용없이 비교 연산자와 조건문을 통해 3개의 숫자를 작은 순서대로 출력하세요[2점]
		 * 5. 세 개의 숫자의 평균값과 합을 출력하세요[1점] 
		 * 6. 세 개의 숫자 중 3의 배수의 갯수를 출력하세요[1점] 
		 * 7. 제일 큰 숫자가 제일 작은 숫자로 나누어 떨어지는지 true, false로 나타내세요[2점] 
		 * 8. 두 번째로 큰 숫자가 첫 번째, 세 번째 숫자의 평균값보다 크면 true, 작으면 false로 나타내세요[2점]
		 */
		Scanner scanner = new Scanner(System.in);
		int x = 0; int y = 0; int z = 0;
		int a = 0; int b = 0; int c = 0;
		boolean boo = true;
		do {
			System.out.println("홀수인 3개의 숫자(1~999)를 입력해주세요 : ");
			x= 0;
			a = scanner.nextInt();
			x = a % 2;

			y= 0;
			b = scanner.nextInt();
			y = b % 2;

			z= 0;
			c = scanner.nextInt();
			z = c % 2;
			boolean boo1 = ((x == 0 || y == 0) || z == 0);
			boolean boo2 = (((a < 1 || a > 999) || (b < 1 || b > 999)) || (c < 1 || c > 999));
			boo = (boo1 || boo2);
			if (boo == true) {
				System.out.println("다시 입력해주세요");
			}
		} while(boo);



		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		if (a > b && a > c) {
			a1 = a;
			if(b > c) {
				a2 = b;
				a3 = c;
			} else {
				a2 = c;
				a3 = b;
			}
		} else if (b > a && b > c) {
			a1 = b;
			if(a > c) {
				a2 = a;
				a3 = c;
			} else {
				a2 = c; 
				a2 = b;
			}
		} else if (c > a && c > b) {
			a1 = c;
			if(a > b) {
				a2 = a;
				a3 = b;
			} else {
				a2 = b;
				a3 = a;
			}

			System.out.println("큰순서대로"+ a1 + " "+ a2 + " " + a3);
			System.out.println("작은순서대로"+ a3 + " "+ a2 + " " + a1);
			System.out.println();

			double mean = 0;
			int plus = 0;
			plus = (a + b + c);
			mean = (a + b + c)/3;
			System.out.println("평균값 - " + mean + "\n합 - " + plus);

			System.out.println();

			int count = 0;
			if(a%3==0) {
				count++;
			}
			if(b % 3 ==0) {
				count++;
			}
			if(c % 3 ==0) {
				count++;
			}
			System.out.println("3의배수 갯수는 " + count + "개 입니다");

			System.out.println();

			int q = 0;
			q = (a1 % a3);
			System.out.print("제일 큰 수는 제일작은수로 나누어떨어지면 true 아니면 false : ");
			if (q==0) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}

			System.out.println();

			int w = plus - a1 - a3;
			int e = (a1 + a3)/2;
			System.out.print("두 번째로 큰 숫자가 첫 번째, 세 번째 숫자의 평균값보다 크면 true 아니면 false : ");
			if(w > e) {
				System.out.println("true");
			} else
				System.out.println("false");


		}
	}
}