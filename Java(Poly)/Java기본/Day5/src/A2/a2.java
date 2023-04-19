package A2;

import java.util.Scanner;

public class a2 {

	public static void main(String[] args) {
		Banking();
	}
	
	public static void Banking() {
		int money = 0;
		int input1;  int input2;
		Scanner scanner = new Scanner(System.in);
		do {
		System.out.println("#Menu");
		System.out.println("1. Deposit");
		System.out.println("2. Withdrawal");
		System.out.println("3. Exit");
		System.out.println("Balance :" + money );
		System.out.println("번호를 입력해주세요");
		input1 = scanner.nextInt();
		System.out.println("금액을 입력해주세요");
		input2 = scanner.nextInt();
		if (input1 ==1) {
			money += input2;
		} else if(input1 == 2) {
			money -= input2;
		}
		System.out.println("잔액은 " + money + "입니다");
		} while(input1==1 || input1==2);
	}

}
