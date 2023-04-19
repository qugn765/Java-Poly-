package Ex5;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		multiplicationTable(3,6);
		
		operationAdd(2,5);
		
		operationMinus(7,4);
		
		int res = operationMinus(7,4);
		System.out.println(res);
		
		operationMinus2(4,7);
		
		int res2 = operationMul(6,5);
		System.out.println(res2);
		
		while(true) {
			int num = showMenu();
			if (num ==1) {
				System.out.println("Coke");
			} else if (num ==2) {
				System.out.println("Juice");
			}
			else if (num ==3) {
				System.out.println("Bye");
				break;
			}
		}
		
	}
	public static void multiplicationTable(int n, int m) {
		for (int i = 2; i < m; i++) {
			System.out.println(n + " x " + i + " = "+ (n * i));
		}
	}
	
	
	public static void operationAdd(int n, int m) {
		int result = n + m;
		System.out.println(result);
	}
	
	
	public static int operationMinus(int n, int m) {
		int result1 = n - m;
		
		return result1;
	}
	
	
	public static void operationMinus2(int n, int m) {
		int result2 = 0;
		if(n>=m) {
			result2 = n - m;
			System.out.println(result2);
		} else {
			result2 = m - n;
			System.out.println(result2);
		}
	}
	
	
	public static int operationMul(int n, int m) {
		return n * m;
	}
	
	
	public static int showMenu() {
		System.out.println("#Menu");
		System.out.println("1.Coke");
		System.out.println("2. Juice");
		System.out.println("3. Exit");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		return num;
		
	}

}
