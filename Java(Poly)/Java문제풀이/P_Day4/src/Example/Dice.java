package Example;

import java.util.Scanner;

public class Dice {
	static int n, m, sum;
	static int[] pm;
	
	public static void DiceCount(int n, int m, int count) {
		if(n - 1 == count && sum == m) {
			for(int x : pm) {
				System.out.println(x + " ");
			}
			System.out.println();
		}
		for(int i = 1; i < 6; i++) {
			pm[count] = i;
			sum = sum + i;
			++count;
			DiceCount(n, m, count);
			sum = 0;
			--count;
		}
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		pm = new int[n];
		n = scanner.nextInt();
		m = scanner.nextInt();
		DiceCount(n,m,0);
	}

}
