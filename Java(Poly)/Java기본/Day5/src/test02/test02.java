package test02;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		inputNumbers1();
		
		test02 nm = new test02();
		nm.inputNumbers2(); // public
		nm.inputNumbers3(); // private
		nm.inputNumbers4(); // protected
		nm.inputNumbers5(); // 
		
		
		
		
		

	}

	public static int inputNumbers1() {
		Scanner scanner = new Scanner(System.in);
		int num1; 
		while (true) {
			System.out.println("입력 : ");
			num1 = scanner.nextInt();
			if (num1 % 2 ==1) {
				if (num1 > 0 && num1 < 1000) {
					System.out.println("OK");
					break;
				}
			}
			System.out.println("Not OK");
		}
		return num1;
	}

	public int inputNumbers2() {
		Scanner scanner = new Scanner(System.in);
		int num1; 
		while (true) {
			System.out.println("입력 : ");
			num1 = scanner.nextInt();
			if (num1 % 2 ==1) {
				if (num1 > 0 && num1 < 1000) {
					System.out.println("OK");
					break;
				}
			}
			System.out.println("Not OK");
		}
		return num1;
	}

	private int inputNumbers3() {
		Scanner scanner = new Scanner(System.in);
		int num1; 
		while (true) {
			System.out.println("입력 : ");
			num1 = scanner.nextInt();
			if (num1 % 2 ==1) {
				if (num1 > 0 && num1 < 1000) {
					System.out.println("OK");
					break;
				}
			}
			System.out.println("Not OK");
		}
		return num1;
	}

	protected int inputNumbers4() {
		Scanner scanner = new Scanner(System.in);
		int num1; 
		while (true) {
			System.out.println("입력 : ");
			num1 = scanner.nextInt();
			if (num1 % 2 ==1) {
				if (num1 > 0 && num1 < 1000) {
					System.out.println("OK");
					break;
				}
			}
			System.out.println("Not OK");
		}
		return num1;
	}

	int inputNumbers5() {
		Scanner scanner = new Scanner(System.in);
		int num1; 
		while (true) {
			System.out.println("입력 : ");
			num1 = scanner.nextInt();
			if (num1 % 2 ==1) {
				if (num1 > 0 && num1 < 1000) {
					System.out.println("OK");
					break;
				}
			}
			System.out.println("Not OK");
		}
		return num1;
	}


}
