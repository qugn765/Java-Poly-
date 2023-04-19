package P12;

import java.util.Scanner;

public class P_12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int sum = 0;
		for(int i = 1; i < N+1; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
		System.out.println(" ");
		int i =1;
		sum=0;
		while(i<N+1) {
			sum = sum+i;
			i = i+1;
		}
		System.out.println(sum);
	}

}
