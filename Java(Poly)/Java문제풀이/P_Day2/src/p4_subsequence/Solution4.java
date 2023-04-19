package p4_subsequence;

import java.util.*;
public class Solution4 {
	public int solution4(int[] nums, int m){
		int answer = 0;
		
		return answer;
	}

	public static void main(String[] args){
		Solution4 T = new Solution4();
		System.out.println(T.solution4(new int[]{2, 2, 3, -1, -1, -1, 3, 1, 1}, 5));	
		System.out.println(T.solution4(new int[]{1, 2, 3, -3, 1, 2, 2, -3}, 5));	
		System.out.println(T.solution4(new int[]{1, 2, 3, -3, 1, 2}, 3));	
		System.out.println(T.solution4(new int[]{-1, 0, 1}, 0));	
		System.out.println(T.solution4(new int[]{-1, -1, -1, 1}, 0));	
	}
}