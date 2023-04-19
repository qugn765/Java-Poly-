package ArrayExample2;

import java.util.Scanner;

public class arrayExample2a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = "";
		int i = 0;
		while(true) {
			int num = scanner.nextInt();
			line = line + "," +num;
			i++;
			if (num == 7) {
				break;
			}
		}
		String[] history = line.split(",");
		for (int j = 0; j < history.length; j++) {
			if(history[j]=="7") {
				System.out.println(history[j]);
			}
		}
	}
}







/*
int[] numbers = new int[10];
String[] name = {"kim", "lee", "park"};

for (int i = 0; i < numbers.length; i++) {
	System.out.println(numbers[i]);
}

for (int i = 0; i < name.length; i++) {
	System.out.println(name[i]);
}
 */