package Example13;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class example13a {
	public static ArrayList<k05_inputData> k05_arrL = new ArrayList<k05_inputData>();
	public static Calendar k05_cal = Calendar.getInstance();  //cal ���糯¥�޾ƿ���
	public static SimpleDateFormat k05_dt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // ����ð� data����
	public static int k05_iPerson = 200;
	static int k05_sumkor = 0;
	static int k05_sumeng = 0;
	static int k05_summath = 0;
	static int k05_sumtotal = 0;
	static int k05_sumavg = 0;
	static int k05_korsum = 0; 
	static int k05_korsum30 = 0;
	static int k05_engsum = 0;
	static int k05_engsum30 = 0;
	static int k05_mathsum = 0;
	static int k05_mathsum30 = 0;
	static double k05_koravg = 0;
	static double k05_koravg30 = 0;
	static double k05_engavg = 0;
	static double k05_engavg30 = 0;
	static double k05_mathavg = 0;
	static double k05_mathavg30 = 0;

	public static void main(String[] args) {
		k05_dataSet();
		k05_dataSort();
		for(int k05_i = 0; k05_i < k05_arrL.size(); k05_i++) {
			k05_ItemPrint(k05_i);
		}
		//�޼ҵ�� ȣ��
	}
	
	public static void k05_dataSort() {
		Comparator<k05_inputData> k05_abc = new Comparator<k05_inputData>() {
			public int compare(k05_inputData a1, k05_inputData a2) {
				return (a2.k05_sum() - a1.k05_sum());
			}
		}; // ���ؼ� ū���������ؼ� ������������ �����ϴ� �񱳹�
		Collections.sort(k05_arrL, k05_abc);
	}
	
	public static void k05_dataSet() {
		for (int k05_i = 0; k05_i < k05_iPerson; k05_i++) {
			String k05_name = String.format("ȫ��%02d",k05_i);
			int k05_kor = (int)(Math.random()*100);
			int k05_eng = (int)(Math.random()*100);
			int k05_math = (int)(Math.random()*100);
			k05_arrL.add(new k05_inputData(k05_i,k05_name,k05_kor,k05_eng,k05_math));
			// �̸� ���� ���� ���� ������ �ް� ArrayList�� arrL�� ����
		}
	}
	
	
	
	
	public static void k05_ItemPrint(int k05_p) {
		k05_inputData k05_rec;
		k05_rec = k05_arrL.get(k05_p);
		// ������ �������� ������ 30���� ��� �ʱ�ȭ���� �հ�� ��� ����
		int k05_page = 1;

			if((k05_p % 30) == 0) {
				System.out.printf("                  ��������ǥ\n");
				System.out.printf("PAGE : %2d                           ������� : %s\n",k05_page, k05_dt.format(k05_cal.getTime()));
				System.out.printf("==================================================================\n");
				System.out.printf("��ȣ    �̸�          ����      ����      ����      ����      ���\n");
				System.out.printf("==================================================================\n");
			} // �����Ҷ��� 30������������ ���
			System.out.printf("%04d  %5.5s         %4.4s      %4.4s      %4.4s      %4.4s    %6.6s\n",
					k05_p, k05_rec.k05_name(), k05_rec.k05_kor(), k05_rec.k05_eng(), k05_rec.k05_math(), 
					k05_rec.k05_sum(), k05_rec.k05_avg()); //��ȣ���´� �̸� ���� ���� �������� ���� ��� ���
			
			k05_korsum30 = k05_korsum30 + k05_rec.k05_kor();	
			k05_engsum30 = k05_engsum30 + k05_rec.k05_eng();
			k05_mathsum30 = k05_mathsum30 + k05_rec.k05_math();
			//30���� ��� �����ϴ� ������ ���հ踦 �����ϴ� ������ �հ�� ��� ���			
			if(((k05_p + 1) % 30) == 0 || k05_p == (k05_iPerson - 1)) {  // 30���� ���������� ���������� 30���� �ȵǵ� ���
				k05_korsum = k05_korsum +k05_korsum30;
				k05_engsum = k05_engsum + k05_engsum30;
				k05_mathsum = k05_mathsum + k05_mathsum30;  //30���� ���Ѱ��� �ٽ� �ʱ�ȭ�ϱ� ������ ������ �߰�����
				k05_koravg30 = k05_korsum30 / ((k05_p % 30) + 1);
				k05_koravg = k05_korsum / (k05_p + 1);
				k05_engavg30 = k05_engsum30 / ((k05_p % 30) + 1);
				k05_engavg = k05_engsum / (k05_p + 1);
				k05_mathavg30 = k05_mathsum30 / ((k05_p % 30) + 1);
				k05_mathavg = k05_mathsum / (k05_p + 1); // 30������ ��հ� ������հ��
				System.out.printf("==================================================================\n");
				System.out.printf("����������\n");
				System.out.printf("�հ�            %10.10s%10.10s%10.10s%10.10s%10.10s\n"
						,k05_korsum30,k05_engsum30,k05_mathsum30, k05_korsum30 + k05_engsum30 + k05_mathsum30,
						(k05_korsum30 + k05_engsum30 + k05_mathsum30) / 3); // �������� �հ踦 ���
				System.out.printf("���              %8.8s  %8.8s  %8.8s  %8.8s  %8.8s\n"
						,k05_koravg30,k05_engavg30,k05_mathavg30, k05_koravg30 + k05_engavg30 + k05_mathavg30,
						(k05_koravg30 + k05_engavg30 + k05_mathavg30) / 3); // �������� ��� ���
				k05_korsum30 = 0; k05_engsum30 = 0; k05_mathsum30 = 0;
				k05_koravg30 = 0; k05_engavg30 = 0; k05_mathavg30 = 0;  //30���� �ʱ�ȭ�ؼ� ������������ ����ϱ� ���� �ʱ�ȭ

				System.out.printf("==================================================================\n");
				System.out.printf("����������\n");
				System.out.printf("�հ�            %10.10s%10.10s%10.10s%10.10s%10.10s\n"
						,k05_korsum,k05_engsum,k05_mathsum, k05_korsum + k05_engsum + k05_mathsum,
						(k05_korsum + k05_engsum + k05_mathsum) / 3); // �������� �հ踦 ���
				System.out.printf("���              %8.8s  %8.8s  %8.8s  %8.8s  %8.8s\n\n\n\n"
						,k05_koravg,k05_engavg,k05_mathavg, k05_koravg + k05_engavg + k05_mathavg,
						(k05_koravg + k05_engavg + k05_mathavg) / 3); // �������� ��� ���
				k05_page++; // ������������ ���ؼ� page + 1
			} // 30�� ��� 1�������� �հ� ����� ����ϱ����� ���ǹ�
	}
}
