package p2_bitonic;

import java.util.*;

class mycode2 {
	public int solution2(int[] nums){
		int answer = 0;
		int n = nums.length;
		int cnt = 0;
		int flag =1;
		int flag2 = 1;
		for(int i = 0; i < n -1; i++) {
			if(nums[i] < nums[i+1]) flag = 1;
			if(nums[i] > nums[i+1]) flag = 0;
			
			if(flag == 1 && flag2 == 1) {
				cnt++;
			} else if(flag == 0) {
				cnt++;
			} else if (flag == 1 && flag2 ==0) {
				cnt = 1;
			} else if (nums[i] == nums[i+1]) {
				cnt = 1;
			}
			flag2 = flag;
			
			if(i == (n - 2)) {
				if(nums[n-2] > nums[n-1]) cnt++;
			}
			answer = Math.max(cnt, answer);
		}
		
				
		return answer;	
	}

	public static void main(String[] args){
		mycode2 T = new mycode2();
		System.out.println(T.solution2(new int[]{1, 2, 1, 2, 3, 2, 1}));
		System.out.println(T.solution2(new int[]{1, 1, 2, 3, 5, 7, 4, 3, 1, 2}));
		System.out.println(T.solution2(new int[]{3, 2, 1, 3, 2, 4, 6, 7, 3, 1}));
		System.out.println(T.solution2(new int[]{1, 3, 1, 2, 1, 5, 3, 2, 1, 1}));
	}
}