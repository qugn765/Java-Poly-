package P13;

import java.util.Scanner;

public class p13a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		p13b cal = new p13b();	
		String operator = cal.getOperator();
		cal.calresult(operator);

	}


}

