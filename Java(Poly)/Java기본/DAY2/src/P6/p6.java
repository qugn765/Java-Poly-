package P6;
import java.util.Scanner;
public class p6 {

	public static void main(String[] args) {
		System.out.println("What operation do you want?\n");
		System.out.println("1. +\n");
		System.out.println("2. -\n");
		System.out.println("3. *\n");
		System.out.println("4. /\n");
		System.out.println("--->");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		switch(input) {
			case 1:
				System.out.println(num1+num2);
				break;
			case 2:
				System.out.println(num1-num2);
				break;
			case 3:
				System.out.println(num1*num2);
				break;
			case 4:
				System.out.println(num1/num2);
				break;
		}
	}
}



