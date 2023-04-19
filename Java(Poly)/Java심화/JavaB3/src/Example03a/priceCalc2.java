package Example03a;

public class priceCalc2 {

	public static int k05_netPrice(int k05_price, double k05_rate) {
		return (int)(k05_price/(1+k05_rate));  // 세전가격 계산
	} // 세전가격을 return하는 netPrice라는 함수 선언 
	
	public static void main(String[] args) {
		int k05_price = 1234; // 가격의 초기값 1234 선언
		double k05_taxrate = 0.1; // 세금 0.1 선언
		
		int k05_netprice = k05_netPrice(k05_price, k05_taxrate);  // 세전가격 계산하는 함수를 이용해 세전가격계산
		int k05_tax = k05_price - k05_netprice; // 가격 - 세전가격을 통해 세금 출력
		
		System.out.printf("*********************************************\n");
		System.out.printf("*          소비자가, 세전가격, 세금 계산            *\n");
		System.out.printf("  소비자가격: %d원, 세전가격: %d원, 세금: %d원\n", k05_price, k05_netprice, k05_tax); // 소비자가격, 세전가격, 세금을 순서대로 출력
		System.out.printf("*********************************************\n");
		
	}

}
