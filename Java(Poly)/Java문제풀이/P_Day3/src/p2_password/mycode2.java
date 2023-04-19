package p2_password;

import java.util.*;
class mycode2 {
	public int solution2(int[] keypad, String password){
		int answer = 0;
		int[][] table = new int[9][9];
		int x = 0; int y = 0; int z = 0; int w = 0; 
		
		for(int i = 0; i < 9; i++) {
			for(int j =0; j < 9; j++) {
				for(int a = 0; a < 9; a++) {
					if(i == keypad[a] - 1) {
						x = a / 3; y = a % 3;
					}
					if(j == keypad[a] - 1) {
						z = a / 3; w = a % 3;
					}
				}

				if(i == j) {
					table[i][j] = 0;
				} else if(Math.abs(x - z) <= 1 && Math.abs(y - w) <= 1) {
					table[i][j] = 1; 
				} else {
					table[i][j] = 2;
				}

			}
		}
		

		for(int i = 0; i < password.length()-1; i++) {
			int from = changeint(password.charAt(i)) - 1;
			int to = changeint(password.charAt(i+1)) - 1;
			answer += table[from][to];
		}
		
		
		return answer;
	}

	public static void main(String[] args){
		mycode2 T = new mycode2();
		System.out.println(T.solution2(new int[]{2, 5, 3, 7, 1, 6, 4, 9, 8}, "7596218"));	
		System.out.println(T.solution2(new int[]{1, 5, 7, 3, 2, 8, 9, 4, 6}, "63855526592"));
		System.out.println(T.solution2(new int[]{2, 9, 3, 7, 8, 6, 4, 5, 1}, "323254677"));
		System.out.println(T.solution2(new int[]{1, 6, 7, 3, 8, 9, 4, 5, 2}, "3337772122"));
	}
	
	public static int changeint(char s) {
		int cint = Integer.parseInt(String.valueOf(s));
		return cint;
		
	}
}