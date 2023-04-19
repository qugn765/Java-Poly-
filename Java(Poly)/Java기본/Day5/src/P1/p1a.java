package P1;

import java.util.Scanner;

public class p1a {
	public static final String FatherName = "Kate";
	public static final String MotherName = "Mike";
	public static final String SonName = "John";
	public static final String DaughterName = "April";
	public static final int FatherIndex = 1;
	public static final int MatherIndex = 2;
	public static final int SonIndex = 3;
	public static final int DaughterIndex = 4;
	
	public static void main(String[] args) {
		p1a fm = new p1a();
		while (true) {
			int num = fm.showMenu();
			String name = fm.addition(num);
			System.out.println(name);

		}

	}
	
	
	
	public int showMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Father");
		System.out.println("2. Mother");
		System.out.println("3. Son");
		System.out.println("4. Daughter");
		System.out.println("Select Number -> ");
		
		return scanner.nextInt();
	}
	
	
	public String addition(int familyMember) {
		String name = "";
		if(familyMember==FatherIndex) {
			name = FatherName;
		} else if(familyMember==MatherIndex) {
			name = MotherName;
		} else if(familyMember==SonIndex) {
			name = SonName;
		} else if(familyMember==DaughterIndex) {
			name = DaughterName;
		} else {
			System.out.println("잘못입력하였습니다");
		}
		return name;
	}

}