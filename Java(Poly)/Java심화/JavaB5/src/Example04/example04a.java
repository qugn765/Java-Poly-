package Example04;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class example04a {

	public static void main(String[] args) {
		Calendar k05_calendar = Calendar.getInstance();
		SimpleDateFormat k05_dt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		SimpleDateFormat k05_dtmd = new SimpleDateFormat("MM��dd��");
		String k05_plus14day = k05_dtmd.format(k05_calendar.getTime());
		k05_calendar.add(Calendar.DATE, 14);
		
		
		DecimalFormat k05_df = new DecimalFormat("###,###,###,###");
		String k05_itemname1 = "��������Ű��ũ��(���̽�ũ��)"; // 35ĭ���
		String k05_itemcode1 = "1031615"; //7ĭ���
		int k05_price1 = 14400;
		int k05_amount1 = 2;
		
		String k05_itemname2 = "�����̵�ĸ���(������Ÿ��)"; // 29ĭ���
		String k05_itemcode2 = "11008152"; // 8ĭ���
		int k05_price2 = 900;
		int k05_amount2 = 5;
		
		String k05_itemname3 = "�������� ���׸�����ũ(�˷�̴�Ÿ��)"; //35ĭ���
		String k05_itemcode3 = "1020800"; //7ĭ���
		int k05_price3 = 6000;
		int k05_amount3 = 7;
		
		int k05_pricetotal = (k05_price1 * k05_amount1) + (k05_price2 * k05_amount2) + (k05_price3 * k05_amount3);
		double k05_taxrate = 0.1f;
		double k05_beforepricetotald = (int)(k05_pricetotal / (1+ k05_taxrate));
		int k05_beforepricetotal = (int)k05_beforepricetotald;
		int k05_tax = k05_pricetotal - k05_beforepricetotal;
		
		 
		System.out.printf("            \"���ΰ���, ���̼�\"\n");
		System.out.printf("(��)�Ƽ����̼�_�д缭����\n");
		System.out.printf("��ȭ:031-702-6016\n");
		System.out.printf("����:���� ������ ���μ�ȯ�� 2748 (���)\n");
		System.out.printf("��ǥ:������,��ȣ�� 213-81-52063\n");
		System.out.printf("����:��⵵ ������ �д籸\n");
		System.out.printf("�д��53���� 11 (������)\n");
		System.out.printf("=========================================\n"); // 41ĭ
		System.out.printf("      �Һ����߽ɰ濵(CCM) �������\n");
		System.out.printf("    ISO 9001 ǰ���濵�ý��� �������\n");
		System.out.printf("=========================================\n"); // 41ĭ
		System.out.printf("      ��ȯ/ȯ�� 14��(" + k05_dtmd.format(k05_calendar.getTime()) + ")�̳�,\n");
		System.out.printf("     (����)������, ����ī�� ���� ��\n");
		System.out.printf("           ���Ը��忡�� ����\n");
		System.out.printf("   ����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("      üũī�� ��� �� �ִ� 7�� �ҿ�\n");
		System.out.printf("=========================================\n"); // 41ĭ
		k05_calendar.add(Calendar.DATE, -14);
		System.out.printf("%-13s%28s\n","[POS 1058231]", k05_dt.format(k05_calendar.getTime()));
		System.out.printf("=========================================\n"); // 41ĭ
		System.out.printf("%-11.11s %7.7s%3.3s%9.9s\n", k05_itemname1, k05_df.format(k05_price1), k05_df.format(k05_amount1), k05_df.format(k05_price1 * k05_amount1));
		System.out.printf("[%s]\n", k05_itemcode1);
		System.out.printf("%-11.11s %7.7s%3.3s%9.9s\n", k05_itemname2, k05_df.format(k05_price2), k05_df.format(k05_amount2), k05_df.format(k05_price2 * k05_amount2));
		System.out.printf("[%s]\n", k05_itemcode2);
		System.out.printf("%-11.11s %7.7s%3.3s%9.9s\n", k05_itemname3, k05_df.format(k05_price3), k05_df.format(k05_amount3), k05_df.format(k05_price3 * k05_amount3));
		System.out.printf("[%s]\n", k05_itemcode3);
		System.out.printf("             �����հ�%20.20s\n", k05_df.format(k05_beforepricetotal));
		System.out.printf("               �ΰ���%20.20s\n", k05_df.format(k05_tax));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("�Ǹ��հ�%33.33s\n", k05_df.format(k05_pricetotal));
		System.out.printf("=========================================\n"); // 41ĭ
		System.out.printf("�ſ�ī��                        %9.9s\n", k05_df.format(k05_pricetotal));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("�츮ī��                 538720**********\n");
		System.out.printf("���ι�ȣ 77982843(0)    ���αݾ�%9.9s\n", k05_df.format(k05_pricetotal));
		System.out.printf("=========================================\n"); // 41ĭ
		System.out.printf("      %s �д缭����\n", k05_dt.format(k05_calendar.getTime()));
		System.out.printf("��ǰ �� ��Ÿ ���� : 1522-4400\n");
		System.out.printf("����� �� �����̼� ���� ���� : 1599-2211\n");
		System.out.printf("        lll llll ll l lllll ll ll        \n");
		System.out.printf("        lll llll ll l lllll ll ll        \n");
		System.out.printf("        lll llll ll l lllll ll ll        \n");
		System.out.printf("            2112820610158231\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("�� ���̼Ҹ���ʾ�orȨ�������� �����ϼż�\n");
		System.out.printf(" ȸ������ �� �پ��� ������ ����������!��");
		
		
	
	
	}

}
