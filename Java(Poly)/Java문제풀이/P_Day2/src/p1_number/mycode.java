package p1_number;

import java.util.Arrays;

public class mycode {
	
	public int[] solution(int c, int r, int k){
		if(k > c * r) return new int[] {0,0};
		int[][] arr = new int[r][c];
		int[] answer = new int[2];
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		int x = r - 1, y = 0, d = 0, cnt = 1;
		while(cnt < k) {
			int nx = x + dx[d];
			int ny = y + dy[d];
			if(nx < 0 || nx >= r || ny < 0 || ny >= c || arr[nx][ny] > 0) {
				d = (d + 1) % 4;
				continue;
			}
			arr[x][y] = cnt;
			cnt++;
			x = nx;
			y = ny;
		}
		answer[0] = y + 1;
		answer[1] = c - x - 1;	
		return answer;
	}
	
	public static void main(String[] args){
		mycode T = new mycode();
		System.out.println(Arrays.toString(T.solution(6, 5, 12)));	
		System.out.println(Arrays.toString(T.solution(6, 5, 20)));
		System.out.println(Arrays.toString(T.solution(6, 5, 30)));
		System.out.println(Arrays.toString(T.solution(6, 5, 31)));
	}
}


