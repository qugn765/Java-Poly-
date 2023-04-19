package P13;
import java.util.Scanner;
public class P_13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int sum = 0;
		int x = 1;
		while(x<N) {
			sum = sum + x;
			x = x + M;	
		}
		System.out.println(sum);
		System.out.println(" ");
/*		
		sum = 0;
		for(int i = 1; i < M; i+M) {
			
		}
*/
	}

}
