package Example15;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class example15a {

	public static void main(String[] args) {
		Calendar k05_cal = Calendar.getInstance();  //cal 현재날짜받아오기
		SimpleDateFormat k05_dt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // 현재시간 data형식
		int k05_iPerson = 200; // 사람인원 선언
		k05_InData k05_inData = new k05_InData(k05_iPerson); // 객체생성
		k05_inData.k05_printData(k05_iPerson);

	}

}