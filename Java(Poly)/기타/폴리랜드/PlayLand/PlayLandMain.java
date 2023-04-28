package PlayLand;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class PlayLandMain {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. 티켓발급   2. 데이터통계");
		int inputNumber = scanner.nextInt();
		if(inputNumber == 1) {
			TicketMachine.Ticket();
		} else if (inputNumber == 2) {
			TicketData.TicketDataPrint();
		}
	}

}
