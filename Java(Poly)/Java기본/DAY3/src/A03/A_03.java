package A03;
import java.util.Scanner;
public class A_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		for (int i=0; i<=a; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}