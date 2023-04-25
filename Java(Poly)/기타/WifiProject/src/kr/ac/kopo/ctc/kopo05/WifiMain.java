package kr.ac.kopo.ctc.kopo05;

import java.io.*;
import java.util.*;

import kr.ac.kopo.ctc.kopo05.dao.WifiItemDao;
import kr.ac.kopo.ctc.kopo05.domain.WifiItem;
import kr.ac.kopo.ctc.kopo05.service.WifiItemService;

public class WifiMain {
	public static String[] k05_field_name;
	public static void main(String[] args) throws IOException {
		WifiItemService wifiItemService = new WifiItemService();
		WifiItemDao wifiItemDao = new WifiItemDao();
		List<WifiItem> wifiItems = wifiItemDao.selectAll();
	
		WifiItem me = new WifiItem();
		me.setLatitude(37.3860521);
		me.setLongitude(127.1214038);
		
		List<Double> distanceList = new ArrayList<Double>();
		for(WifiItem target : wifiItems) {
			double d = wifiItemService.getDistance(me, target);
			distanceList.add(d);
		}
			
		wifiItemService.printDistance(wifiItems, distanceList);
	
	}
	
	


	

}
