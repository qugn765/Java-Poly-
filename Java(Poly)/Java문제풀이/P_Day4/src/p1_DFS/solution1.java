package p1_DFS;

import java.util.*;

public class solution1 {
	static int[] pm, ch, arr;
	static int n, m;

	public void DFS(int L) {

		if(L == m) {
			for(int x : pm) {
				System.out.print(x + " ");
			}
			System.out.println();
		} else {
			for(int i = 0; i < n; i++) {
				if(ch[i] == 0) {
					pm[L] = arr[i];
					ch[i] = 1;
					DFS(L+1);
					ch[i] = 0;
				}
			}
		}


	}


	public static void main(String[] args) {
		solution1 T = new solution1();
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		ch = new int[n];
		for(int i = 0; i < n; i++) {
			ch[i] = 0;
		}
		pm = new int[m];
		T.DFS(0);
	}

}
