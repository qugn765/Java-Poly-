package P8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class p8 {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int y = (a / 10000);
		int m = (a % 10000)/100;
		int d = (a%100);
		String bDate = y + "-" + m +"-" + d;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date beforeDate = formatter.parse(bDate);
		Calendar cal = Calendar.getInstance(); 
		cal.setTime(beforeDate);
		int x = scanner.nextInt();
		cal.add(Calendar.DATE,x);
		String date = formatter.format(cal.getTime());
		System.out.println(date);

	}

}

