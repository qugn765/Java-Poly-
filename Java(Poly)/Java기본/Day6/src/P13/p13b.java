package P13;

import java.util.Scanner;

public class p13b {
	public void addition(double a, double b) {
		double result = (a + b);
		System.out.println(result);
	}

	public void subtraction(double a, double b) {
		double result = (a - b);
		System.out.println(result);
	}

	public void multiplication(double a, double b) {
		double result = (a * b);
		System.out.println(result);
	}

	public  void division(double a, double b) {
		double result = (a / b);
		System.out.println(result);
	}
	
	public String getOperator() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("사칙연산1개만을 포함한 계산식을 입력해주세요");
		String operator = scanner.nextLine();
		return operator;
	}
	
	public void calresult(String x) {
		p13b op = new p13b();
		int num1 = 0;
		int num2 = 0;
		int a = 0;
		String b = " ";
		String c = " ";
		if (x.contains("+")) {
			a = x.indexOf("+",0);
			b = x.substring(0,a);
			num1 = Integer.parseInt(b);
			c = x.substring(a+1);
			num2 = Integer.parseInt(c);	
		} else if (x.contains("-")) {
			a = x.indexOf("-",0);
			b = x.substring(0,a);
			num1 = Integer.parseInt(b);
			c = x.substring(a+1);
			num2 = Integer.parseInt(c);				
		} else if (x.contains("*")) {
			a = x.indexOf("*",0);
			b = x.substring(0,a);
			num1 = Integer.parseInt(b);
			c = x.substring(a+1);
			num2 = Integer.parseInt(c);	
		} else {
			a = x.indexOf("/",0);
			b = x.substring(0,a);
			num1 = Integer.parseInt(b);
			c = x.substring(a+1);
			num2 = Integer.parseInt(c);				
		}

		if(x.contains("+")) {
			op.addition(num1,num2);
		} else if (x.contains("-")) {
			op.subtraction(num1, num2);
		} else if (x.contains("*")) {
			op.multiplication(num1, num2);
		} else if (x.contains("/")) {
			op.division(num1, num2);
		}		
	}
}
