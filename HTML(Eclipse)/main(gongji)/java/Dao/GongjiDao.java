package Dao;

import java.sql.SQLException;
import java.util.List;

import Domain.Gongji;

public interface GongjiDao {
	
	int makedata();
	
	List<Gongji> Allview() throws SQLException, ClassNotFoundException;
	
	int count() throws ClassNotFoundException, SQLException;
	
	Gongji oneview(int id) throws ClassNotFoundException, SQLException;
	
	int maxId() throws ClassNotFoundException, SQLException;
	
	int upadteWrite(int id, String title, String nowDate, String content) throws ClassNotFoundException, SQLException;
	
	int newWrite(int id, String title, String nowDate, String content) throws ClassNotFoundException, SQLException;
	
	int delete(int id) throws ClassNotFoundException, SQLException;
}
