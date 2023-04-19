package test05;

public class test05a extends Doing {

	public test05a(String name, double version) {
		super(name, version);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		test05a nm = new test05a("부모", 1.2);
		nm.getName();
		test05a nm2 = new test05a("엄마", 1.2);
		nm2.getName();
		

	}

	@Override
	public void getName() {
		super.getName();
	
	}

}
