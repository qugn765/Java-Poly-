package example8;
import java.util.Scanner;
public class example_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number=10;
		System.out.println("number of members : ");
		int input = scanner.nextInt();
		if (input > 10) {
			System.out.println("Too high");
		}
			else if(input<2) {
			System.out.println("Too low");
		}
			else if(input==number) {
			System.out.println("correct");
		}
			else {
				System.out.println("incorrect");
			}
		}
	}

