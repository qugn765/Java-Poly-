package Example04;

public class taxPrice {

	public static void main(String[] args) {
		String[] k05_item = {"맛동산", "웨하스", "롯데샌드", "오땅", "사브레"};  // String 배열 선언후 초기값 과자 종류 선언
		int[] k05_price = {1000, 2000, 3000, 2500, 1450};  // int 배열 선언후 초기값 가격 선언
		int[] k05_amount = {10, 2, 1, 3, 5};  //int 배열 선언후 초기값 갯수 선언
		double k05_taxrate = 0.1; // 세율선언
		int k05_totalsum = 0; // 총합 선언
		
		System.out.printf("***********************************\n");
		System.out.printf("         너가 지른 과자들               \n");
		System.out.printf("  항목\t단가\t수량\t합계\t\n");
		for(int k05_i = 0; k05_i < k05_item.length; k05_i++) {
			int k05_sum = k05_price[k05_i] * k05_amount[k05_i]; // 합계 = 각 과자의 가격 * 개수
			k05_totalsum += k05_sum; // 총합에 각자의 과자합계 가격을 더해주는것
			System.out.printf("  %s\t%d\t%d\t%d\n", k05_item[k05_i], k05_price[k05_i], k05_amount[k05_i],k05_sum);
		} // 총합 가격을 구하기 위해 각 과자의 가격 * 갯수를 모두 더하는 반복문
		System.out.printf("***********************************\n");
		System.out.printf("       지불 금액 : %d \n", k05_totalsum); // 총가격 출력
		
		int k05_totalnetprice = (int)(k05_totalsum / (1 + k05_taxrate)); // 총가격에서 세금(0.1)을 뺀 세전가격을 구하는 계산식
		System.out.printf("       과세 금액 : %d\n", k05_totalnetprice); // 세전가격 출력
		int k05_tax = k05_totalsum - k05_totalnetprice; // 총가격에서 세전가격을 뺀 세금 계산식
		System.out.printf("         세금 : %d\n",k05_tax); // 세금출력
	}

}
