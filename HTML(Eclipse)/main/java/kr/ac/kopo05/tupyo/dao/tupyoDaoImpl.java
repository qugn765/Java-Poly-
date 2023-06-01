package kr.ac.kopo05.tupyo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import kr.ac.kopo05.tupyo.domain.AgeRate;
import kr.ac.kopo05.tupyo.domain.hubo;

public class tupyoDaoImpl implements tupyoDao{

	@Override
	public List<hubo> selectAll() throws ClassNotFoundException, SQLException {
		List<hubo> huboList = new ArrayList<hubo>();
		Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234"); 
		// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
		Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성		
		ResultSet rset = stmt.executeQuery("select * from vote"); // 명령어를 통해 나오는값을 rset에 저장
		while(rset.next()) {
			hubo huboItem = new hubo();
			huboItem.setNumber(rset.getInt(1));
			huboItem.setName(rset.getString(2));
			huboList.add(huboItem);
		}
		stmt.close(); // 에러가 발생하지않기 위해 객체닫기
		conn.close(); // 에러가 발생하지않기 위해 연결끊기 
		return huboList;
	}

	@Override
	public int deletehubo(int number){
		int checkerror = 0;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234"); 
		// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
		Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성	
		String QueryTxt = ""; // mysql에 명령해줄 명령어 저장변수
		QueryTxt = String.format("delete from vote where number='%s'",number);	
		stmt.execute(QueryTxt);
		QueryTxt = String.format("delete from voteResult where hubo='%s'",number);
		stmt.execute(QueryTxt);
		checkerror = 0;
		} catch (Exception e) {
			checkerror = 1;
		}
		return checkerror;
	}

	@Override
	public int inserthubo(int number, String name){
		int checkerror = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234"); 
			// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
			Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
			String QueryTxt = ""; // mysql에 명령해줄 명령어 저장변수
			QueryTxt = String.format("Insert into vote (number, name) value('%s','%s')",number,name);	
			stmt.execute(QueryTxt);
			checkerror = 0;
		} catch (Exception e) {
			checkerror = 1;
		}
		
		return checkerror;
	}

	@Override
	public int inserttupyo(int huboNumber, int age) {
		int checkerror = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234"); 
			// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
			Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
			String QueryTxt = ""; // mysql에 명령해줄 명령어 저장변수
			QueryTxt = String.format("Insert into voteResult (hubo, age) value('%s','%s')",huboNumber, age);	
			stmt.execute(QueryTxt);
			checkerror = 0;
		} catch (Exception e) {
			checkerror = 1;
		}
		
		return checkerror;
	}

	@Override
	public AgeRate tupyorate(int number) {
		AgeRate agerate = new AgeRate();
		float rate = 0;
		int voteCount = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234"); 
			// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
			Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
			String QueryTxt = ""; // mysql에 명령해줄 명령어 저장변수
			QueryTxt = String.format("select count(*) / (select count(*) from voteResult), count(*) from voteResult where hubo = " + number);	
			ResultSet rset = stmt.executeQuery(QueryTxt); // 명령어를 통해 나오는값을 rset에 저장
			rset.next();
			rate = rset.getFloat(1);
			voteCount = rset.getInt(2);
			agerate.setRate(rate);
			agerate.setCount(voteCount);
			
			
		} catch (Exception e) {
		}
		return agerate;
	}

	@Override
	public AgeRate selectOneRate(int number) throws ClassNotFoundException, SQLException {
		AgeRate agerate = new AgeRate();
		Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234"); 
		// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
		Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
		String QueryTxt = ""; // mysql에 명령해줄 명령어 저장변수
		for(int i = 1; i < 10; i++) {
			int age = i * 10;
			QueryTxt = String.format("select count(*) / (select count(*) from voteResult where hubo = "+ number +") , count(*) from voteResult where hubo = " + number + " and age=" + age);	
			ResultSet rset = stmt.executeQuery(QueryTxt); // 명령어를 통해 나오는값을 rset에 저장
			rset.next();
			float rate = ((float)((int)(rset.getFloat(1) * 10000)) / 100);
			int votecount = rset.getInt(2);
			if(age == 10) {
				agerate.setRate10(rate);
				agerate.setCount10(votecount);
			}
			if(age == 20) {
				agerate.setRate20(rate);
				agerate.setCount20(votecount);
			}
			if(age == 30) {
				agerate.setRate30(rate);
				agerate.setCount30(votecount);
			}
			if(age == 40) {
				agerate.setRate40(rate);
				agerate.setCount40(votecount);
			}
			if(age == 50) {
				agerate.setRate50(rate);
				agerate.setCount50(votecount);
			}
			if(age == 60) {
				agerate.setRate60(rate);
				agerate.setCount60(votecount);
			}
			if(age == 70) {
				agerate.setRate70(rate);
				agerate.setCount70(votecount);
			}
			if(age == 80) {
				agerate.setRate80(rate);
				agerate.setCount80(votecount);
			}
			if(age == 90) {
				agerate.setRate90(rate);
				agerate.setCount90(votecount);
			}
		}

		
		return agerate;
	}

	@Override
	public hubo selectOne(int number) throws ClassNotFoundException, SQLException {
		hubo huboItem = new hubo();
		Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234"); 
		// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
		Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성		
		ResultSet rset = stmt.executeQuery("select * from vote where number =" +number); // 명령어를 통해 나오는값을 rset에 저장
		rset.next();
		huboItem.setNumber(rset.getInt(1));
		huboItem.setName(rset.getString(2));
		stmt.close(); // 에러가 발생하지않기 위해 객체닫기
		conn.close(); // 에러가 발생하지않기 위해 연결끊기
		
		return huboItem;
	}

}
