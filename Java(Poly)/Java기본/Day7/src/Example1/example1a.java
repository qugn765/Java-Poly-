package Example1;

import java.util.Scanner;

public class example1a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] nums = new int[num];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scanner.nextInt();
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
	}

}
