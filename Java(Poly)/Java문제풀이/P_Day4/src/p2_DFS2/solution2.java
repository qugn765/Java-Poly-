package p2_DFS2;

import java.util.*;
class solution2 {
	int[] dy;
	public int solution2(String s){
		dy = new int[101];
		int answer = DFS(0,s);
		return answer;
	}
	
	public int DFS(int start, String s) {
		if(dy[start] > 0) return dy[start];
		if(start < s.length() && s.charAt(start) == '0') return 0;
		if(start == s.length() - 1 || start == s.length()) return 1;
		else {
			int res = DFS(start + 1, s);
			int tmp = Integer.parseInt(s.substring(start, start + 2));
			if(tmp <= 26) res += DFS(start + 2, s);
			return dy[start] = res;
		}
	}

	public static void main(String[] args){
		solution2 T = new solution2();
		//System.out.println(T.solution2("25114"));
		//System.out.println(T.solution2("23251232"));
		System.out.println(T.solution2("21020132"));
		//System.out.println(T.solution2("21350"));
		//System.out.println(T.solution2("120225"));
		//System.out.println(T.solution2("232012521"));
	}
}