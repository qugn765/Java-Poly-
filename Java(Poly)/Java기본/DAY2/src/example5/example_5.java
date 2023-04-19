package example5;
import java.util.Scanner;
public class example_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int paidMoney = scanner.nextInt();
		int change = scanner.nextInt();
		int charge = paidMoney - change;
		System.out.println(charge);
		
		int money10000 = ((paidMoney - change)/10000);
		int money5000 = (((paidMoney - change)%10000)/5000);
		int money1000 = (((paidMoney - change))%5000/1000);
		int money500 = (((paidMoney - change)%1000)/500);
		int money100 = (((paidMoney - change)%500)/100);
		int money50 = (((paidMoney - change)%100)/50);
		int money10 = (((paidMoney - change)%50)/10);
		
		
		
		System.out.println("10000 - " + money10000);
		System.out.println("5000 - " + money5000);
		System.out.println("1000 - " + money1000);
		System.out.println("500 - " + money500);
		System.out.println("100 - " + money100);
		System.out.println("50 - " + money50);
		System.out.println("10 - " + money10);

		
	}

}
