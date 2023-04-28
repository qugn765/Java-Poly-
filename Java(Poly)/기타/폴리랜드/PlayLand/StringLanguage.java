package PlayLand;

import java.util.Locale;
import java.util.ResourceBundle;

public class StringLanguage {
	public static String Language_Type = " ";
	public static String Input_Ticket_Type_print;
	public static String Input_Ticket_Type1;
	public static String Input_Ticket_Type2;
	public static String Input_CustomerIDNumber_Print;
	public static String Input_CustomerIDNumber_Option;
	public static String Input_OrderCount_Print;
	public static String Input_Discount_Print;
	public static String Input_Discount_Option1;
	public static String Input_Discount_Option1plus;
	public static String Input_Discount_Option2;
	public static String Input_Discount_Option3;
	public static String Input_Discount_Option4;
	public static String Input_Discount_Option5;
	public static String Error_Print;
	public static String Total_Price_Print;
	public static String Continue_Print;
	public static String Order_End_Print;
	public static String Order_Endtitle_Print;
	public static String AgeGroup1;
	public static String AgeGroup2;
	public static String AgeGroup3;
	public static String AgeGroup4;
	public static String AgeGroup5;
	public static String Female;
	public static String male;
	public static String won;
	
	private static ResourceBundle messages;

	public void LanguageSetting() {
        Locale currentLocale = Locale.getDefault();
        
        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		
        Input_Ticket_Type_print = messages.getString("Input_Ticket_Type_print");
        Input_Ticket_Type1 = messages.getString("Input_Ticket_Type1");
        Input_Ticket_Type2 = messages.getString("Input_Ticket_Type2");
        Input_CustomerIDNumber_Print = messages.getString("Input_CustomerIDNumber_Print");
        Input_CustomerIDNumber_Option = messages.getString("Input_CustomerIDNumber_Option");
        Input_OrderCount_Print = messages.getString("Input_OrderCount_Print");
        Input_Discount_Print = messages.getString("Input_Discount_Print");
        Input_Discount_Option1 = messages.getString("Input_Discount_Option1");
        Input_Discount_Option1plus = messages.getString("Input_Discount_Option1plus");
        Input_Discount_Option2 = messages.getString("Input_Discount_Option2");
        Input_Discount_Option3 = messages.getString("Input_Discount_Option3");
        Input_Discount_Option4 = messages.getString("Input_Discount_Option4");
        Input_Discount_Option5 = messages.getString("Input_Discount_Option5");
        Error_Print = messages.getString("Error_Print");
        Total_Price_Print = messages.getString("Total_Price_Print");
        Continue_Print = messages.getString("Continue_Print");
        Order_End_Print = messages.getString("Order_End_Print");
        Order_Endtitle_Print = messages.getString("Order_Endtitle_Print");
        AgeGroup1 = messages.getString("AgeGroup1");
        AgeGroup2 = messages.getString("AgeGroup2");
        AgeGroup3 = messages.getString("AgeGroup3");
        AgeGroup4 = messages.getString("AgeGroup4");
        AgeGroup5 = messages.getString("AgeGroup5");
        Female = messages.getString("Female");
        male = messages.getString("male");
        won = messages.getString("won");
    }


	public String getLanguage_Type() {
		return Language_Type;
	}

	public void setLanguage_Type(String language_Type) {
		Language_Type = language_Type;
	}



}
