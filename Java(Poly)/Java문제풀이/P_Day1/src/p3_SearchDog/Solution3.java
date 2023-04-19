package p3_SearchDog;

import java.util.*;

public class Solution3 {
	public int solution(int[][] board){
		int answer = 0;
		int[] hyunsoo = {0, 0};
		int[] dog = {0, 0};
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(board[i][j] == 2) {
					hyunsoo[0] = i; hyunsoo[1] = j;
				} else if (board[i][j] == 3) {
					dog[0] = i; dog[1] =j;
				}
			}
		}

		int n = board.length;
	
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		int hyunx = hyunsoo[0], hyuny = hyunsoo[1], dhyun = 0;
		int dogx = dog[0], dogy = dog[1], ddog = 0;
		while(answer < 10000) {
			int nhyunx = hyunx + dx[dhyun];
			int nhyuny = hyuny + dy[dhyun];
			int ndogx = dogx + dx[ddog]; 
			int ndogy = dogy + dy[ddog];
			//System.out.println(hyunx + "    " + hyuny);
			//System.out.println(dogx + "    " + dogy);
			answer++;
			if(answer == 100) {
				answer = 0; break;
			}
			if((nhyunx < 0 || nhyunx >= n || nhyuny < 0 || nhyuny >= n || board[nhyunx][nhyuny] == 1) && (ndogx < 0 ||ndogx >= n || ndogy < 0 || ndogy >= n || board[ndogx][ndogy] == 1)) {
				dhyun = (dhyun + 1) % 4;
				ddog = (ddog + 1) % 4;
			} else if (ndogx < 0 ||ndogx >= n || ndogy < 0 || ndogy >= n || board[ndogx][ndogy] == 1) {
				hyunx = nhyunx; 
				hyuny = nhyuny;
				ddog = (ddog + 1) % 4;	
			} else if (nhyunx < 0 || nhyunx >= n || nhyuny < 0 || nhyuny >= n || board[nhyunx][nhyuny] == 1) {
				dogx = ndogx; 
				dogy = ndogy;
				dhyun = (dhyun + 1) % 4;
			} else {
				hyunx = nhyunx; 
				hyuny = nhyuny;
				dogx = ndogx; 
				dogy = ndogy;
				if(hyunx == dogx && hyuny == dogy) break;
			}
			
		}
		return answer;		
	}

	public static void main(String[] args){
		Solution3 T = new Solution3();
		int[][] arr1 = {{0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, 
				{0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, 
				{0, 0, 0, 1, 0, 0, 0, 1, 0, 0}, 
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
				{0, 0, 0, 1, 0, 0, 0, 2, 0, 0}, 
				{1, 0, 0, 0, 0, 0, 1, 0, 0, 0}, 
				{0, 0, 0, 1, 0, 0, 0, 0, 0, 0}, 
				{0, 0, 0, 0, 0, 3, 0, 0, 0, 1}, 
				{0, 0, 0, 1, 0, 1, 0, 0, 0, 0}, 
				{0, 1, 0, 1, 0, 0, 0, 0, 0, 0}}; 
		System.out.println(T.solution(arr1));
		System.out.println("\n\n\n\n\n");
		int[][] arr2 = {{1, 0, 0, 0, 1, 0, 0, 0, 0, 0}, 
				{0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, 
				{0, 0, 1, 1, 0, 0, 0, 1, 0, 0}, 
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
				{0, 0, 0, 1, 0, 1, 0, 0, 0, 0}, 
				{1, 0, 0, 0, 0, 0, 1, 0, 1, 0}, 
				{0, 0, 0, 1, 0, 0, 0, 0, 0, 0}, 
				{0, 0, 1, 0, 0, 0, 0, 0, 2, 1}, 
				{0, 0, 0, 1, 0, 1, 0, 0, 0, 1}, 
				{0, 1, 0, 1, 0, 0, 0, 0, 0, 3}}; 
		System.out.println(T.solution(arr2));
	}
}