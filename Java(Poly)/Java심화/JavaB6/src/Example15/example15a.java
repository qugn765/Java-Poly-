package Example15;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class example15a {

	public static void main(String[] args) {
		Calendar k05_cal = Calendar.getInstance();  //cal ���糯¥�޾ƿ���
		SimpleDateFormat k05_dt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // ����ð� data����
		int k05_iPerson = 200; // ����ο� ����
		k05_InData k05_inData = new k05_InData(k05_iPerson); // ��ü����
		k05_inData.k05_printData(k05_iPerson);

	}

}