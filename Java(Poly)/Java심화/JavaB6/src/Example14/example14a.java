package Example14;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class example14a {

	public static void main(String[] args) {
		Calendar k05_cal = Calendar.getInstance();  //cal ���糯¥�޾ƿ���
		SimpleDateFormat k05_dt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // ����ð� data����
		int k05_iPerson = 30; // ����ο� ����
		k05_InputData k05_inData = new k05_InputData(k05_iPerson); // ��ü����
		int k05_korsum = k05_inData.k05_subsum(k05_inData.k05_korarr, k05_iPerson);       // kor���� ��������
		int k05_engsum = k05_inData.k05_subsum(k05_inData.k05_engarr, k05_iPerson);       // eng���� ��������
		int k05_mathsum = k05_inData.k05_subsum(k05_inData.k05_matharr, k05_iPerson);     // math���� ��������
		double k05_koravg = k05_inData.k05_subavg(k05_inData.k05_korarr, k05_iPerson);    // kor���� �������
		double k05_engavg = k05_inData.k05_subavg(k05_inData.k05_engarr, k05_iPerson);    // eng���� �������
		double k05_mathavg = k05_inData.k05_subavg(k05_inData.k05_matharr, k05_iPerson);  // math ���� �������
		System.out.printf("                  ��������ǥ\n");
		System.out.printf("                            ������� : %s\n", k05_dt.format(k05_cal.getTime()));
		System.out.printf("=======================================================================\n");
		System.out.printf("��ȣ    �̸�          ����      ����      ����      ����      ���\n");
		System.out.printf("=======================================================================\n");
		for (int k05_i = 0; k05_i < k05_iPerson; k05_i++) {
			System.out.printf("%04d  %5.5s         %4.4s      %4.4s      %4.4s      %4.4s    %6.6s\n",
					k05_i, k05_inData.k05_namearr[k05_i], k05_inData.k05_korarr[k05_i], k05_inData.k05_engarr[k05_i], k05_inData.k05_matharr[k05_i], 
					k05_inData.k05_sumarr[k05_i], k05_inData.k05_avgarr[k05_i]);			
		} // ��ȣ, �̸� ���� ���� ���� ����, ����, ��� ��� ���
		System.out.printf("=======================================================================\n");
		System.out.printf("�հ�            %10.10s%10.10s%10.10s%10.10s%10.10s\n",k05_korsum,k05_engsum,k05_mathsum,
				k05_korsum + k05_engsum + k05_mathsum, (k05_korsum + k05_engsum + k05_mathsum) / 3); // �������� �հ踦 ���
		System.out.printf("���              %8.8s  %8.8s  %8.8s  %8.8s  %8.8s",k05_koravg,k05_engavg,k05_mathavg,
				k05_koravg + k05_engavg + k05_mathavg, (k05_koravg + k05_engavg + k05_mathavg) / 3); // �������� ��� ���

	}

}
