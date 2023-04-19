package P09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class p09a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> input = new ArrayList<String>();
		String[][] input1 = new String[10][2];
		for (int i = 0; i < 10; i++) {
			String a = scanner.nextLine();
			String[] b = a.split(",");
			for (int j = 0; j < input1[i].length; j++) {
				input1[i][j] = b[j];
		
			}
		}

		try {
		Arrays.sort(input1, new Comparator<String[]>() {
		    @Override
		    public int compare(String[] o1, String[] o2) {
		        return o1[0].compareTo(o2[0]);
		    }
		});
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		for (int i = 0; i < input1.length; i++) {
			for (int j = 0; j < input1[i].length; j++) {
				System.out.print(input1[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		System.out.println();
		try {
		Arrays.sort(input1, new Comparator<String[]>() {
		    @Override
		    public int compare(String[] o1, String[] o2) {
		        return o1[1].compareTo(o2[1]);
		    }
		});
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < input1.length; i++) {
			for (int j = 0; j < input1[i].length; j++) {
				System.out.print(input1[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}




/*
a,2
b,1
c,4
d,3
f,5
x,6
y,7
z,8
e,9
k,0

 */