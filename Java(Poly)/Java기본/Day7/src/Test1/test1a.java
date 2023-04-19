package Test1;

public class test1a extends test1b {
	public static void main(String[] args) {
		test1a nm = new test1a();
		nm.nameInput();
		nm.gradeInput();
		nm.showInformation();
	}

	@Override
	public void showInformation() {
		super.showInformation();
		double sum = KORGRADE + ENGGRADE + MATHGRADE;
		System.out.println("Average : " + sum / 3);
	}
	
}
