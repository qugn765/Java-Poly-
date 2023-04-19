package example10;
import java.util.Scanner;
public class example_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		switch(input) {
			case 1:
				System.out.println("correct");
				break;
			case 2:
				System.out.println("incorrect");
				break;
			default :
				System.out.println("error");
				break;
		}
	}

}
