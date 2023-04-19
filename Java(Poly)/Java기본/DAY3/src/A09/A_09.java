package A09;
import java.util.Scanner;
public class A_09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = 0;
		for(int i = 2; i < a+1; i++) {
			b=0;
			for(int j = 2; j < i; j++) {
				if(i%j==0) {
					b += 1;
				}
			}
			if(b==0) {
				System.out.println(i);
			}
		}

	}
}


