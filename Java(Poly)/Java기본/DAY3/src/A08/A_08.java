package A08;

import java.util.Scanner;

public class A_08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = 0;
		
		
		for(int i=1; i<=a && i<=b; i++) {
			if(a%i==0 && b%i==0) {
				c= i;
			}
			
		}
		System.out.println(c);
	}

}

