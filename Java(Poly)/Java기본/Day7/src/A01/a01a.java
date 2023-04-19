package A01;

import java.util.Scanner;

public class a01a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] name = new String[5][4];

		for (int i =0; i < name.length; i++) {
			String name1 = scanner.nextLine();
			String[] name1s = name1.split(" "); 
			for (int j= 0; j < name[i].length; j++) {
				name[i][j] = name1s[j];
			}
		}

		for (int i =0; i < name.length; i++) {			
			for (int j= 0; j < name[i].length; j++) {
				System.out.print(name[i][j] + "\t");
			}
			System.out.println();
		}
		int[][] name1sint = new int[name.length][4];
		for (int i = 1; i < name.length; i++) {	
			int sum = 0;
			int avg = 0;
			int min = 0;
			int max = 0;
			for (int j= 1; j < name[i].length; j++) {
				name1sint[i][j]=Integer.parseInt(name[i][j]);
				sum = sum + name1sint[i][j];
				avg = sum / 3;
				if (name1sint[i][j] > max) {
					max = name1sint[i][j];
				}
				if (min ==0) {
					min = name1sint[i][j];
				} else {
					min = Math.min(min, name1sint[i][j]);
				}
			}
			System.out.println(name[i][0] + "의 점수 합은 " + sum +"\n" + 
					name[i][0] + "의 점수 평균은 " + avg + "\n" + 
					name[i][0] + "의 최고점수는 " + max + "\n" + 
					name[i][0] + "의 최소점수는 " + min);
			System.out.println();
		}
		
		for (int j = 1; j < name1sint[0].length; j++) {	
			int sum = 0;
			int avg = 0;
			int min = 0;
			int max = 0;
			for (int i= 1; i < name1sint.length; i++) {
				sum = sum + name1sint[i][j];
				avg = sum / 4;
				if (name1sint[i][j] > max) {
					max = name1sint[i][j];
				}
				if (min ==0) {
					min = name1sint[i][j];
				} else {
					min = Math.min(min, name1sint[i][j]);
				}
			}
			System.out.println(name[0][j] + "의 점수 합은 " + sum +"\n" + 
					name[0][j] + "의 점수 평균은 " + avg + "\n" + 
					name[0][j] + "의 최고점수는 " + max + "\n" + 
					name[0][j] + "의 최소점수는 " + min);
			System.out.println();

		}
		
		
	}

}


/*
Name Korean English Math
jeong 70 80 100
Pyo 60 70 86
Choi 54 100 82
Mike 87 96 79

 */