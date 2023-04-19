package P4;

import java.util.Scanner;

public class p4a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("사칙연산 (+, - , *, /)중 하나를 입력해주세요 : ");
		String x = scanner.nextLine();
		p4a cal = new p4a();
		System.out.println("연산할 숫자 2개를 입력해주세요 :");
		int a = scanner.nextInt(); 
		int b = scanner.nextInt();
		double result = 0;
		if(x.equals("+")) {
			result=cal.addition(a, b);
		} else if (x.equals("-")) {
			result = cal.subtraction(a, b);
		} else if (x.equals("*")) {
			result = cal.multiplication(a, b);
		} else if (x.equals("/")) {
			result = cal.division(a, b);
		}
		System.out.println(result);
	}


	public double addition(double a, double b) {
		double result = (a + b);
		return result; 
	}

	public double subtraction(double a, double b) {
		double result = (a - b);
		return result;
	}

	public double multiplication(double a, double b) {
		double result = (a * b);
		return result;
	}

	public double division(double a, double b) {
		double result = (a / b);
		return result;
	}



}
