package A10;
import java.util.Scanner;
public class A_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int money100 = 0;
		int money50 = 0;
		int money10 = 0; 
		System.out.println("#Menu");
		System.out.println("1. Coke - 340");
		System.out.println("2. Orange Juice - 500");
		System.out.println("3. Milk - 650");
		System.out.println("4. Water - 290");
		System.out.println("5. Coffee - 170");
		System.out.println("6. Exit");
		System.out.println("--->");
		int sum = 0;
		while(true) {
			int a = scanner.nextInt();
			if(a==1) {
				sum = sum + 340;
			} else if(a==2) {
				sum = sum + 500;
			} else if(a==3) {
				sum = sum + 650;
			} else if(a==4) {
				sum = sum + 290;
			} else if(a==5) {
				sum = sum + 170;
			} else if(a==6) {
				break;
			}			
		}
		System.out.println("총가격 = "+ sum);
		System.out.println("지불금액을 입력해주세요:");
		int inputmoney = scanner.nextInt();
		int change = inputmoney - sum;
		System.out.println("The change is "+ change + "(1000 x " + change/1000 + ", 500 x "+ (change%1000)/500
				+ ", 100 x "+ (change%500)/100 + ", 50 x " + (change%100)/50 + ", 10 x " + (change%50)/10 +")"  );
	}

}

