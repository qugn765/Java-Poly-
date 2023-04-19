package A09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class a9a {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int y1 = (a / 10000);
		int m1 = (a % 10000)/100;
		int d1 = (a%100);
		String b1Date = y1 + "-" + m1 +"-" + d1;
		int b = scanner.nextInt();
		int y2 = (b / 10000);
		int m2 = (b % 10000)/100;
		int d2 = (b%100);
		String b2Date = y2 + "-" + m2 +"-" + d2;
		SimpleDateFormat formatter = new SimpleDateFormat("hh-mm-ss");
		Date b1Date1 = formatter.parse(b1Date);
		Date b2Date2 = formatter.parse(b2Date);
		long diffHor = (b2Date2.getTime() - b1Date1.getTime());
		long diffDays = diffHor / 1000;
		System.out.println("두개의 시간 차이는 " + diffDays + "s 입니다");

	}

}


