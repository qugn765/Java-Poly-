package test2;

public class test2 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0 ; j < (2 * i) + 1; j ++) {
				if (j % 2 == 0) {
					System.out.print("0");
				} else {
					System.out.print("1");
				}
			}
			System.out.println();

		}

	}
}