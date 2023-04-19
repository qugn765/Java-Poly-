package test;
import java.util.Scanner;
public class test1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = Math.abs(n);
		switch(n) {
		case 0: 
			System.out.println("Zero");
			break;
		case 2:
			System.out.println("negative number");
			break;
		case 3:
			System.out.println("positive number");
			break;
		}
		
	}

}
