package Example03;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class example03a {

	public static String[] k05_itemname,k05_taxitem;
	public static int[] k05_itemprice, k05_amount;
	public static boolean[] k05_taxfree;
	public static String k05_a;
	public static int k05_ytaxitembeforeprice, k05_tax, k05_ytaxitemprice,k05_ntaxitemprice;
	static Calendar k05_calendar = Calendar.getInstance(); // 현재날짜 받아오기
	static Calendar k05_calendar2 = Calendar.getInstance(); // 현재날짜 받아오기
	static SimpleDateFormat k05_dt = new SimpleDateFormat("YYYY-MM-dd HH:mm"); // 날짜의 데이터형식 선언
	static SimpleDateFormat k05_dt2 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss"); // 날짜의 데이터형식 선언
	static SimpleDateFormat k05_dt3 = new SimpleDateFormat("YYYYMMdd"); // 날짜의 데이터형식 선언
	static DecimalFormat k05_df = new DecimalFormat("###,###,###,###"); // 데이터 형식 선언
	
	
	public static void main(String[] args) {
		int k05_itemcount = 31;
		k05_item(); // 물품 이름가격 개수 면세여부 선언
		k05_TitlePrint(); // 위에 출력
		k05_TimeStemp(); // 시간출력
		k05_HeaderPrint(); // 상품명 단가 수량 금액 제목출력
		k05_ItemCal(); // 상품들의 이름 단가 수량 계산
		for(int k05_i = 0; k05_i < k05_itemcount; k05_i++) {
			k05_ItemPrint(k05_i);
		}
		k05_TotalPrint(); // 합계등 밑에줄 출력		
		
	}
	
	

	public static void k05_item() {
		String[] k05_a= { "해피홈 SAFE365 핸드크림", "(G)LH원형유리화병 10개입", "상투과자E", "더블링 나일론 깡 롤", "해피홈 SAFE 핸드워시", "농심 신라면120g*5",
				"(대)국내산삼겹살찌개", "오뚜기 진비빔면 156g", "GAP 죽장사과 4-6입/", "순 유기농 바나나(봉)", "피코크 탄두리 닭가슴", "(달콤)순살닭강정(g)",
				"DZ주니어양말3족C_BK", "DZ주니어양말3족C_WH", "프리미엄생연어초밥", "피코크 들깨미역국500", "남양 맛있는우유GT 저지방우유", "녹차원흑당시럽10입",
				"진라면소컵(매)65g*6", "케라시스 앰플 트리트", "푸르밀 미숫가루우유", "자일로스갈색설탕500g", "CJ 비비고칩 20G", "피코크 들깨미역국500",
				"흑원당 말차 밀크티", "1+ 등급란 10개입 특", "동원양반볶음김치기획", "양파(1.8kg/망)", "소불고기(신세계푸드)", "엠엔엔즈피넛150g","물"}; // 물품이름배열 선언
		k05_itemname = k05_a;
		int[] k05_b= { 10020000, 6900, 5980, 3300, 5500, 3380, 6610, 2750, 10800, 49800, 2480, 102480, 4980, 1204980, 7130, 3980,
				4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 3480, 7980, 2780, 10000, 2680,1000 }; // 물품들의 가격 배열 선언
		k05_itemprice = k05_b;
		int[] k05_c= { 9, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 2, 1, 2, 6}; // 물품들의 개수 배열 선언
		k05_amount = k05_c;
		boolean[] k05_d= {false, false, false, false, false, false ,true, false, true, false, false, false, false, false, false, false, true, 
				false, false, false, false, false, false, false, false, true, false, true, false, false, false}; // 물품들이 면세상품인지 아닌지 판별하는 배열선언
		k05_taxfree = k05_d;
	}
	
	
	public static void k05_TitlePrint() {
		System.out.printf("              이마트 죽전점 (031)888-1234\n");
		System.out.printf("     emart    206-86-50913 강희석        \n");
		System.out.printf("              용인 수지구 포은대로 552   \n\n");
		System.out.printf("영수증 미지참시 교환/환불 불가\n");
		System.out.printf("정상상품에 한함, 30일 이내(신선 7일)\n");
		System.out.printf("※일부 브랜드매장 제외(매장 고지물참조)\n");
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n\n");
	}

	
	public static void k05_TimeStemp(){
		System.out.printf("[구 매]%s%19s",k05_dt.format(k05_calendar.getTime()), "POS:0011-9861\n");
	}

	
	public static void k05_HeaderPrint() {
		System.out.printf("-----------------------------------------\n");
		System.out.printf("  상품명             단 가   수량   금 액\n");
		System.out.printf("-----------------------------------------\n");
	}
	
	public static void k05_ItemPrint(int k05_i) {
		System.out.printf("%s %s%11.11s%3.3s%11.11s\n",k05_taxitem[k05_i], k05_itemname[k05_i], k05_df.format(k05_itemprice[k05_i]), 
				k05_df.format(k05_amount[k05_i]),k05_df.format((k05_itemprice[k05_i] * k05_amount[k05_i])));
		if ((k05_i + 1) % 5 == 0) {
			System.out.printf("-----------------------------------------\n"); // 상품을 5개 찍을떄마다 ---줄선언
		}
	}
	
	
	public static void k05_ItemCal() {
		k05_taxitem = new String[k05_taxfree.length]; // 물품이름과 같은크기의 배열을 만들어 거기에 "      " 를 추가한 이름 선언
		for(int k05_i = 0; k05_i < k05_itemname.length; k05_i++) {
			if (k05_taxfree[k05_i] == false) {
				k05_taxitem[k05_i] = " ";  //비면세상품들 이름 앞에 공백을 추가하기위한 배열 선언
				k05_ytaxitemprice = k05_ytaxitemprice + (k05_itemprice[k05_i] * k05_amount[k05_i]); //비면세상품들의 가격을 갯수만큼 곱해서 비면세상품 총가격에 추가
			} else {
				k05_taxitem[k05_i] = "*"; //비면세상품들 이름 앞에 *을 추가하기위한 배열 선언
				k05_ntaxitemprice = k05_ntaxitemprice + (k05_itemprice[k05_i] * k05_amount[k05_i]); //면세상품들의 가격을 갯수만큼 곱해서 면세상품 총가격에 추가
			}
		}

		for (int k05_i = 0; k05_i < k05_itemname.length; k05_i++) {
			k05_itemname[k05_i] = k05_itemname[k05_i] + "                                     "; // 이름이 짧은 상품들을 짤랐을때 뒤에글자들이 당겨져오는걸 방지하기위해 공백추가
			int k05_cntbyte = 0; // 한글자한글자 바이트수를 확인하기위한 변수선언
			for(int k05_j = 0; k05_j <k05_itemname[k05_i].length(); k05_j++) { 
				String k05_a = String.valueOf(k05_itemname[k05_i].charAt(k05_j)); // 하나의 문자열을 하나씩 호출
				k05_cntbyte = k05_cntbyte + k05_a.getBytes().length; // 하나씩 호출된 문자들의 바이트를 더하기
				if (k05_cntbyte == 13) {
					String k05_b = String.valueOf(k05_itemname[k05_i].charAt(k05_j + 1));// 바이트의 총개수를 14로 맞추기위해서 한글은 2byte이므로 13일떄 14일때 경우를 나눔
					if(k05_b.getBytes().length == 1) {
						k05_itemname[k05_i] = k05_itemname[k05_i].substring(0,k05_j + 2);// 13으로끝났을때 문자열을 자르고 바이트를 14로 맞추기위해 " "추가
					} else {
						k05_itemname[k05_i] = k05_itemname[k05_i].substring(0,k05_j + 1) + " ";
					}
				} else if (k05_cntbyte == 14) {
					k05_itemname[k05_i] = k05_itemname[k05_i].substring(0,k05_j + 1); // 14바이트로끝났을떄는 거기까지의 글자만잘라서 새로저장						 
				}
			} 
		}

		double k05_taxrate = 0.10; // 세율 10%선언 정확한계산을위해 double선언
		double k05_ytaxitembeforepricef = (k05_ytaxitemprice / (1 + k05_taxrate)); //세전가격 계산 
		k05_ytaxitembeforeprice = (int)k05_ytaxitembeforepricef;
		k05_tax = k05_ytaxitemprice - k05_ytaxitembeforeprice; //총가격에서 세전가격을뺀 세금금액 계산
	}
	
	public static void k05_TotalPrint() {
		String k05_a = "일시불 / " + k05_df.format(k05_ytaxitemprice + k05_ntaxitemprice);
		System.out.printf("\n");
		System.out.printf("               총 품목 수량    %10.10s\n", k05_df.format(k05_itemname.length));
		System.out.printf("            (*)면 세  물 품    %10.10s\n", k05_df.format(k05_ntaxitemprice));
		System.out.printf("               과 세  물 품    %10.10s\n", k05_df.format(k05_ytaxitembeforeprice));
		System.out.printf("               부   가   세    %10.10s\n", k05_df.format(k05_tax));
		System.out.printf("               합        계    %10.10s\n", k05_df.format(k05_ytaxitemprice + k05_ntaxitemprice));
		System.out.printf("결 제 대 상 금 액              %10.10s\n", k05_df.format(k05_ytaxitemprice + k05_ntaxitemprice));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("0012 KEB 하나       541707**0484/35860658\n");
		System.out.printf("카드결제(IC)       %19.19s\n", k05_a);
		System.out.printf("-----------------------------------------\n");
		System.out.printf("           [신세계포인트 적립]           \n");
		System.out.printf("홍*두 고객님의 포인트 현황입니다.\n");
		int k05_beforepoint = 5473;  // 누적 전 포인트
		int k05_point = 164; // 오늘 발생한 포인트
		System.out.printf("금회발생포인트        9350**9995   %6.6s\n",k05_point);
		System.out.printf("누계(가용)포인트       %8.8s(%8.8s)\n",k05_df.format(k05_beforepoint + k05_point), k05_df.format(k05_beforepoint));
		System.out.printf("*신세계포인트 유효기간은 2년입니다.\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("   구매금액기준 무료주차시간 자동부여   \n");
		String k05_carnumber = "34저9853"; //차량번호
		String k05_blankcarnumber = k05_carnumber.substring(0,3); // 앞의 3자리만출력
		for (int k05_i = 0; k05_i < k05_carnumber.length(); k05_i++) {
			k05_blankcarnumber = k05_blankcarnumber + "*" ;		// 앞의 3자리를 제외한 뒤에차량번호는 *로 표시
		}
		System.out.printf("차량번호 :                      %8.8s\n",k05_blankcarnumber);
		k05_calendar.add(Calendar.MINUTE, -90); // 입차시간을 위한 90분전으로
		System.out.printf("입차시간 :           %20.20s\n",k05_dt2.format(k05_calendar.getTime()));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("캐셔:084599 양00                     1150\n");
		System.out.printf("  ll llll llllll llll ll l lllll ll ll   \n");
		System.out.printf("  ll llll llllll llll ll l lllll ll ll   \n");
		System.out.printf("  ll llll llllll llll ll l lllll ll ll   \n");
		System.out.printf("%14.14s/00119861/00164980/31",k05_dt3.format(k05_calendar2.getTime()));
	}


}
