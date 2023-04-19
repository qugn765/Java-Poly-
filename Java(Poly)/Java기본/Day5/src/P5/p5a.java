package P5;

import java.util.Scanner;

public class p5a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		p5a tm = new p5a();
		tm.timestable(a);
		
	}
	
	public static void timestable(int a) {
		for (int i = 1; i < 10; i++) {
			System.out.println(a + " * " + i + " = "+ a*i);
		}
		
	}

}
