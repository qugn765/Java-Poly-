package Example05;

public class example05a {

	public static void main(String[] args) {
		int k05_Val; // int형 변수 Val선언
		for (int k05_i = 0; k05_i < 300; k05_i++) {
			k05_Val = 5 * k05_i; // Val에 5*i 저장 i는 0부터 299까지 반복
			if(k05_Val >= 0 && k05_Val < 10) System.out.printf("일 %d\n", k05_Val);
			else if(k05_Val >=10 && k05_Val < 100) System.out.printf("십 %d\n",k05_Val);
			else if(k05_Val >=100 && k05_Val < 300) System.out.printf("백 %d\n",k05_Val);
			else  System.out.printf("천 %d\n",k05_Val);
		} // 0~9까지는 일 + Val 10~99까지는 십 + Val 100~299까지는 백 + Val 그이외는 천 + Val출력하는 반복문

	}

}
