package p5_EqualChar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution5 {
	public int[] solution(String s){
		int[] answer = new int[5];
		HashMap <Character,Integer> sH = new HashMap<>();
		for(char x : s.toCharArray()) {
			sH.put(x, sH.getOrDefault(x,0) + 1);	
		}
		int max = 0;
		for (Integer key : sH.values()) {
			max = Math.max(max, key);
		}
		for(int i = 0; i < answer.length; i++) {
			answer[i] = max - sH.getOrDefault((char) (i + 97), 0);	
		}
		return answer;
	}

	public static void main(String[] args){
		Solution5 T = new Solution5();

		System.out.println(Arrays.toString(T.solution("aaabc")));
		System.out.println(Arrays.toString(T.solution("aabb")));
		System.out.println(Arrays.toString(T.solution("abcde")));
		System.out.println(Arrays.toString(T.solution("abcdeabc")));
		System.out.println(Arrays.toString(T.solution("abbccddee")));
	}
}
