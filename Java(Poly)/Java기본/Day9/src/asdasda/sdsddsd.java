package asdasda;

import java.util.Scanner;

public class sdsddsd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		printDiceProbability(n, m, "");
	}
	
	public static void printDiceProbability(int n, int m, String result) {
		
		if (n == 0) { 
			if (m == 0) {
				System.out.println(result);
			}
		} else { 
			for (int i = 1; i <= 6; i++) {
				printDiceProbability(n-1, m-i, result + i + " ");
			}
		}
	}
}