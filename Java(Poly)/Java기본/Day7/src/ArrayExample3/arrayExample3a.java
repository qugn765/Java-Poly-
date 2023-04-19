package ArrayExample3;

public class arrayExample3a {

	public static void main(String[] args) {
		int[][] numbers = new int[3][5];
		int cnt = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				numbers[i][j] = cnt;
				cnt++;
				System.out.print(numbers[i][j] + " \t");
			} 
			System.out.println();
		}
		
		
		int[][] numbers2 = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
		for (int i = 0; i < numbers2.length; i++) {
			for (int j = 0; j < numbers2[i].length; j++) {
				System.out.print(numbers2[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
