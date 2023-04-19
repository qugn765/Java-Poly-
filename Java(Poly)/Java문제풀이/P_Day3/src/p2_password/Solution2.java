package p2_password;

import java.util.*;
class Solution2 {
	public int solution2(int[] keypad, String password){
		int answer = 0;
		
		return answer;
	}

	public static void main(String[] args){
		Solution2 T = new Solution2();
		System.out.println(T.solution2(new int[]{2, 5, 3, 7, 1, 6, 4, 9, 8}, "7596218"));	
		System.out.println(T.solution2(new int[]{1, 5, 7, 3, 2, 8, 9, 4, 6}, "63855526592"));
		System.out.println(T.solution2(new int[]{2, 9, 3, 7, 8, 6, 4, 5, 1}, "323254677"));
		System.out.println(T.solution2(new int[]{1, 6, 7, 3, 8, 9, 4, 5, 2}, "3337772122"));
	}
}