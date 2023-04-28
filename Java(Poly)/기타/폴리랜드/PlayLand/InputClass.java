package PlayLand;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputClass {
	private Scanner scanner = new Scanner(System.in);
	private PrintClass printout = new PrintClass();

	static List<OrderList> data = new ArrayList<OrderList>();
	
	public int SelectLanguage() {
		System.out.println("1.한국어  2.English");
		int language_number = scanner.nextInt();
		
		return language_number;
	}
	
	public int inputTicketSelect(){
		int ticketSelect = 0;
		while(true) {
			printout.PrintinputTicketSelect();
			ticketSelect = scanner.nextInt();
			if(ticketSelect == 1 || ticketSelect == 2) break;
			printout.PrintError();
		}
		return ticketSelect;
	}


	public String inputCustomerIDNumber(){
		String CustomerIDNumber;
		while(true) {
			printout.PrintinputCustomerIDNumber();
			CustomerIDNumber = scanner.next();
			if(CustomerIDNumber.length() == 13) break;
			printout.PrintError();
		}

		return CustomerIDNumber;
	}


	public int inputOrderCount(){
		int orderCount;
		while(true) {
			printout.PrintinputOrderCount();
			orderCount = scanner.nextInt();
			if(0 < orderCount && orderCount < 11) break;
			printout.PrintError();
		}
		return orderCount;
	}


	public int inputDiscountSelect(){
		int discountSelect;
		while(true) {
			printout.PrintinputDiscountSelect();
			discountSelect = scanner.nextInt();
			if(0 < discountSelect && discountSelect < 6) break;
			printout.PrintError();
		}
		return discountSelect;
	}
	
	public void inputData(String nowDate, int ticketSelect, int ageGroup, int orderCount, int discountSelect, int totalPrice, String customerIDNumber) {
		OrderList order = new OrderList();
		order.setnowDate(nowDate);
		order.setTicketSelect(ticketSelect);
		order.setAgeGroup(ageGroup);
		order.setOrderCount(orderCount);
		order.setDiscountSelect(discountSelect);
		order.setTotalPrice(totalPrice);
		order.setCustomerIDNumber(customerIDNumber);
		data.add(order);
		

	}






}
