package p6_lostdoc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
class Solution6 {
	public String[] solution6(String[] reports, String times){
		String[] answer = {};
		HashMap <String,Integer> nH = new HashMap<>();

		return answer;
	}

	public static void main(String[] args){
		Solution6 T = new Solution6();
		System.out.println(Arrays.toString(T.solution6(new String[]{"john 15:23", "daniel 09:30", "tom 07:23", "park 09:59", "luis 08:57"}, "08:33 09:45")));
		System.out.println(Arrays.toString(T.solution6(new String[]{"ami 12:56", "daniel 15:00", "bob 19:59", "luis 08:57", "bill 17:35", "tom 07:23", "john 15:23", "park 09:59"}, "15:01 19:59")));
		System.out.println(Arrays.toString(T.solution6(new String[]{"cody 14:20", "luis 10:12", "alice 15:40", "tom 15:20", "daniel 14:50"}, "14:20 15:20")));
	}
}