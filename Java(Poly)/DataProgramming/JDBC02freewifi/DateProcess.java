package JDBC02freewifi;

public class DateProcess {

	public static String DateP(String date){	
		if(date.contains("Jan")) {
			date = date.replace("Jan", "1");
		} else if(date.contains("Feb")) {
			date = date.replace("Feb", "2");
		}else if(date.contains("Mar")) {
			date = date.replace("Mar", "3");
		}else if(date.contains("Apr")) {
			date = date.replace("Apr", "4");
		}else if(date.contains("May")) {
			date = date.replace("May", "5");
		}else if(date.contains("Jun")) {
			date = date.replace("Jun", "6");
		}else if(date.contains("Jul")) {
			date = date.replace("Jul", "7");
		}else if(date.contains("Aug")) {
			date = date.replace("Aug", "8");
		}else if(date.contains("Sep")) {
			date = date.replace("Sep", "9");
		}else if(date.contains("Oct")) {
			date = date.replace("Oct", "10");
		}else if(date.contains("Nov")) {
			date = date.replace("Nov", "11");
		}else if(date.contains("Dec")) {
			date = date.replace("Dec", "12");
		}
		return date;

	}

}
