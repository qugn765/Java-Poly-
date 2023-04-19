package Example06;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class example06a {

	public static void main(String[] args) {	
		Calendar k05_calendar = Calendar.getInstance();
		SimpleDateFormat k05_dt = new SimpleDateFormat("YYYY-MM-dd HH:mm");
		DecimalFormat k05_df = new DecimalFormat("###,###,###,###");
		String[] k05_itemname = {"1600�� / ����", "1000�� / ����"};
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
		System.out.printf("(��) �ż��� �����         T.1588-1234   \n");
		System.out.printf("��� ���� ������ ������� 536\n");
		System.out.printf("201-81-32195   �� �� ȣ\n");
		System.out.printf("���� %s  �ŷ���ȣ:0533-8162\n",k05_dt.format(k05_calendar.getTime()));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("      ��ǰ��            ����         �ݾ�\n");
		System.out.printf("-----------------------------------------\n");
		for(int k05_i = 0; k05_i < k05_itemname.length; k05_i++) {
			System.out.printf("%s         %3.3s    %11.11s\n", k05_itemname[k05_i], k05_df.format(k05_amount[k05_i]), k05_df.format(k05_amount[k05_i] * k05_itemprice[k05_i]));
		}
		  
		System.out.printf("        ��    ��              %11.11s\n",k05_df.format(k05_totalprice));
		System.out.printf("�� �� �� ǰ ����              %11.11s\n",k05_df.format(k05_beforeprice));
		System.out.printf("��     ��     ��              %11.11s\n",k05_df.format(k05_tax));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("��            ��              %11.11s\n",k05_df.format(k05_totalprice));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("ī �� �� �� ��                %11.11s\n",k05_df.format(k05_totalprice));
		System.out.printf("��  ��                   538720******4227\n");
		System.out.printf("���ι�ȣ             67137812      �Ͻú�\n");
		System.out.printf("           ĳ��No:409**2 �����\n");
		System.out.printf("           �� �� �� ȣ  : 8 7 6\n");
		System.out.printf("ĳ��:084599 ��00                     1150\n");
		System.out.printf("  ll llll llllll llll ll l lllll ll ll   \n");
		System.out.printf("  ll llll llllll llll ll l lllll ll ll   \n");
		System.out.printf("  ll llll llllll llll ll l lllll ll ll   \n");
		System.out.printf("        2103060533816200005801\n");
		System.out.printf("��ȯ, ȯ��, ���������� 7�ϳ� ����ī��\n");
		System.out.printf("�����Ͻð�, ȯ�ҽ� ��������ǰ��\n");
		System.out.printf("�ݳ��ϼž� �մϴ�. (�Ϻ� �귣�� ����)\n");
		System.out.printf("����� 031-695-2173");
				
	}

}
