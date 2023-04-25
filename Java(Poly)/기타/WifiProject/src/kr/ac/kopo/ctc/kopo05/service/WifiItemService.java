package kr.ac.kopo.ctc.kopo05.service;

import java.util.List;

import kr.ac.kopo.ctc.kopo05.domain.WifiItem;

public class WifiItemService {
	public double getDistance(WifiItem wifiItem1, WifiItem wifiItem2) {
		double lat1 = wifiItem1.getLatitude();
		double lng1 = wifiItem1.getLongitude();
		double lat2 = wifiItem2.getLatitude();
		double lng2 = wifiItem2.getLongitude();

		double k05_dist = Math.sqrt(Math.pow(lat1- lat2, 2) + Math.pow(lng1 - lng2 ,2));

		return k05_dist;
	}


	public void printDistance(List<WifiItem> wifiItems, List<Double> distanceList) {
		double k05_Min = Double.MAX_VALUE;
		double k05_Max = Double.MIN_VALUE;
		WifiItem far = null;
		WifiItem close = null;
		
		for(int i = 0; i < wifiItems.size(); i++) {
			k05_Min = Math.min(k05_Min, distanceList.get(i));
			if(k05_Min == distanceList.get(i)) {
				close = wifiItems.get(i);
			}
			
			k05_Max = Math.max(k05_Max, distanceList.get(i));
			if(k05_Max == distanceList.get(i)) {
				far = wifiItems.get(i);
			}
			
		}
		
		System.out.println("\n\n최소거리 : " + k05_Min + "\n" + close.getId() + "번째 항목\n" + close.getRoad_Name_Address());
		System.out.println();
		System.out.println("최대거리 : " + k05_Max + "\n" + far.getId() + "번째 항목\n" + far.getRoad_Name_Address());
	
	}

	


}
