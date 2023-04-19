package P6;

import java.util.Calendar;
import java.util.Scanner;

public class p6 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int date = 1;
		calendar.set(year, month, date);
		int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println(maxDay);

		int x = calendar.get(Calendar.DAY_OF_WEEK);
		int y = maxDay;

		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		for (int j = 0; j < ((x + y) / 7) + 1; j++) {
			for (int i = 0; i < 7; i++) {
				if ((j * 7) + i < x - 1) {
					System.out.print("\t");
				}
				else if ((j * 7) + i  >= x - 1 && ((j * 7) + i - x) + 2 <= y) {
					System.out.print(((j * 7) + i - x) + 2 + "\t");
				}
			}
			System.out.println();
		}
	}		
	
}











/*
 * for (int i = 0; i < 7; i++) { if (i <x) { System.out.print("\t"); } else if
 * (i >= x) { System.out.print((i - x)+1 + "\t"); }
 */
