package example6;
import java.util.Scanner;

public class example_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int base10 = scanner.nextInt();	
		int digit4 = base10/27;
		int digit3 = (base10%27)/9;
		int digit2 = (base10%9)/3;
		int digit1 = base10%3;
		
		/* digit4 = base10/27;
		 * digit3 = base10 -(digit4*27)
		 * digit3 = digit3/9;
		 * digit2 = base10 -(digit4*27) -(digit3*9);
		 * digit2 = digit2/3;
		 * digit1 = base10%3;
		 * 
		 */
		System.out.println(digit4);
		System.out.println(digit3);
		System.out.println(digit2);
		System.out.println(digit1);
		
		
	}

}
