package test05;

public class Doing {
	String name = "";
	double version = 0.0;
	public Doing(String name, double version) {                 //클래서 이름과 같은함수 = 생성자  void 이런거 하나도 안붙임
		this.name = name;
		this.version = version;
		
	}
	public void getName() {
		System.out.println(name);
	}
	public void getVersion() {
		System.out.println(version);
	}
}


