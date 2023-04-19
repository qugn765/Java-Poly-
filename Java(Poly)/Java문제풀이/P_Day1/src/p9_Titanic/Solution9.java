package p9_Titanic;

import java.util.*;
class Solution9 {
	public int solution9(int[] nums, int m){
		int answer = 0;
		Arrays.sort(nums);
		int left = 0;
		int rigth = nums.length - 1;
		while(left <= rigth) {
			if(nums[left] + nums[rigth] <= m) {
				answer++;
				left++;
				rigth--;
			} else {
				answer++;
				rigth--;
			}
		}
		
	
		
		
		return answer;
	}

	public static void main(String[] args){
		Solution9 T = new Solution9();
		System.out.println(T.solution9(new int[]{90, 50, 70, 100, 60}, 140));
		System.out.println(T.solution9(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90}, 100));
		System.out.println(T.solution9(new int[]{68, 72, 30, 105, 55, 115, 36, 67, 119, 111, 95, 24, 25, 80, 55, 85, 75, 83, 21, 81}, 120));
	}
}