package A6;

import java.util.Scanner;

public class a6 {

	public static void main(String[] args) {
		counting();
	}

	public static void counting() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input : ");
		String a = scanner.nextLine();
		String b = a.replaceAll(" ","");
		String[] a1 = b.split("");
		int countv = 0;
		int countc = 0;
		for (int i = 0; i < b.length(); i++) {
			if (a1[i].equals("a") || a1[i].equals("A")) {
				countv += 1;
			} else if (a1[i].equals("e") || a1[i].equals("E")) {
				countv += 1;
			} else if (a1[i].equals("i") || a1[i].equals("I")) {
				countv += 1;
			} else if (a1[i].equals("o") || a1[i].equals("O")) {
				countv += 1;
			} else if (a1[i].equals("u") || a1[i].equals("U")) {
				countv += 1;
			} else {
				countc += 1;
			}
		}
		System.out.println("Num. of Consonant : " + countc);
		System.out.println("Num. of Vowels : "+ countv);
	}
}

