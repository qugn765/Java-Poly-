package A02;
import java.util.Scanner;
public class A_02 {

	public static void main(String[] args) {
		System.out.println("2에서 9사이의 숫자를 입력하여주세요!");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int i=2 ;
		int j=2 ;
		if (1 < n && n<10) {
			n=1;
		} 
		else {
			n = 0;
		}
		switch(n) {
		case 0 : 
			System.out.println("숫자를 잘못입력하였습니다");
			break;
		case 1 :
			while(i<10) {
				while(j<10) {
					System.out.println( i + " * " + j + " = " + (i*j));
					j++;
				}
				j=2;
				i++;
			}
			break;
		}

	}
}