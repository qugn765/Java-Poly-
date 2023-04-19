package example11;
import java.util.Scanner;
public class example_11 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if(input ==1) {
			System.out.println("correct");
		} else if (input ==2) {
			System.out.println("incorrect");
		} else {
			System.out.println("error");
		}
	}

}
