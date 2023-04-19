package Example12;

import java.text.DecimalFormat;

public class example12a {

	public static void main(String[] args) {
		String k05_item = "사과"; // 문자열 "사과" 선언
		int k05_unitprice = 5000; // unitprice 5000선언
		int k05_num = 500; // 수량에 해당하는 num 500선언
		int k05_total = 0; // 총합가격 0으로 선언
		
		DecimalFormat k05_df = new DecimalFormat("###,###,###,###"); // 3개씩 끊어서 ,를 찍는 DecimalFormat k05_df로 선언
		
		System.out.printf("=======================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n", "품목", "단가", "수량", "합계"); 
		// %x.ys - 최소길이 x 최대길이 y만큼의 String을 쓴다는 의미이므로 간격을 맞추기위해 숫자조정 품목 단가 수량 합계 출력
		System.out.printf("=======================================================\n");
		
		
		System.out.printf("%20.20s%10.10s%8.8s%12.12s\n", 
				k05_item, k05_df.format(k05_unitprice), k05_df.format(k05_num), k05_df.format(k05_unitprice * k05_num));
		// %x.ys - 최소길이 x 최대길이 y만큼의 String을 쓴다는 의미이므로 간격을 맞추기위해 숫자조정 품목, 단가, 수량, 합계 순서로 출력
		System.out.printf("=======================================================\n");
		

	}

}
