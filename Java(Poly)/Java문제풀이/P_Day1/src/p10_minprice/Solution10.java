package p10_minprice;

import java.util.*;

class Solution10 {
	public int solution(int n, int[][] flights, int s, int e, int k){
		int sum = 0;
		int ad = 0;
		for(int i = 0; i < flights.length; i++) {
			if(flights[i][0]== s) {
				sum += flights[i][2];
				ad = flights[i][1];
				if(flights[i][1] == e && k == 0)break;
				return solution(n, flights, ad,  e, k -1);
			}
		}
		return sum;

	}



	public static void main(String[] args){
		Solution10 T = new Solution10();
		System.out.println(T.solution(5, new int[][]{{0, 1, 10}, {1, 2, 20}, {0, 2, 70}, {0, 3, 100}, {1, 3, 80}, {2, 3, 10}, {2, 4, 30}, {3, 4, 10}}, 0, 3, 1));
		System.out.println(T.solution(4, new int[][]{{0, 1, 10}, {0, 2, 10}, {1, 3, 5}, {2, 3, 3}}, 0, 3, 0));
		System.out.println(T.solution(8, new int[][]{{0, 3, 10}, {1, 5, 10}, {1, 7, 100}, {0, 1, 10}, {0, 2, 10}, {5, 7, 30}, {3, 7, 10}, {1, 3, 5}, {2, 3, 3}}, 1, 7, 2));
		System.out.println(T.solution(10, new int[][]{{1, 8, 50}, {0, 8, 30}, {1, 0, 10}, {2, 8, 10}, {0, 3, 10}, {1, 5, 10}, {1, 7, 100}, {0, 1, 10}, {0, 2, 10}, {5, 7, 30}, {3, 7, 10}, {1, 3, 5}, {2, 3, 3}}, 1, 8, 2));
	}
}