package PlayLand;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class TicketMachine {

	public static void Ticket() throws IOException {
		Scanner scanner = new Scanner(System.in);
		PrintClass print = new PrintClass();
		InputClass inputClass = new InputClass();
		ageCalc age = new ageCalc();
		priceCalc pricec = new priceCalc();
		StringLanguage  sL = new StringLanguage();
		Calendar cald = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		sL.LanguageSetting();

		int ticketSelect, orderCount, discountSelect, price, ageGroup, totalPrice;
		String customerIDNumber;
		int cNumber = 1;

		while(cNumber == 1){
			ticketSelect = inputClass.inputTicketSelect();
			customerIDNumber = inputClass.inputCustomerIDNumber();
			orderCount = inputClass.inputOrderCount();
			discountSelect = inputClass.inputDiscountSelect();
			ageGroup = age.calcAgeGroup(age.calcAge(customerIDNumber));
			price = pricec.calcPriceProcess(ageGroup, ticketSelect);
			price = pricec.calcDiscount(price, discountSelect);
			totalPrice = pricec.calcPriceResult(price, orderCount);
			String nowDate = df.format(cald.getTime());
			inputClass.inputData(nowDate, ticketSelect, ageGroup, orderCount, discountSelect, totalPrice, customerIDNumber);
			cNumber = print.printContinue();
		}
		print.orderPrint();
		print.getCsv();
		

	}

}
