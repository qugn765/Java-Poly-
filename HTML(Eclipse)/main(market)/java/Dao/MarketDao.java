package Dao;

import java.sql.SQLException;
import java.util.List;

import Domain.Item;

public interface MarketDao {
	
	List<Item> Allview() throws SQLException, ClassNotFoundException;
	
	int count() throws ClassNotFoundException, SQLException;
	
	Item oneview(int id) throws ClassNotFoundException, SQLException;
	
	int maxId() throws ClassNotFoundException, SQLException;
	
	int updateWrite(int id, int inventory, String inventorydate) throws ClassNotFoundException, SQLException;
	
	int newWrite(int id, String name, int inventory, String goodsdate, String inventorydate, String explanation, String img1, String img2) throws ClassNotFoundException, SQLException;
	
	int delete(int id) throws ClassNotFoundException, SQLException;
	
	String getName(int id) throws ClassNotFoundException, SQLException;
	
	int makedata() throws ClassNotFoundException, SQLException;
	
	int deleteAll() throws ClassNotFoundException, SQLException;
	
}