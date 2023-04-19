package Test1;

import java.util.Scanner;

public class test1b {
	public static String NAME;
	public static int KORGRADE;
	public static int ENGGRADE;
	public static int MATHGRADE;

	public void nameInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input Name : ");
		this.NAME = scanner.nextLine();
		this.KORGRADE = 0;
		this.ENGGRADE = 0;
		this.MATHGRADE = 0;
	}

	public void gradeInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input Name : ");
		this.NAME = scanner.nextLine();
		System.out.println("Input KorGrade : ");
		this.KORGRADE = scanner.nextInt();
		System.out.println("Input ENGGrade : ");
		this.ENGGRADE = scanner.nextInt();
		System.out.println("Input MathGrade : ");
		this.MATHGRADE = scanner.nextInt();
	}

	public static String getNAME() {
		return NAME;
	}

	public static void setNAME(String nAME) {
		NAME = nAME;
	}

	public static int getKORGRADE() {
		return KORGRADE;
	}

	public static void setKORGRADE(int kORGRADE) {
		KORGRADE = kORGRADE;
	}

	public static int getENGGRADE() {
		return ENGGRADE;
	}

	public static void setENGGRADE(int eNGGRADE) {
		ENGGRADE = eNGGRADE;
	}

	public static int getMATHGRADE() {
		return MATHGRADE;
	}

	public static void setMATHGRADE(int mATHGRADE) {
		MATHGRADE = mATHGRADE;
	}


	public void showInformation() {
		System.out.println("Name is : " + NAME);
		System.out.println("KorGrade = " + KORGRADE);
		System.out.println("EngGrade = " + ENGGRADE);
		System.out.println("MathGrade = " + MATHGRADE);

	}
}