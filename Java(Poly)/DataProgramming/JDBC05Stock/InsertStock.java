package JDBC05Stock;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class InsertStock {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException{
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection k05_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:33060/kopo05", "root" , "1234");
		Statement k05_stmt = k05_conn.createStatement();
		File k05_f = new File("C:\\Users\\KBH\\Input\\StockDailyPrice.csv");
		BufferedReader k05_br = new BufferedReader(new FileReader(k05_f));
		String k05_readtxt;
		SimpleDateFormat k05_df = new SimpleDateFormat("yyyy-MM-dd");

		if((k05_readtxt = k05_br.readLine()) == null) {
			System.out.println("빈파일입니다\n");
			return;
		}
		int k05_Linecnt = 1;
		// 단축코드, 일자, 	              시가,         고가,       저가,      종가,         거래량,          거래대금
		// code,     transaction_date, open_price, high_price, low_price, close_price, trading_volume, trading_amount
		// field[0],  field[1]			field[4]    field[5]    field[6]     field[3]	   field[11]	  field[12]
		while((k05_readtxt = k05_br.readLine()) != null) {
			String[] k05_field = k05_readtxt.split(",");
			String k05_QueryTxt = "";
			String k05_dateyear = k05_field[1].substring(0,4);
			String k05_datemonth = k05_field[1].substring(4,6);
			String k05_dateday = k05_field[1].substring(6,8);
			String k05_date = k05_dateyear + "-" + k05_datemonth +"-"+ k05_dateday;
			k05_QueryTxt = String.format("insert into stock(" + "Stockcode,"+ "transaction_date,"
					+ "open_price," +"high_price,"+ "low_price,"
					+ "close_price," + "trading_volume," + "trading_amount)"
					+ "values("
					+"'%s','%s','%s','%s','%s',"
					+"'%s','%s','%s');",
					k05_field[0],k05_date,k05_field[4],k05_field[5],k05_field[6],
					k05_field[3],k05_field[11],k05_field[12]);

			k05_stmt.execute(k05_QueryTxt);
			System.out.printf("%d번째 항목 Insert OK [%s]\n", k05_Linecnt, k05_QueryTxt);

			k05_Linecnt++;

		}	
		k05_br.close();
		k05_stmt.close(); 
		k05_conn.close(); 
	}
}


