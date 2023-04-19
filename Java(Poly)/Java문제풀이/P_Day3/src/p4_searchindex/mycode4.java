package p4_searchindex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
class mycode4 {

	public int[] solution4(int[] nums){
		ArrayList <Integer> arrL = new ArrayList<>();
		HashMap <Integer,Integer> map = new HashMap<>();
		int[] answer = new int[nums.length / 2];
		Arrays.sort(nums);
		for(int x : nums) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		ArrayList<Integer> keyList = new ArrayList<>(map.keySet());
		keyList.sort((s1, s2) -> s1.compareTo(s2));
		int i = 0;
		for(int x : nums) {
			if(map.get(x) != 0) {
				answer[i] = x;
				i++;
				map.put(x, map.get(x) - 1);
				map.put(x*2, map.get(x * 2) - 1);

			}
		}

		return answer;
	}

	public static void main(String[] args){
		mycode4 T = new mycode4();
		System.out.println(Arrays.toString(T.solution4(new int[]{1, 10, 2, 3, 5, 6})));
		System.out.println();
		System.out.println(Arrays.toString(T.solution4(new int[]{1, 1, 6, 2, 2, 7, 3, 14})));
		System.out.println();
		System.out.println(Arrays.toString(T.solution4(new int[]{14, 4, 2, 6, 3, 10, 10, 5, 5, 7, 7, 14})));
	}
}