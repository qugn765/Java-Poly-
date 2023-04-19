package P6;

import java.util.Scanner;

public class p6a extends p6operation{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		p6a cal = new p6a();	
		String operator = cal.getOperator();
		cal.calresult(operator);
		
	}


}
