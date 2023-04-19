package A2;
import java.util.Scanner;
public class a2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int positive = 0; int negative = 0;
		int Even = 0; int Odd = 0;
		do {
			int input = scanner.nextInt();
			if(input > 0) {
				positive++;
				if(input%2==0) {
					Even++;
				} else {
					Odd++;
				}
			} else {
				negative++;
				if(input%2==0) {
					Even++;
				} else {
					Odd++;
				}
			} 
			System.out.println("P - " + positive  + ", N - " + negative + ", O - " + Odd + ", E - " + Even); 
		} while(true);

	}

}
