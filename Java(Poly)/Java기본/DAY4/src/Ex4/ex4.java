package Ex4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ex4 {

	public static void main(String[] args) {
		System.out.println(Math.min(3, 13));
		System.out.println(Math.max(123, 54));
		System.out.println(Math.abs(-23.1));
		System.out.println(Math.sqrt(3));
		System.out.println(Math.random());
		
		
		System.out.println();
		
		
		TimeZone time;
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		time = TimeZone.getTimeZone("Europe/Paris");
		dateFormat.setTimeZone(time);
		System.out.println(time.getDisplayName() + " : "+dateFormat.format(date));
	}

}
