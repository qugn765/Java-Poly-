package Example02;

public class taxCalc {
	
	public static int k05_taxcal(int k05_val, int k05_rate) {
		int k05_ret; // 세금을 계산하기위한 변수 선언
		
		if (((double)k05_val * (double)k05_rate / 100.0) == k05_val * k05_rate / 100){
			k05_ret = k05_val * k05_rate / 100; 
			// 세금계산을 할때 소숫점을 올림하기 위해서 위에 조건문의 식 2개가 같다면 올림할 것이없으므로 그대로 출력
		} else {
			k05_ret = k05_val * k05_rate / 100 + 1; 
			// 세금계산 할 때 소숫점을 올림하기위해서 위에조건문을 만족하지 않는다면 올림할 숫자가 있으므로 +1해서 올림처리
		}
		
		return k05_ret; // 세금 k05_ret return
	} // k05_ret이라는 세금을 return 하는 taxcal 함수 선언

	public static void main(String[] args) {
		int k05_val = 271; // 세전가격
		int k05_rate = 3; // 세금 3퍼센트
		
		int k05_tax = k05_taxcal(k05_val,k05_rate); // 세전가격과 세금율을 집어넣어서 세금계산
		
		System.out.printf("******************************\n");
		System.out.printf("*         단순 세금 계산         *\n");
		System.out.printf("     실제 세금계산: %f        \n", k05_val * k05_rate / 100.0); // 올림하기전 세금 출력
		System.out.printf(" 세전가격: %d 세금:%d 세포함가격:%d \n", k05_val, k05_tax, k05_val + k05_tax); // 세전가격, 올림한 세금, 세포함가격(소비자가격) 출력
		System.out.printf("******************************\n");
		
	}

}
