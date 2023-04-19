package A01;
import java.util.Scanner;
public class A_01 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if(1 < a && a<10) {
			for(int i=2; i<10; i++) {
				for(int j=i; j<10; j++) {
					System.out.println(i + " * " + j + " = " + (i*j) );
				}

			}
		} else {
			System.out.println("숫자를 잘못입력하였습니다.");
		}
	}

}

