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
	static Calendar k05_calendar = Calendar.getInstance(); // ���糯¥ �޾ƿ���
	static Calendar k05_calendar2 = Calendar.getInstance(); // ���糯¥ �޾ƿ���
	static SimpleDateFormat k05_dt = new SimpleDateFormat("YYYY-MM-dd HH:mm"); // ��¥�� ���������� ����
	static SimpleDateFormat k05_dt2 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss"); // ��¥�� ���������� ����
	static SimpleDateFormat k05_dt3 = new SimpleDateFormat("YYYYMMdd"); // ��¥�� ���������� ����
	static DecimalFormat k05_df = new DecimalFormat("###,###,###,###"); // ������ ���� ����
	
	
	public static void main(String[] args) {
		int k05_itemcount = 31;
		k05_item(); // ��ǰ �̸����� ���� �鼼���� ����
		k05_TitlePrint(); // ���� ���
		k05_TimeStemp(); // �ð����
		k05_HeaderPrint(); // ��ǰ�� �ܰ� ���� �ݾ� �������
		k05_ItemCal(); // ��ǰ���� �̸� �ܰ� ���� ���
		for(int k05_i = 0; k05_i < k05_itemcount; k05_i++) {
			k05_ItemPrint(k05_i);
		}
		k05_TotalPrint(); // �հ�� �ؿ��� ���		
		
	}
	
	

	public static void k05_item() {
		String[] k05_a= { "����Ȩ SAFE365 �ڵ�ũ��", "(G)LH��������ȭ�� 10����", "��������E", "���� ���Ϸ� �� ��", "����Ȩ SAFE �ڵ����", "��� �Ŷ��120g*5",
				"(��)����������", "���ѱ� ������� 156g", "GAP ������ 4-6��/", "�� ����� �ٳ���(��)", "����ũ ź�θ� �߰���", "(����)����߰���(g)",
				"DZ�ִϾ�縻3��C_BK", "DZ�ִϾ�縻3��C_WH", "�����̾��������ʹ�", "����ũ ����̿���500", "���� ���ִ¿���GT ���������", "���������÷�10��",
				"��������(��)65g*6", "�ɶ�ý� ���� Ʈ��Ʈ", "Ǫ���� �̼��������", "���Ϸν���������500g", "CJ ����Ĩ 20G", "����ũ ����̿���500",
				"����� ���� ��ũƼ", "1+ ��޶� 10���� Ư", "������ݺ�����ġ��ȹ", "����(1.8kg/��)", "�ҺҰ��(�ż���Ǫ��)", "���������ǳ�150g","��"}; // ��ǰ�̸��迭 ����
		k05_itemname = k05_a;
		int[] k05_b= { 10020000, 6900, 5980, 3300, 5500, 3380, 6610, 2750, 10800, 49800, 2480, 102480, 4980, 1204980, 7130, 3980,
				4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 3480, 7980, 2780, 10000, 2680,1000 }; // ��ǰ���� ���� �迭 ����
		k05_itemprice = k05_b;
		int[] k05_c= { 9, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 2, 1, 2, 6}; // ��ǰ���� ���� �迭 ����
		k05_amount = k05_c;
		boolean[] k05_d= {false, false, false, false, false, false ,true, false, true, false, false, false, false, false, false, false, true, 
				false, false, false, false, false, false, false, false, true, false, true, false, false, false}; // ��ǰ���� �鼼��ǰ���� �ƴ��� �Ǻ��ϴ� �迭����
		k05_taxfree = k05_d;
	}
	
	
	public static void k05_TitlePrint() {
		System.out.printf("              �̸�Ʈ ������ (031)888-1234\n");
		System.out.printf("     emart    206-86-50913 ����        \n");
		System.out.printf("              ���� ������ ������� 552   \n\n");
		System.out.printf("������ �������� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("�����ǰ�� ����, 30�� �̳�(�ż� 7��)\n");
		System.out.printf("���Ϻ� �귣����� ����(���� ����������)\n");
		System.out.printf("��ȯ/ȯ�� ���������� ����(����ī�� ����)\n\n");
	}

	
	public static void k05_TimeStemp(){
		System.out.printf("[�� ��]%s%19s",k05_dt.format(k05_calendar.getTime()), "POS:0011-9861\n");
	}

	
	public static void k05_HeaderPrint() {
		System.out.printf("-----------------------------------------\n");
		System.out.printf("  ��ǰ��             �� ��   ����   �� ��\n");
		System.out.printf("-----------------------------------------\n");
	}
	
	public static void k05_ItemPrint(int k05_i) {
		System.out.printf("%s %s%11.11s%3.3s%11.11s\n",k05_taxitem[k05_i], k05_itemname[k05_i], k05_df.format(k05_itemprice[k05_i]), 
				k05_df.format(k05_amount[k05_i]),k05_df.format((k05_itemprice[k05_i] * k05_amount[k05_i])));
		if ((k05_i + 1) % 5 == 0) {
			System.out.printf("-----------------------------------------\n"); // ��ǰ�� 5�� ���������� ---�ټ���
		}
	}
	
	
	public static void k05_ItemCal() {
		k05_taxitem = new String[k05_taxfree.length]; // ��ǰ�̸��� ����ũ���� �迭�� ����� �ű⿡ "      " �� �߰��� �̸� ����
		for(int k05_i = 0; k05_i < k05_itemname.length; k05_i++) {
			if (k05_taxfree[k05_i] == false) {
				k05_taxitem[k05_i] = " ";  //��鼼��ǰ�� �̸� �տ� ������ �߰��ϱ����� �迭 ����
				k05_ytaxitemprice = k05_ytaxitemprice + (k05_itemprice[k05_i] * k05_amount[k05_i]); //��鼼��ǰ���� ������ ������ŭ ���ؼ� ��鼼��ǰ �Ѱ��ݿ� �߰�
			} else {
				k05_taxitem[k05_i] = "*"; //��鼼��ǰ�� �̸� �տ� *�� �߰��ϱ����� �迭 ����
				k05_ntaxitemprice = k05_ntaxitemprice + (k05_itemprice[k05_i] * k05_amount[k05_i]); //�鼼��ǰ���� ������ ������ŭ ���ؼ� �鼼��ǰ �Ѱ��ݿ� �߰�
			}
		}

		for (int k05_i = 0; k05_i < k05_itemname.length; k05_i++) {
			k05_itemname[k05_i] = k05_itemname[k05_i] + "                                     "; // �̸��� ª�� ��ǰ���� ©������ �ڿ����ڵ��� ��������°� �����ϱ����� �����߰�
			int k05_cntbyte = 0; // �ѱ����ѱ��� ����Ʈ���� Ȯ���ϱ����� ��������
			for(int k05_j = 0; k05_j <k05_itemname[k05_i].length(); k05_j++) { 
				String k05_a = String.valueOf(k05_itemname[k05_i].charAt(k05_j)); // �ϳ��� ���ڿ��� �ϳ��� ȣ��
				k05_cntbyte = k05_cntbyte + k05_a.getBytes().length; // �ϳ��� ȣ��� ���ڵ��� ����Ʈ�� ���ϱ�
				if (k05_cntbyte == 13) {
					String k05_b = String.valueOf(k05_itemname[k05_i].charAt(k05_j + 1));// ����Ʈ�� �Ѱ����� 14�� ���߱����ؼ� �ѱ��� 2byte�̹Ƿ� 13�ϋ� 14�϶� ��츦 ����
					if(k05_b.getBytes().length == 1) {
						k05_itemname[k05_i] = k05_itemname[k05_i].substring(0,k05_j + 2);// 13���γ������� ���ڿ��� �ڸ��� ����Ʈ�� 14�� ���߱����� " "�߰�
					} else {
						k05_itemname[k05_i] = k05_itemname[k05_i].substring(0,k05_j + 1) + " ";
					}
				} else if (k05_cntbyte == 14) {
					k05_itemname[k05_i] = k05_itemname[k05_i].substring(0,k05_j + 1); // 14����Ʈ�γ��������� �ű������ ���ڸ��߶� ��������						 
				}
			} 
		}

		double k05_taxrate = 0.10; // ���� 10%���� ��Ȯ�Ѱ�������� double����
		double k05_ytaxitembeforepricef = (k05_ytaxitemprice / (1 + k05_taxrate)); //�������� ��� 
		k05_ytaxitembeforeprice = (int)k05_ytaxitembeforepricef;
		k05_tax = k05_ytaxitemprice - k05_ytaxitembeforeprice; //�Ѱ��ݿ��� ������������ ���ݱݾ� ���
	}
	
	public static void k05_TotalPrint() {
		String k05_a = "�Ͻú� / " + k05_df.format(k05_ytaxitemprice + k05_ntaxitemprice);
		System.out.printf("\n");
		System.out.printf("               �� ǰ�� ����    %10.10s\n", k05_df.format(k05_itemname.length));
		System.out.printf("            (*)�� ��  �� ǰ    %10.10s\n", k05_df.format(k05_ntaxitemprice));
		System.out.printf("               �� ��  �� ǰ    %10.10s\n", k05_df.format(k05_ytaxitembeforeprice));
		System.out.printf("               ��   ��   ��    %10.10s\n", k05_df.format(k05_tax));
		System.out.printf("               ��        ��    %10.10s\n", k05_df.format(k05_ytaxitemprice + k05_ntaxitemprice));
		System.out.printf("�� �� �� �� �� ��              %10.10s\n", k05_df.format(k05_ytaxitemprice + k05_ntaxitemprice));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("0012 KEB �ϳ�       541707**0484/35860658\n");
		System.out.printf("ī�����(IC)       %19.19s\n", k05_a);
		System.out.printf("-----------------------------------------\n");
		System.out.printf("           [�ż�������Ʈ ����]           \n");
		System.out.printf("ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.\n");
		int k05_beforepoint = 5473;  // ���� �� ����Ʈ
		int k05_point = 164; // ���� �߻��� ����Ʈ
		System.out.printf("��ȸ�߻�����Ʈ        9350**9995   %6.6s\n",k05_point);
		System.out.printf("����(����)����Ʈ       %8.8s(%8.8s)\n",k05_df.format(k05_beforepoint + k05_point), k05_df.format(k05_beforepoint));
		System.out.printf("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("   ���űݾױ��� ���������ð� �ڵ��ο�   \n");
		String k05_carnumber = "34��9853"; //������ȣ
		String k05_blankcarnumber = k05_carnumber.substring(0,3); // ���� 3�ڸ������
		for (int k05_i = 0; k05_i < k05_carnumber.length(); k05_i++) {
			k05_blankcarnumber = k05_blankcarnumber + "*" ;		// ���� 3�ڸ��� ������ �ڿ�������ȣ�� *�� ǥ��
		}
		System.out.printf("������ȣ :                      %8.8s\n",k05_blankcarnumber);
		k05_calendar.add(Calendar.MINUTE, -90); // �����ð��� ���� 90��������
		System.out.printf("�����ð� :           %20.20s\n",k05_dt2.format(k05_calendar.getTime()));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("ĳ��:084599 ��00                     1150\n");
		System.out.printf("  ll llll llllll llll ll l lllll ll ll   \n");
		System.out.printf("  ll llll llllll llll ll l lllll ll ll   \n");
		System.out.printf("  ll llll llllll llll ll l lllll ll ll   \n");
		System.out.printf("%14.14s/00119861/00164980/31",k05_dt3.format(k05_calendar2.getTime()));
	}


}
