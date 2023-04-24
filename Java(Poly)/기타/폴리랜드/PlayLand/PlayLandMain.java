package PlayLand;

import java.util.*;

public class PlayLandMain {

	public static void main(String[] args) {
		PrintClass print = new PrintClass();
		InputClass inputClass = new InputClass();
		ageCalc age = new ageCalc();
		priceCalc pricec = new priceCalc();
		
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
			inputClass.inputData(ticketSelect, ageGroup, orderCount, discountSelect, totalPrice, customerIDNumber);
			cNumber = print.printContinue();
		}
		
		print.orderPrint();
		
	}

}
