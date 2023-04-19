package P6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class p06a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date time = new Date();
		int input = scanner.nextInt();
		String dateAndTime = format.format(time);
		System.out.println(dateAndTime);
		System.out.println("start " + (input));
			
		try {
			Thread.sleep(input * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		time = new Date();
		dateAndTime = format.format(time);
		System.out.println("time is over (" + dateAndTime + ")");
		
	}

}