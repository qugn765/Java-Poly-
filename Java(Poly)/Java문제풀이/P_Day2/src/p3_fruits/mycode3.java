package p3_fruits;

import java.util.*;
class mycode3 {
	public int solution3(int[][] fruit){
		int answer = 0;
		int x = fruit.length;
		int y = fruit[0].length;
		boolean[] tf = new boolean[fruit.length];
		for(int i = 0; i < fruit.length - 1 ; i++) {
			if(tf[i] == false) {
				int a = num(fruit[i]);
				for(int j = i + 1; j < fruit.length; j++) {
					int b = num(fruit[j]);
					if(tf[j] == false) {
						if(a != b && fruit[i][a] +1 <= fruit[i][b]-1 && fruit[j][b] + 1 <= fruit[j][a] -1 && fruit[i][a] != fruit[i][b] && fruit[j][a] != fruit[j][b]) {
							fruit[i][a]++;
							fruit[i][b]--;
							fruit[j][a]--;
							fruit[j][b]++;
							tf[i] = true; tf[j] = true;
							break;
						}
					}
				}
			}
		}
		for(int i = 0; i < fruit.length; i++) {
			answer = answer + fruit[i][num(fruit[i])];
		}

		return answer;
	}


	public static int num(int[] fruit) {
		int number = 0;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < fruit.length; i++) {
			min = Math.min(fruit[i], min);
			if(min == fruit[i]) {
				number = i;
			}
		}
		return number;
	}


	public static void main(String[] args){
		mycode3 T = new mycode3();
		System.out.println(T.solution3(new int[][]{{10, 20, 30}, {12, 15, 20}, {20, 12, 15}, {15, 20, 10}, {10, 15, 10}}));
		System.out.println(T.solution3(new int[][]{{10, 9, 11}, {15, 20, 25}}));	
		System.out.println(T.solution3(new int[][]{{0, 3, 27}, {20, 5, 5}, {19, 5, 6}, {10, 10, 10}, {15, 10, 5}, {3, 7, 20}}));
		System.out.println(T.solution3(new int[][]{{3, 7, 20}, {10, 15, 5}, {19, 5, 6}, {10, 10, 10}, {15, 10, 5}, {3, 7, 20}, {12, 12, 6}, {10, 20, 0}, {5, 10, 15}}));
	}
}