package ExchangeMoney;

import java.util.Scanner;

public class Input {

	Scanner scanner = new Scanner(System.in);
	PrintOut printOut = new PrintOut();

	public int InputKorMoney() {
		printOut.InputKorMoneyPrint();
		int KorMoney = scanner.nextInt();
		return KorMoney;
	}

	public int InputMoneyType() {
		printOut.InputChangeMoneyType();
		int number = scanner.nextInt();
		return number;
	}

}
