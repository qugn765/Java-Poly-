package Dice;

import java.util.*;

public class dice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		int sum = scanner.nextInt();
		int[] arr = new int[times];
		DiceSumPrint(times, sum, 0, arr);
	}

	public static void DiceSumPrint(int times, int sum, int k, int[] arr) {
		if(sum == 0 && times == k) {
			System.out.print("(");
			for(int i = 0; i < times; i ++) {
				System.out.print(arr[i]);
				if(i < times -1) System.out.print(",");
			}
			System.out.println(")");
		} else if (times > k){
			for(int i = 1; i < 7; i++) {
				arr[k] = i;
				DiceSumPrint(times, sum - i, k + 1, arr);
			}
		}
	}

}
