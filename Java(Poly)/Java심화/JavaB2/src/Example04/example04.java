package Example04;

public class example04 {

	public static void main(String[] args) {
		System.out.println('\"');  // \"은 "을 출력하기 위한 Escape Character이므로 " 출력
		System.out.println("abc\t123\b456"); // \t는 탭의 기능을 하고 \b는 마지막 문자를 지우는 기호이므로 3이 지워져야한다.
		System.out.println('\n'); // \n은 개행기호로서 println에서한번 줄내림 \n에서 한번더 줄내림을하게된다
		System.out.println("\"Hello\""); // \"는 "를 출력하는 Escape Character이므로 "Hello"가 출력된다.
		System.out.println("c:\\"); // \\ 는 \한번을 출력하는 Escape Character이므로 c:\이 출력된다.

	}

}
