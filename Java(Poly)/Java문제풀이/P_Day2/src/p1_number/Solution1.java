package p1_number;

import java.util.Arrays;

public class Solution1 {
	
	public int[] solution(int c, int r, int k){
		if(k > c * r) return new int[] {0,0};
		int[][] arr = new int[c][r];
		int[] answer = new int[2];
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		int x = 0, y = 0, d = 1, cnt = 1;
		while(cnt < k) {
			int nx = x + dx[d];
			int ny = y + dy[d];
			if(nx < 0 || nx >= c || ny < 0 || ny >= r || arr[nx][ny] > 0) {
				d = (d + 1) % 4;
				continue;
			}
			arr[x][y] = cnt;
			cnt++;
			x = nx;
			y = ny;
		}
		answer[0] = x + 1;
		answer[1] = y + 1;	
		return answer;
	}
	
	public static void main(String[] args){
		Solution1 T = new Solution1();
		System.out.println(Arrays.toString(T.solution(6, 5, 12)));	
		System.out.println(Arrays.toString(T.solution(6, 5, 20)));
		System.out.println(Arrays.toString(T.solution(6, 5, 30)));
		System.out.println(Arrays.toString(T.solution(6, 5, 31)));
	}
}


