package p6_EqualChar2;

import java.util.*;

class Solution6 {
	public int solution(String s){
		int answer = 0;
		HashMap <Character,Integer> sH = new HashMap<>();
		for(char x : s.toCharArray()) {
			sH.put(x, sH.getOrDefault(x,0)+1);	
		}
		
		return answer;
	}

	public static void main(String[] args){
		Solution6 T = new Solution6();
		System.out.println(T.solution("aaabbbcc"));	
		System.out.println(T.solution("aaabbc"));		
		System.out.println(T.solution("aebbbbc"));		
		System.out.println(T.solution("aaabbbcccde"));	
		System.out.println(T.solution("aaabbbcccdddeeeeeff"));	
	}
}