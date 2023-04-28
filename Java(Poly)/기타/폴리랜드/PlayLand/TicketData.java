package PlayLand;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class TicketData {

	public static void TicketDataPrint() throws IOException {
		File f = new File("C:\\Users\\KBH\\out\\playLand.csv");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String readtxt; // 데이터를 출력하기위해 저장할 변수 선언

		readtxt = br.readLine();
		String[] field_name = readtxt.split(","); // 첫번째 줄을 ,단위로 나눠서 fieldname에 저장
		System.out.println(Arrays.toString(field_name));
		
		
		int LineCnt = 1;
		while ((readtxt = br.readLine()) != null) {
			String[] field = readtxt.split(",");
			System.out.println(Arrays.toString(field));
		}
		
		
	}
}
