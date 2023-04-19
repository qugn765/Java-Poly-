package P08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class p08a {

	public static void main(String[] args) {
		Integer[] num = {2, 33, 7, 5, 12, 34, 99, 25, 28, 53,20};
		Arrays.sort(num);
		for(int i = 0; i <num.length; i++) {
			System.out.print(num[i] + ", ");
		}
		System.out.println();
		
		Arrays.sort(num, Collections.reverseOrder());
		for(int i = 0; i <num.length; i++) {
			System.out.print(num[i] + ", ");
		}
		


	}

}
