package A04;
import java.util.Scanner;

public class A_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a - i - 1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2 * i + 1; j++) {
			System.out.print("*");
			}
			
			System.out.println("");
		}
		
	}
} 

