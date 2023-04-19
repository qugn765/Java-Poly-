package A05;
import java.util.Scanner;

public class A_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = 0;
		for(int i = 1; i < a + 1; i++) {
			for(int k =1; k<i; k++) {
				System.out.print(" ");
			}	
			for(int j = 1; j < 2 * (a - i + 1); j++) {
			System.out.print("*");
			}

			System.out.println("");
		}
	}

}

