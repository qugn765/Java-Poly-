package test04;
//override implements ______ 하고 오류부분 눌러서 add추가해서 가져오기
public class test04 implements Settings{

	public static void main(String[] args) {
		test04 nm = new test04();
		nm.getName();
		nm.getVersion();
		
		
	}

	@Override 
	public void getName() {
		System.out.println("My apllication name is ig");
	}

	@Override
	public void getValues() {
		System.out.println("My apllication value is");
	}

	@Override
	public void getVersion() {
	}

}
