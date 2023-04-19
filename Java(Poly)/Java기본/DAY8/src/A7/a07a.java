package A7;

import java.util.ArrayList;
import java.util.Scanner;

public class a07a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			int num = scanner.nextInt();
			int[] arr = new int[num];
			try {
			for(int i = 0; i < arr.length; i++) {
				if(i == 0) {
					arr[0] = 0;
				} else if(i == 1) {
					arr[1] = 1;            
				} else {
					arr[i] = arr[i - 1] + arr[i - 2];
				}
				System.out.print(arr[i] +  " ");
			}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

