package ex1a;

import java.util.Scanner;

public class coffee {

	public static void main(String[] args) {
		int coffee = 2000;
		double parttime = 10000 / 60.0;
		int coffeetime = 3;
		double rate = 0.66;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("커피의 수량을 입력해주세요 : ");
		
		int inputcoffee = scanner.nextInt();
		int bonus = (inputcoffee / 10);
		int input2coffee = inputcoffee - bonus;
		double money = (input2coffee * coffee * rate) - (parttime * 3 * inputcoffee);
		
		System.out.println("총 커피  개수  : " + inputcoffee + "잔");
		System.out.println("총 보너스커피  : " + bonus + "잔");
		System.out.println("총 대기  시간  : " + inputcoffee * 3 + "분");
		System.out.println("총 지불  금액  : " + input2coffee * coffee + "원");
		System.out.println("총 수      익  : " + (int)money + "원");
		
	}

}