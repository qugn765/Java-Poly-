package p6_lostdoc;

import java.util.*;
class mycode6 {
	public String[] solution6(String[] reports, String times){
		HashMap <String,Integer> nH = new HashMap<>();
		ArrayList<String> person = new ArrayList<>();
		String[] losttime = times.split(" ");
		int starttime = gettime(losttime[0]);
		int endtime = gettime(losttime[1]);
		String[][] arr = new String[reports.length][2] ;
		for(int i = 0; i < reports.length; i++) {
			arr[i] = reports[i].split(" ");
			int a = gettime(arr[i][1]);
			nH.put(arr[i][0], a);
		}
		for(String x : nH.keySet()) {
			if( starttime <= nH.get(x) && nH.get(x) <= endtime) {
				person.add(x);
			}
		}
		String[] answer = new String[person.size()];
		int size=0;
		for(String x : person) {
			answer[size++] = x;
		}

		return answer;
	}
	
	public static int gettime(String sttime) {
		String[] atime = sttime.split(":");
		int time = Integer.parseInt(atime[0]) * 60 + Integer.parseInt(atime[1]);
		
		return time;
	}

	public static void main(String[] args){
		mycode6 T = new mycode6();
		System.out.println(Arrays.toString(T.solution6(new String[]{"john 15:23", "daniel 09:30", "tom 07:23", "park 09:59", "luis 08:57"}, "08:33 09:45")));
		System.out.println(Arrays.toString(T.solution6(new String[]{"ami 12:56", "daniel 15:00", "bob 19:59", "luis 08:57", "bill 17:35", "tom 07:23", "john 15:23", "park 09:59"}, "15:01 19:59")));
		System.out.println(Arrays.toString(T.solution6(new String[]{"cody 14:20", "luis 10:12", "alice 15:40", "tom 15:20", "daniel 14:50"}, "14:20 15:20")));
	}
}