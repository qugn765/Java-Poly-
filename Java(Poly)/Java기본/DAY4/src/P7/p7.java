package P7;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class p7 {

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
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date b1Date1 = formatter.parse(b1Date);
		Date b2Date2 = formatter.parse(b2Date);
		long diffHor = (b1Date1.getTime() - b2Date2.getTime()) / 3600000;
		long diffDays = diffHor / -24;
		System.out.println(diffDays);

	}

}
