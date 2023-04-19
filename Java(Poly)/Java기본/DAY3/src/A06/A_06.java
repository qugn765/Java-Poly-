package A06;
import java.util.Scanner;
public class A_06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		a = scanner.nextInt();
		int i =0;
		for (i=a; i>1; i--) {
			if (a % i == 0) {
		System.out.println(a/i);
			}
	
		}
	}
}

