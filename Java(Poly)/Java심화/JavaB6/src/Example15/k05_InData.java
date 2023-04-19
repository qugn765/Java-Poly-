package Example15;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class k05_InData {

	public int[] k05_numarr, k05_korarr, k05_engarr, k05_matharr, k05_sumarr;
	public double[] k05_avgarr;
	public String[] k05_namearr;
	Calendar k05_cal = Calendar.getInstance();  //cal ���糯¥�޾ƿ���
	SimpleDateFormat k05_dt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // ����ð� data����

	public k05_InData(int k05_iPerson) {
		k05_numarr = new int[k05_iPerson];
		k05_namearr = new String[k05_iPerson];
		k05_korarr = new int[k05_iPerson];
		k05_engarr = new int[k05_iPerson];
		k05_matharr = new int[k05_iPerson];
		k05_sumarr = new int[k05_iPerson];
		k05_avgarr = new double[k05_iPerson];	
		for(int k05_i = 0; k05_i < k05_iPerson; k05_i++) {
			String k05_name = String.format("ȫ��%02d",k05_i);
			int k05_kor = (int)(Math.random() *100);
			int k05_eng = (int)(Math.random() *100);
			int k05_math = (int)(Math.random() *100);
			k05_SetData(k05_i, k05_name , k05_kor,k05_eng,k05_math);	
		}
		//����� ����� �Է¹޾� ����� ������´� ũ���� �迭����		
		// �����Լ��� �̿��ؼ� kor, eng, math�� ������ ���������ϰ� InputData Ŭ������ SetData�� ������ �־���
	}
	public void k05_SetData(int k05_a, String k05_s, int k05_b, int k05_c, int k05_d) {
		int k05_sum = k05_b + k05_c + k05_d;
		double k05_avg = k05_sum / 3;
		k05_numarr[k05_a] = k05_a;
		k05_namearr[k05_a] = k05_s;
		k05_korarr[k05_a] = k05_b;
		k05_engarr[k05_a] = k05_c;
		k05_matharr[k05_a] = k05_d;
		k05_sumarr[k05_a] = k05_sum;
		k05_avgarr[k05_a] = k05_avg; // �̸� ������ �Է¹޾Ƽ� �迭�� �����ϰ� �հ�� ����� ���ؼ� �迭�� ����
	}	

	public void k05_printData(int k05_iPerson) {
		int k05_korsum = 0; 
		int k05_korsum30 = 0;
		int k05_engsum = 0;
		int k05_engsum30 = 0;
		int k05_mathsum = 0;
		int k05_mathsum30 = 0;
		double k05_koravg = 0;
		double k05_koravg30 = 0;
		double k05_engavg = 0;
		double k05_engavg30 = 0;
		double k05_mathavg = 0;
		double k05_mathavg30 = 0;
		// ������ �������� ������ 30���� ��� �ʱ�ȭ���� �հ�� ��� ����
		int k05_page = 1;


		for (int k05_i = 0; k05_i < k05_iPerson; k05_i++) {
			if((k05_i % 30) == 0) {
				System.out.printf("                  ��������ǥ\n");
				System.out.printf("PAGE : %2d                           ������� : %s\n",k05_page, k05_dt.format(k05_cal.getTime()));
				System.out.printf("==================================================================\n");
				System.out.printf("��ȣ    �̸�          ����      ����      ����      ����      ���\n");
				System.out.printf("==================================================================\n");
			} // �����Ҷ��� 30������������ ���
			System.out.printf("%04d  %5.5s         %4.4s      %4.4s      %4.4s      %4.4s    %6.6s\n",
					k05_i, k05_namearr[k05_i], k05_korarr[k05_i], k05_engarr[k05_i], k05_matharr[k05_i], 
					k05_sumarr[k05_i], k05_avgarr[k05_i]); //��ȣ���´� �̸� ���� ���� �������� ���� ��� ���
			
			k05_korsum30 = k05_korsum30 + k05_korarr[k05_i];	
			k05_engsum30 = k05_engsum30 + k05_engarr[k05_i];
			k05_mathsum30 = k05_mathsum30 + k05_matharr[k05_i];
			//30���� ��� �����ϴ� ������ ���հ踦 �����ϴ� ������ �հ�� ��� ���
			
			if(((k05_i + 1) % 30) == 0 || k05_i == (k05_iPerson - 1)) {  // 30���� ���������� ���������� 30���� �ȵǵ� ���
				k05_korsum = k05_korsum +k05_korsum30;
				k05_engsum = k05_engsum + k05_engsum30;
				k05_mathsum = k05_mathsum + k05_mathsum30;  //30���� ���Ѱ��� �ٽ� �ʱ�ȭ�ϱ� ������ ������ �߰�����
				k05_koravg30 = k05_korsum30 / ((k05_i % 30) + 1);
				k05_koravg = k05_korsum / (k05_i + 1);
				k05_engavg30 = k05_engsum30 / ((k05_i % 30) + 1);
				k05_engavg = k05_engsum / (k05_i + 1);
				k05_mathavg30 = k05_mathsum30 / ((k05_i % 30) + 1);
				k05_mathavg = k05_mathsum / (k05_i + 1); // 30������ ��հ� ������հ��
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
}
