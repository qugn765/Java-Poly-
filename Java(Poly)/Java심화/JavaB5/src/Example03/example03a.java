package Example03;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class example03a {

	public static void main(String[] args) {
		Calendar k05_calendar = Calendar.getInstance();
		SimpleDateFormat k05_dt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		
		int k05_price = 321000;
		float k05_taxrate = 0.1f;
		float k05_beforepriced = (k05_price / (1 + k05_taxrate));
		int k05_beforeprice = (int)(k05_beforepriced);
		int k05_tax = k05_price - k05_beforeprice;
		DecimalFormat k05_df = new DecimalFormat("###,###,###,###");
		System.out.printf(" 신용승인\n");
		System.out.printf("단말기 : 2N68665898    전표번호 : 041218\n"); // 19칸
		System.out.printf("가맹점 : 한양김치찌개\n");
		System.out.printf("주  소 : 경기 성남시 분당구 황새울로\n");
		System.out.printf("351번길 10 , 1층\n");
		System.out.printf("대표자 : 유창신\n");
		System.out.printf("사업자 : 752-53-00558       TEL : 7055695\n");  //사업자(21칸)  TEL(13칸) 
		System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n"); // 36칸
		System.out.printf("%s%32s 원\n","금  액", k05_df.format(k05_beforeprice));
		System.out.printf("%s%32s 원\n","부가세", k05_df.format(k05_tax));
		System.out.printf("%s%32s 원\n","합  계", k05_df.format(k05_price));
		System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n"); // 36칸
		System.out.printf(" 우리카드\n");
		System.out.printf("카드번호 : 5387-20**-****-4613(s)  일시불\n");
		System.out.printf("%-32s\n","거래일시 : " + k05_dt.format(k05_calendar.getTime()));
		System.out.printf("승인번호 : 70404427\n");
		System.out.printf("거래번호 : 357734873739\n");
		System.out.printf("매입 : 비씨카드사   가맹 : 720068568\n");
		System.out.printf("알림 : EDC매출표\n");
		System.out.printf("문의 : TEL)1544-4700\n");
		System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n"); // 36칸
		System.out.printf("            * 감사합니다 *\n");
		System.out.printf("                       표준V2.08_20200212");
	
	}
}
