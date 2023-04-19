package p4_subsequence;

import java.util.*;
public class mycode4 {
	public int solution4(int[] nums, int m){
		HashMap <Integer,Integer> nH = new HashMap<>();
		nH.put(0, 1);
		int answer = 0;
		int sum  = 0;
		int k = 0;
		for(int i = 0; i < nums.length; i++) {
			if(sum - m >= 0) {
				k = sum - m;
				if(nH.getOrDefault(k,0) != 0) {
					answer++;
				}
				nH.put(k, nH.getOrDefault(k,0) + 1);
			} else {
				nH.put(sum, nH.getOrDefault(sum,0) + 1);
			}
		}
		System.out.println(nH);
		return answer;
	}

	public static void main(String[] args){
		mycode4 T = new mycode4();
		System.out.println(T.solution4(new int[]{2, 2, 3, -1, -1, -1, 3, 1, 1}, 5));	
		System.out.println(T.solution4(new int[]{1, 2, 3, -3, 1, 2, 2, -3}, 5));	
		System.out.println(T.solution4(new int[]{1, 2, 3, -3, 1, 2}, 3));	
		System.out.println(T.solution4(new int[]{-1, 0, 1}, 0));	
		System.out.println(T.solution4(new int[]{-1, -1, -1, 1}, 0));	
	}
}