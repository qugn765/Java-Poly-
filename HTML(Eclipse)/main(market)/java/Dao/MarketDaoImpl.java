package Dao;

import java.sql.Connection;
import Service.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Domain.Item;

public class MarketDaoImpl implements MarketDao {

	@Override
	public int count() throws ClassNotFoundException, SQLException {
		int count = 0;

		Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kopo05", "root" , "1234");
		// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
		Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
		ResultSet rset = stmt.executeQuery("select count(*) from Market"); // 명령어를 통해 나오는값을 rset에 저장
		rset.next();
		count = rset.getInt(1);
		stmt.close(); // 에러가 발생하지않기 위해 객체닫기
		conn.close(); // 에러가 발생하지않기 위해 연결끊기
		return count;
	}
	

	@Override
	public List<Item> Allview() throws SQLException, ClassNotFoundException {
		List<Item> itemList = new ArrayList<Item>();
		Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kopo05", "root" , "1234");
		// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
		Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
		ResultSet rset = stmt.executeQuery("select * from Market"); // 명령어를 통해 나오는값을 rset에 저장
		while(rset.next()) {
			Item item = new Item();
			item.setId(rset.getInt(1));
			item.setName(rset.getString(2));
			item.setInventory(rset.getInt(3));
			item.setGoodsdate(rset.getString(4));
			item.setInventorydate(rset.getString(5));
			item.setExplanation(rset.getString(6));
			item.setImg1(rset.getString(7));
			item.setImg2(rset.getString(8));
			itemList.add(item);
		}
		stmt.close(); // 에러가 발생하지않기 위해 객체닫기
		conn.close(); // 에러가 발생하지않기 위해 연결끊기
		return itemList;
	}


	@Override
	public Item oneview(int id) throws ClassNotFoundException, SQLException {
		Item item = new Item();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kopo05", "root" , "1234");
			// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
			Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
			ResultSet rset = stmt.executeQuery("select * from Market where id =" + id); // 명령어를 통해 나오는값을 rset에 저장
			try{
				rset.next();
				item.setId(rset.getInt(1));
				item.setName(rset.getString(2));
				item.setInventory(rset.getInt(3));
				item.setGoodsdate(rset.getString(4));
				item.setInventorydate(rset.getString(5));
				item.setExplanation(rset.getString(6));
				item.setImg1(rset.getString(7));
				item.setImg2(rset.getString(8));
	
			} catch(Exception e){
				item.setId(0);
				item.setName("조회하신상품번호의 상품이없습니다");
				item.setInventory(0);
				item.setGoodsdate("0000-00-00");
				item.setInventorydate("0000-00-00");
				item.setExplanation("-");
				item.setImg1("-");
				item.setImg2("-");
			}
			stmt.close(); // 에러가 발생하지않기 위해 객체닫기
			conn.close(); // 에러가 발생하지않기 위해 연결끊기
		}catch (Exception e) {
			item.setId(0);
			item.setName("데이터베이스연결실패");
			item.setInventory(0);
			item.setGoodsdate("0000-00-00");
			item.setInventorydate("0000-00-00");
			item.setExplanation("-");
			item.setImg1("-");
			item.setImg2("-");
		}
		return item;
	}

	@Override
	public int maxId() throws ClassNotFoundException, SQLException {
		int maxid = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kopo05", "root" , "1234");
			// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
			Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
			ResultSet rset = stmt.executeQuery("select Max(id) from Market"); // 명령어를 통해 나오는값을 rset에 저장
			rset.next();
			maxid = rset.getInt(1);
		}catch (Exception e) {
			maxid = 0;
		}
		return maxid;
	}

	@Override
	public int updateWrite(int id, int inventory, String inventorydate) throws ClassNotFoundException, SQLException {
		int checkerror=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kopo05", "root" , "1234");
			// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
			Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
			String Querytxt = "";
			Querytxt = String.format("Update Market SET inventory='%s', inventorydate='%s' WHERE id= '%s'",inventory,inventorydate, id);
			stmt.execute(Querytxt); // 명령어를 통해 나오는값을 rset에 저장
		} catch (Exception e) {
			checkerror=1;
		}
		
		return checkerror;
	}

	@Override
	public int newWrite(int id, String name, int inventory, String goodsdate, String inventorydate, String explanation, String img1, String img2) throws ClassNotFoundException, SQLException {
		int checkerror=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kopo05", "root" , "1234");
			// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
			Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
			String Querytxt = "";
			Querytxt = String.format("insert into Market(id,name,inventory,goodsdate,inventorydate,explanation,img1,img2) values('%s','%s','%s','%s','%s','%s','%s','%s')",
									id,name,inventory,goodsdate,inventorydate,explanation,img1,img2);
			stmt.execute(Querytxt); // 명령어를 통해 나오는값을 rset에 저장
		} catch (Exception e) {
			checkerror=1;
		}
		
		return checkerror;
	}

	@Override
	public int delete(int id) throws ClassNotFoundException, SQLException {
		int checkerror=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kopo05", "root" , "1234");
			// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
			Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
			String Querytxt = "";
			Querytxt = String.format("delete from Market where id = '%s'",id);
			stmt.execute(Querytxt); // 명령어를 통해 나오는값을 rset에 저장
		} catch (Exception e) {
			checkerror=1;
		}
		
		return checkerror;
	}

	@Override
	public String getName(int id) throws ClassNotFoundException, SQLException {
		String name = "";
		Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kopo05", "root" , "1234");
		// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
		Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
		ResultSet rset = stmt.executeQuery("select name from Market where id=" + id); // 명령어를 통해 나오는값을 rset에 저장
		while(rset.next()) {
			name=rset.getString(1);
		}
		stmt.close(); // 에러가 발생하지않기 위해 객체닫기
		conn.close(); // 에러가 발생하지않기 위해 연결끊기
		return name;
	}


	@Override
	public int makedata() throws ClassNotFoundException, SQLException {
		int checkerror = 0;
		try {
			Service service = new ServiceImpl();
			Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
			Connection k05_conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kopo05", "root" , "1234");
			// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
			Statement k05_stmt = k05_conn.createStatement(); // JDBC에 입력할 객체를 생성
			String Querytxt = "";
			LocalDate nowDate = service.nowTime();
			for(int i = 0; i < 65; i++) {
				Querytxt = String.format("insert into Market(id, name,inventory,goodsdate,inventorydate,explanation,img1,img2) values('%s','%s','%s','%s','%s','%s','%s','%s');"
						,(i + 1), "테스트" + (i+1), (int)(Math.random()*100),nowDate,nowDate,"설명테스트" + (i+1)," "," ");
				k05_stmt.execute(Querytxt);
				// grades라는 table을 (fieldname  저장형태)의 형식으로 table 생성
			}
			k05_stmt.close(); // 에러가 발생하지않기 위해 객체닫기
			k05_conn.close(); // 에러가 발생하지않기 위해 연결끊기
		} catch (Exception e) {
			checkerror = 1;
		}

		return checkerror;
	}


	@Override
	public int deleteAll() throws ClassNotFoundException, SQLException {
		int checkerror = 0;
		try {
			Service service = new ServiceImpl();
			Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
			Connection k05_conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kopo05", "root" , "1234");
			// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
			Statement k05_stmt = k05_conn.createStatement(); // JDBC에 입력할 객체를 생성
			String Querytxt = "delete from Market;";
			k05_stmt.execute(Querytxt);
			k05_stmt.close(); // 에러가 발생하지않기 위해 객체닫기
			k05_conn.close(); // 에러가 발생하지않기 위해 연결끊기
		} catch (Exception e) {
			checkerror = 1;
		}

		return checkerror;
	}


}
