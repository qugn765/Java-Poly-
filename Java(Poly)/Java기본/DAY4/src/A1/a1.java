package A1;
import java.util.Scanner;
public class a1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 2;
		double max = 0;
		double min = 0;
		double mean = 0;
		do {
			int input = scanner.nextInt();
			mean = (mean * (i-2) + input)/(i-1);
			max = Math.max(max, input);
			if (min==0) {
				min = input;
			}
			min = Math.min(min, input);
			System.out.println("Result : "+ (i-1) + " - Mean "+ mean + ", Max - "+ max + ", Min - " + min);
			i++;
		}while(true);
	}

}
