package Example04;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class example04a {

	public static void main(String[] args) {
		Calendar k05_calendar = Calendar.getInstance();
		SimpleDateFormat k05_dt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		SimpleDateFormat k05_dtmd = new SimpleDateFormat("MM월dd일");
		String k05_plus14day = k05_dtmd.format(k05_calendar.getTime());
		k05_calendar.add(Calendar.DATE, 14);
		
		
		DecimalFormat k05_df = new DecimalFormat("###,###,###,###");
		String k05_itemname1 = "설레임쿠키앤크림(아이스크림)"; // 35칸출력
		String k05_itemcode1 = "1031615"; //7칸출력
		int k05_price1 = 14400;
		int k05_amount1 = 2;
		
		String k05_itemname2 = "슬라이드식명찰(가로형타입)"; // 29칸출력
		String k05_itemcode2 = "11008152"; // 8칸출력
		int k05_price2 = 900;
		int k05_amount2 = 5;
		
		String k05_itemname3 = "매직흡착 인테리어후크(알루미늄타입)"; //35칸출력
		String k05_itemcode3 = "1020800"; //7칸출력
		int k05_price3 = 6000;
		int k05_amount3 = 7;
		
		int k05_pricetotal = (k05_price1 * k05_amount1) + (k05_price2 * k05_amount2) + (k05_price3 * k05_amount3);
		double k05_taxrate = 0.1f;
		double k05_beforepricetotald = (int)(k05_pricetotal / (1+ k05_taxrate));
		int k05_beforepricetotal = (int)k05_beforepricetotald;
		int k05_tax = k05_pricetotal - k05_beforepricetotal;
		
		 
		System.out.printf("            \"국민가게, 다이소\"\n");
		System.out.printf("(주)아성다이소_분당서현점\n");
		System.out.printf("전화:031-702-6016\n");
		System.out.printf("본사:서울 강남구 남부순환로 2748 (도곡동)\n");
		System.out.printf("대표:박정부,신호섭 213-81-52063\n");
		System.out.printf("매장:경기도 성남시 분당구\n");
		System.out.printf("분당로53번길 11 (서현동)\n");
		System.out.printf("=========================================\n"); // 41칸
		System.out.printf("      소비자중심경영(CCM) 인증기업\n");
		System.out.printf("    ISO 9001 품질경영시스템 인증기업\n");
		System.out.printf("=========================================\n"); // 41칸
		System.out.printf("      교환/환불 14일(" + k05_dtmd.format(k05_calendar.getTime()) + ")이내,\n");
		System.out.printf("     (전자)영수증, 결제카드 지참 후\n");
		System.out.printf("           구입매장에서 가능\n");
		System.out.printf("   포장/가격 택 훼손시 교환/환불 불가\n");
		System.out.printf("      체크카드 취소 시 최대 7일 소요\n");
		System.out.printf("=========================================\n"); // 41칸
		k05_calendar.add(Calendar.DATE, -14);
		System.out.printf("%-13s%28s\n","[POS 1058231]", k05_dt.format(k05_calendar.getTime()));
		System.out.printf("=========================================\n"); // 41칸
		System.out.printf("%-11.11s %7.7s%3.3s%9.9s\n", k05_itemname1, k05_df.format(k05_price1), k05_df.format(k05_amount1), k05_df.format(k05_price1 * k05_amount1));
		System.out.printf("[%s]\n", k05_itemcode1);
		System.out.printf("%-11.11s %7.7s%3.3s%9.9s\n", k05_itemname2, k05_df.format(k05_price2), k05_df.format(k05_amount2), k05_df.format(k05_price2 * k05_amount2));
		System.out.printf("[%s]\n", k05_itemcode2);
		System.out.printf("%-11.11s %7.7s%3.3s%9.9s\n", k05_itemname3, k05_df.format(k05_price3), k05_df.format(k05_amount3), k05_df.format(k05_price3 * k05_amount3));
		System.out.printf("[%s]\n", k05_itemcode3);
		System.out.printf("             과세합계%20.20s\n", k05_df.format(k05_beforepricetotal));
		System.out.printf("               부가세%20.20s\n", k05_df.format(k05_tax));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("판매합계%33.33s\n", k05_df.format(k05_pricetotal));
		System.out.printf("=========================================\n"); // 41칸
		System.out.printf("신용카드                        %9.9s\n", k05_df.format(k05_pricetotal));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("우리카드                 538720**********\n");
		System.out.printf("승인번호 77982843(0)    승인금액%9.9s\n", k05_df.format(k05_pricetotal));
		System.out.printf("=========================================\n"); // 41칸
		System.out.printf("      %s 분당서현점\n", k05_dt.format(k05_calendar.getTime()));
		System.out.printf("상품 및 기타 문의 : 1522-4400\n");
		System.out.printf("멤버십 및 샵다이소 관련 문의 : 1599-2211\n");
		System.out.printf("        lll llll ll l lllll ll ll        \n");
		System.out.printf("        lll llll ll l lllll ll ll        \n");
		System.out.printf("        lll llll ll l lllll ll ll        \n");
		System.out.printf("            2112820610158231\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("◈ 다이소멤버십앱or홈페이지에 접속하셔서\n");
		System.out.printf(" 회원가입 후 다양한 혜택을 누려보세요!◈");
		
		
	
	
	}

}
