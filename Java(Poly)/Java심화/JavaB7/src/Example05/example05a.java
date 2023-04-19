package Example05;

public class example05a {

	public static void main(String[] args) {
		int [] k05_iArray = {1,3,5,7,9};
		for (int k05_i = 0; k05_i < 5; k05_i++) {
			System.out.printf("iArray[%d] = %d\n", k05_i, k05_iArray[k05_i]);
		}
		
		k05_iArray[5] = 11;

	}

}
