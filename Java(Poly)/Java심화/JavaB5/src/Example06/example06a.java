package Example06;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class example06a {

	public static void main(String[] args) {	
		Calendar k05_calendar = Calendar.getInstance();
		SimpleDateFormat k05_dt = new SimpleDateFormat("YYYY-MM-dd HH:mm");
		DecimalFormat k05_df = new DecimalFormat("###,###,###,###");
		String[] k05_itemname = {"1600원 / 만두", "1000원 / 만두"};
		int[] k05_itemprice = {1600,1000};
		int[] k05_amount = {3,1};
		float k05_taxrate = 0.1f;
		int k05_totalprice = 0;
		for(int k05_i = 0; k05_i < k05_itemprice.length; k05_i++) {
			k05_totalprice = k05_totalprice+  (k05_itemprice[k05_i] * k05_amount[k05_i]);
			k05_itemname[k05_i] = k05_itemname[k05_i] + "              ";
			int k05_cntbyte = 0;
			for(int k05_j = 0; k05_j <k05_itemname[k05_i].length(); k05_j++) {
				String a = String.valueOf(k05_itemname[k05_i].charAt(k05_j));		
				k05_cntbyte = k05_cntbyte + a.getBytes().length;
				if (k05_cntbyte == 13) {
					k05_itemname[k05_i] = k05_itemname[k05_i].substring(0,k05_j + 1) + " ";	
				}
				if (k05_cntbyte == 14) {
					k05_itemname[k05_i] = k05_itemname[k05_i].substring(0,k05_j + 1);						
				}
			} 
		}

		int k05_beforeprice = (int)(k05_totalprice / (1 + k05_taxrate));
		int k05_tax = k05_totalprice - k05_beforeprice;
		System.out.printf("          S H I N S E G A E \n");
		System.out.printf("(주) 신세계 경기점         T.1588-1234   \n");
		System.out.printf("경기 용인 수지구 포은대로 536\n");
		System.out.printf("201-81-32195   차 정 호\n");
		System.out.printf("구매 %s  거래번호:0533-8162\n",k05_dt.format(k05_calendar.getTime()));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("      상품명            수량         금액\n");
		System.out.printf("-----------------------------------------\n");
		for(int k05_i = 0; k05_i < k05_itemname.length; k05_i++) {
			System.out.printf("%s         %3.3s    %11.11s\n", k05_itemname[k05_i], k05_df.format(k05_amount[k05_i]), k05_df.format(k05_amount[k05_i] * k05_itemprice[k05_i]));
		}
		  
		System.out.printf("        소    계              %11.11s\n",k05_df.format(k05_totalprice));
		System.out.printf("과 세 물 품 가액              %11.11s\n",k05_df.format(k05_beforeprice));
		System.out.printf("부     가     세              %11.11s\n",k05_df.format(k05_tax));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("합            계              %11.11s\n",k05_df.format(k05_totalprice));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("카 드 결 제 액                %11.11s\n",k05_df.format(k05_totalprice));
		System.out.printf("비  씨                   538720******4227\n");
		System.out.printf("승인번호             67137812      일시불\n");
		System.out.printf("           캐셔No:409**2 구운몽\n");
		System.out.printf("           주 문 번 호  : 8 7 6\n");
		System.out.printf("캐셔:084599 양00                     1150\n");
		System.out.printf("  ll llll llllll llll ll l lllll ll ll   \n");
		System.out.printf("  ll llll llllll llll ll l lllll ll ll   \n");
		System.out.printf("  ll llll llllll llll ll l lllll ll ll   \n");
		System.out.printf("        2103060533816200005801\n");
		System.out.printf("교환, 환불, 결제변경은 7일내 결제카드\n");
		System.out.printf("지참하시고, 환불시 증정사은품은\n");
		System.out.printf("반납하셔야 합니다. (일부 브랜드 제외)\n");
		System.out.printf("구운몽 031-695-2173");
				
	}

}
