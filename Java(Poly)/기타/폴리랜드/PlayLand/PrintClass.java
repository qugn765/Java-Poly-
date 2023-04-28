package PlayLand;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PrintClass {
	private Scanner scanner = new Scanner(System.in);



	public void PrintinputTicketSelect(){
		//Locale locale = new Locale("ko");
		//System.out.println(locale);
		System.out.println(StringLanguage.Input_Ticket_Type_print);
		System.out.println("1. " + StringLanguage.Input_Ticket_Type1);
		System.out.println("2. " + StringLanguage.Input_Ticket_Type2);
		//ResourceBundle msg = ResourceBundle.getBundle(StringLanguage.Input_Ticket_Type_print, locale);

		//System.out.println(msg);
	}

	public void PrintinputCustomerIDNumber(){
		System.out.println(StringLanguage.Input_CustomerIDNumber_Print);
		System.out.println(StringLanguage.Input_CustomerIDNumber_Option);
	}

	public void PrintinputOrderCount(){
		System.out.println(StringLanguage.Input_OrderCount_Print);
	}

	public void PrintinputDiscountSelect(){
		System.out.println(StringLanguage.Input_Discount_Print);
		System.out.println("1. " + StringLanguage.Input_Discount_Option1 + StringLanguage.Input_Discount_Option1plus);
		System.out.println("2. " + StringLanguage.Input_Discount_Option2);
		System.out.println("3. " + StringLanguage.Input_Discount_Option3);
		System.out.println("4. " + StringLanguage.Input_Discount_Option4); 
		System.out.println("5. " + StringLanguage.Input_Discount_Option5);
	}

	public void PrintError() {
		System.out.println(StringLanguage.Error_Print);

	}

	public void PrintcalcPriceResult(int totalPrice){
		System.out.print(totalPrice);
		System.out.println(StringLanguage.Total_Price_Print);
	}


	public int printContinue(){
		System.out.println(StringLanguage.Continue_Print);
		int cNumber = scanner.nextInt();
		return cNumber;
	}


	public void orderPrint(){
		System.out.println(StringLanguage.Order_End_Print);
		System.out.println(StringLanguage.Order_Endtitle_Print);
		for(OrderList order : InputClass.data){
			if(order.getTicketSelect() == 1) System.out.print(StringLanguage.Input_Ticket_Type1 +" ");
			else System.out.printf(StringLanguage.Input_Ticket_Type2 +" ");

			if(order.getAgeGroup() == 1) System.out.print(StringLanguage.AgeGroup1 + "\t");
			else if(order.getAgeGroup() == 2) System.out.print(StringLanguage.AgeGroup2 + "\t");
			else if(order.getAgeGroup() == 3) System.out.print(StringLanguage.AgeGroup3 + "\t");
			else if(order.getAgeGroup() == 4) System.out.print(StringLanguage.AgeGroup4 + "\t");
			else if(order.getAgeGroup() == 5) System.out.print(StringLanguage.AgeGroup5 + "\t");

			System.out.printf("x %d\t%d%s\t", order.getOrderCount(), order.getTotalPrice(), StringLanguage.won);

			String gender = order.getCustomerIDNumber().substring(7,8);
			if(gender.equals("1") || gender.equals("3") || gender.equals("5") || gender.equals("7")) {
				System.out.print(StringLanguage.male + "\t");
			} else {
				System.out.print(StringLanguage.Female + "\t");
			}

			if(order.getDiscountSelect() == 1) System.out.println("* "+  StringLanguage.Input_Discount_Option1 + StringLanguage.Input_Discount_Option1plus);
			else if (order.getDiscountSelect() == 2) System.out.println("* "+  StringLanguage.Input_Discount_Option2);
			else if (order.getDiscountSelect() == 3) System.out.println("* "+  StringLanguage.Input_Discount_Option3);
			else if (order.getDiscountSelect() == 4) System.out.println("* "+  StringLanguage.Input_Discount_Option4);
			else if (order.getDiscountSelect() == 5) System.out.println("* "+  StringLanguage.Input_Discount_Option5); 
		}		
	}

	public void getCsv() throws IOException {
		File f = new File("C:\\Users\\KBH\\out\\playLand.csv");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));
		BufferedReader br = new BufferedReader(new FileReader(f));
		String inputTitle = "날짜, 권종, 연령구분, 수량, 가격, 우대사항";
		if(br.readLine() == null) {
			bw.write(inputTitle); bw.newLine();
		}		
		
		for(OrderList order : InputClass.data){
			String input = "";
			input = input + order.getNowDate() + ",";
			if(order.getTicketSelect() == 1) input = input + StringLanguage.Input_Ticket_Type1 + ",";
			else input = input + StringLanguage.Input_Ticket_Type2 + ",";

			if(order.getAgeGroup() == 1) input = input + StringLanguage.AgeGroup1 + ",";
			else if(order.getAgeGroup() == 2) input = input + StringLanguage.AgeGroup2 + ",";
			else if(order.getAgeGroup() == 3) input = input + StringLanguage.AgeGroup3 + ",";
			else if(order.getAgeGroup() == 4) input = input + StringLanguage.AgeGroup4 + ",";
			else if(order.getAgeGroup() == 5) input = input + StringLanguage.AgeGroup5 + ",";

			input = input + order.getOrderCount() + ",";
			input = input + order.getTotalPrice() + ",";

			if(order.getDiscountSelect() == 1) input = input + StringLanguage.Input_Discount_Option1;
			else if (order.getDiscountSelect() == 2)input = input + StringLanguage.Input_Discount_Option2 ;
			else if (order.getDiscountSelect() == 3) input = input + StringLanguage.Input_Discount_Option3;
			else if (order.getDiscountSelect() == 4) input = input + StringLanguage.Input_Discount_Option4;
			else if (order.getDiscountSelect() == 5) input = input + StringLanguage.Input_Discount_Option5;
			bw.write(input);
			bw.newLine();
		}
		bw.close();
	}
}
