package Practice02;

import java.util.Scanner;

public class practice02a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();
		double doubleA = Double.parseDouble(a);
		double doubleB = Double.parseDouble(b);
		System.out.println(a);
		System.out.println(b);
		System.out.println(doubleA);
		System.out.println(doubleB);

		if (doubleA > doubleB) {
			System.out.println(doubleA);
		} else if (doubleA < doubleB) {
			System.out.println(doubleB);
		} else {
			System.out.println("They are the same!");
		}

		if (doubleA > 10){
			if(doubleB >10) {
				System.out.println(doubleA + " " + doubleB);
			} else {
				System.out.println(doubleA);
			}
		} else {
			System.out.println(doubleB);
		}
	}
}

