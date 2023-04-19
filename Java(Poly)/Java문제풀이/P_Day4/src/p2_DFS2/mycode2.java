package p2_DFS2;

import java.util.*;

class mycode2 {
	int count = 0;
	int count2 = 0;
	public int solution2(String s, int a){
		if(count2 == s.length()) count++;
		int answer = 0;
		String cut1, cut2;
		for(int j = 0; j < s.length(); j++) {
			cut1 = s.substring(0,2);
			cut2 = s.substring(0,3);
			for(int k = 1; k < 27; k++) {
				String temp = String.valueOf(k);
				if(cut1.equals(temp)) {
					count2 = count2 + 1;
					solution2(s.substring(1), count2);

				}
				if(cut2.equals(temp)) {
					count2 = count2 + 2;
					solution2(s.substring(2), count2);
				}

			}
		}



		answer= count;

		return answer;
	}

	public static void main(String[] args){
		mycode2 T = new mycode2();
		System.out.println(T.solution2("25114",0));
		//System.out.println(T.solution2("23251232"));
		//System.out.println(T.solution2("21020132"));
		//System.out.println(T.solution2("21350"));
		//System.out.println(T.solution2("120225"));
		//System.out.println(T.solution2("232012521"));
	}
}