package Example02;

import java.text.DecimalFormat;

public class example02a {

	public static void main(String[] args) {
		DecimalFormat k05_df = new DecimalFormat("###,###,###,###"); // 데이터 형식 선언
		String[] k05_OneRec = { 
				"1    해피홈 SAFE365      8,000  9     16,000",
				"2    (G)LH원형유리       6,900  1      6,900",
				"3    상투과자E           5,980  1      5,980",
				"4    더블링 나일론       3,300  1      3,300",
				"5    해피홈 SAFE 핸      5,500  2     11,000",
				"6    농심 신라면120      3,380  1      3,380",
				"7*   (대)국내산삼겹      6,610  1      6,610",
				"8    오뚜기 진비빔       2,750  1      2,750",
				"9*   GAP 죽장사과 4     10,800  1     10,800",
				"10   순 유기농 바나     49,800  1     49,800",
				"11   피코크 탄두리       2,480  1      2,480",
				"12   (달콤)순살닭강    102,480  1    102,480",
				"13   DZ주니어양말3       4,980  1      4,980",
				"14   DZ주니어양말3       1,500  1      1,500",
				"15   프리미엄생연어      7,130  1      7,130",
				"16   피코크 들깨미       3,980  1      3,980",
				"17*  남양 맛있는우       4,480  1      4,480",
				"18   녹차원흑당시럽      4,980  1      4,980",
				"19   진라면소컵(매)      3,210  1      3,210",
				"20   케라시스 앰플       6,950  1      6,950",
				"21   푸르밀 미숫가       2,980  3      5,960",
				"22   자일로스갈색설      1,990  1      1,990",
				"23   CJ 비비고칩 20      1,980  1      1,980",
				"24   피코크 들깨미       3,980  1      3,980",
				"25   흑원당 말차 밀      4,480  1      4,260",
				"26*  1+ 등급란 10개      3,480  2      6,960",
				"27   동원양반볶음김      7,980  1      7,980",
				"28*  양파(1.8kg/망)      2,780  2      5,560",
				"29   소불고기(신세      10,000  1     10,000",
				"30   엠엔엔즈피넛15      2,680  2      5,360"};
		//이마트 영수증에서 출력된 물품 단가 수량가격을 가지고옴

		int[] k05_pricearr = new int[k05_OneRec.length]; // 단가를 저장할 배열을 물품의개수만큼 배열추가
		int[] k05_amountarr = new int[k05_OneRec.length];// 수량을 저장할 배열을 물품의개수만큼 배열추가
		int[] k05_totalpricearr = new int[k05_OneRec.length];// 총 가격을 저장할 배열을 물품의개수만큼 배열추가


		for (int k05_i = 0; k05_i < k05_OneRec.length; k05_i++) {
			byte[] k05_byte = k05_OneRec[k05_i].getBytes(); // 바이트의 배열로 바꾸기
			String k05_name = new String(k05_byte,0,19); // 물품이름인 0~19바이트로 자르기
			String k05_price = new String(k05_byte,19,11); // 단가인 19~30바이트로 자르기
			String k05_amount = new String(k05_byte,30,3); // 수량인 30~33바이트로 자르기
			String k05_totalprice = new String(k05_byte,33,11); // 총가격인 33~44바이트로자르기
			String k05_price1 = k05_price.replace(" ", ""); // 공백들을 모두제거
			k05_price1 = k05_price1.replace(",", ""); //,를 모두제거
			k05_pricearr[k05_i] = Integer.parseInt(k05_price1); // String형인 단가를 정수형으로 변환
	
			
			String k05_amount1 = k05_amount.replace(" ", ""); //공백들을 모두제거
			k05_amount1 = k05_amount1.replace(",", ""); //,를 모두제거
			k05_amountarr[k05_i] = Integer.parseInt(k05_amount1); // String형인 단가를 정수형으로 변환
			
			String k05_totalprice1 = k05_totalprice.replace(" ", ""); //공백들을 모두제거
			k05_totalprice1 = k05_totalprice1.replace(",", ""); //,를 모두제거
			k05_totalpricearr[k05_i] = Integer.parseInt(k05_totalprice1); // String형인 단가를 정수형으로 변환
			
			if(k05_totalpricearr[k05_i]!=k05_pricearr[k05_i] * k05_amountarr[k05_i]) {
				// 단가 * 수량 = 총가격이 맞지않다면 총가격이 잘못된것이므로 수정
				k05_totalpricearr[k05_i] = k05_pricearr[k05_i] * k05_amountarr[k05_i]; // 새로운 총가격계산
				String k05_outtotal = String.valueOf(k05_df.format(k05_totalpricearr[k05_i])); //새로운 총가격을 ###,###포맷으로
				k05_outtotal = k05_HanBlankForeword(k05_outtotal, 11); // 총가격에 공백을 추가해서 저장
				String k05_sumAll =  k05_name + k05_price + k05_amount + k05_outtotal;
				//새로 수정된것을 이름 + 단가 + 수량 + 총가격 으로 원래처럼 저장
				System.out.printf("************************************\n");
				System.out.printf("오류[%s]\n",k05_OneRec[k05_i]); // 수정전 원래꺼 출력
				System.out.printf("수정[%s]\n",k05_sumAll); // 수정후를 출력
				System.out.printf("************************************\n");
				k05_OneRec[k05_i] = k05_sumAll; 
			}
		}
	}

	public static String k05_HanBlankForeword(String k05_a, int k05_b) {
		int k05_blankcnt = k05_b - k05_a.getBytes().length;
		String k05_output = k05_a;
		for (int k05_i = 0; k05_i < k05_blankcnt; k05_i++) {
			k05_output = " " + k05_output; // 공백을 앞에 추가해서 저장
		}

		return k05_output;
	}

}
