package P14;

import java.util.Scanner;

public class p14a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		
		System.out.print(MulToOne(m) + " = " + m);
		for (int i = m-1 ; i > 0; i--) {
			System.out.print(" x " + i);
		}
	}
	
	public static int MulToOne(int n) {
		if (n==1) {
			return 1;
		} else {
			return n * MulToOne(n-1);
		}
	}

}
