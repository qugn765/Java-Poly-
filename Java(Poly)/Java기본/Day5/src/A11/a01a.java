package A11;

import java.util.ArrayList;
import java.util.Scanner;

public class a01a {

	public static void main(String[] args) {
		ArrayList<String> diceCase = new ArrayList<String>();
		ArrayList<Integer> diceSum = new ArrayList<Integer>();

	}

	public static int sumOfDice() {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> diceCase = new ArrayList<String>();
		ArrayList<Integer> diceSum = new ArrayList<Integer>();
		int num = scanner.nextInt();
		int a = 0;
		for(int j = 0; j < num; j++) {
			for (int i = 0; i < 6; i ++) {
				diceSum.add(i);
			}
		}
		return a;
	}

}
