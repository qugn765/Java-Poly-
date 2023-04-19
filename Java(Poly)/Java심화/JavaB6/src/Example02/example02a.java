package Example02;

public class example02a {

	static int k05_iStatic;
	
	public static void k05_add(int k05_i) {
		k05_iStatic++;
		k05_i++;
		System.out.printf("add메소드에서->iStatic=[%d]\n", k05_iStatic);
		System.out.printf("add메소드에서->i=[%d]\n",k05_i);
	} // add라는 1씩 추가해주는 메소드 선언 
	
	public static int k05_add2(int k05_i) {
		k05_iStatic++;
		k05_i++;
		System.out.printf("add메소드에서->iStatic=[%d]\n",k05_iStatic);
		System.out.printf("add메소드에서->i=[%d]\n",k05_i);
		return k05_i;
	} //add2라는 1씩 추가해주는 메소드 선언
	
	public static void main(String[] args) {
		
		int k05_iMain = 1;
		k05_iStatic = 1;
		System.out.printf("***********************************\n");
		System.out.printf("메소드호출전 메인에서->iStatic=[%d]\n",k05_iStatic);
		System.out.printf("메소드호출전 메인에서->iMain[%d]\n",k05_iMain);
		System.out.printf("***********************************\n");
		//아무런 메소드를 호출하지 않은상태에서 지정한 변수 출력 1,1출력
		
		k05_add(k05_iMain); //add메소드를 호출  2,2출력
		System.out.printf("***********************************\n");
		System.out.printf("메소드 add호출후 메인에서->iStatic=[%d]\n",k05_iStatic);
		System.out.printf("메소드 add호출후 메인에서->iMain[%d]\n",k05_iMain);
		System.out.printf("***********************************\n");
		//add 메소드를 호출한후 출력 2,1출력된다
		//public int로 선언한k05_iStatic은 1추가되지만 main에서 선언한iMain은 추가되지않음
		
	
		k05_iMain = k05_add2(k05_iMain); //add2 메소드 호출 3,2출력하고 iMain값을 +1해서 리턴해줌
		System.out.printf("***********************************\n");
		System.out.printf("메소드 add2호출후 메인에서->iStatic=[%d]\n",k05_iStatic);
		System.out.printf("메소드 add2호출후 메인에서->iMain[%d]\n",k05_iMain);
		System.out.printf("***********************************\n");
		//add2 메소드를 호출후 출력 3,2출력 add2메소드는 iMain값을 리턴해주기때문에 3,2출력
		
	}

}
