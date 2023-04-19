package P3;

import java.util.Scanner;

public class p3a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		p3a fm = new p3a();
		System.out.println("1. Father");
		System.out.println("2. Mother");
		System.out.println("3. Son");
		System.out.println("4. Daughter");
		System.out.println("Select Number -> ");
		fm.familyMembers();
		fm.familyMembers();
		fm.familyMembers();
		

	}
	
	public void familyMembers() {
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		switch(num) {
		case 1:
			System.out.println("James");
			break;
		case 2:
			System.out.println("Anna");
			break;
		case 3 :
			System.out.println("John");
			break;
		case 4 :
			System.out.println("Elise");
			break;
		default :
				System.out.println("잘못된 숫자입니다");
	}
	
		
	}

}