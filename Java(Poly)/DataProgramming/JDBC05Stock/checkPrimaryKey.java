package JDBC05Stock;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class checkPrimaryKey {

	public static void main(String[] args) throws IOException{
		File k05_f = new File("C:\\Users\\KBH\\Input\\StockDailyPricecheck.csv");
		BufferedReader k05_br = new BufferedReader(new FileReader(k05_f));
		File k05_f1 = new File("C:\\Users\\KBH\\out\\duplication.csv");
		BufferedWriter k05_bw1 = new BufferedWriter(new FileWriter(k05_f1));

		String k05_readtxt;

		String stockcode = "";
		String stockdate = "";
		String duplication = " ";
		while((k05_readtxt = k05_br.readLine()) != null) {
			String[] field = k05_readtxt.split(",");
			if((stockcode.equals(field[1])) && stockdate.equals(field[2])) {
				duplication = field[0] + field[1] + field[2];
				k05_bw1.write(duplication);
				System.out.println(duplication);
			}
			stockcode = field[1];
			stockdate = field[2];	

		}


		k05_br.close();
		k05_bw1.close();
	}

}
