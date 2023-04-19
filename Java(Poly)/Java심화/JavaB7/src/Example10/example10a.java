package Example10;

import java.util.ArrayList;


public class example10a {
	public static ArrayList<k05_OneRec> k05_arrL = new ArrayList<k05_OneRec>();
	public static int k05_iPerson = 10;
	static int k05_sumkor = 0;
	static int k05_sumeng = 0;
	static int k05_summath = 0;
	static int k05_sumtotal = 0;
	static int k05_sumavg = 0;
    // �������� ����
	
	public static void main(String[] args) {
		k05_dataSet();
		k05_HeaderPrint();
		for(int k05_i = 0; k05_i < k05_arrL.size(); k05_i++) {
			k05_ItemPrint(k05_i);
		}
		k05_TailPrint();
		//�޼ҵ�� ȣ��
	}

	
	
	
	public static void k05_dataSet() {
		for (int k05_i = 0; k05_i < k05_iPerson; k05_i++) {
			String k05_name = String.format("ȫ��%02d",k05_i);
			int k05_kor = (int)(Math.random()*100);
			int k05_eng = (int)(Math.random()*100);
			int k05_math = (int)(Math.random()*100);
			k05_arrL.add(new k05_OneRec(k05_i,k05_name,k05_kor,k05_eng,k05_math));
			// �̸� ���� ���� ���� ������ �ް� ArrayList�� arrL�� ����
		}
	}
	
	
	public static void k05_HeaderPrint() {
		System.out.printf("*********************************************\n");
		System.out.printf("%2s %5s %2s %2s %2s %2s    %2s\n","��ȣ","�̸�","����","����","����","�հ�","���");
		System.out.printf("*********************************************\n");
	} // ���� ���
	
	
	public static void k05_ItemPrint(int k05_i) {
		k05_OneRec k05_rec;
		
		k05_rec = k05_arrL.get(k05_i);
		System.out.printf("%4d %6s %3d %3d %3d   %3d    %6.2f\n",k05_rec.k05_studentid(),k05_rec.k05_name()
				,k05_rec.k05_kor(),k05_rec.k05_eng(),k05_rec.k05_math(),k05_rec.k05_sum(), k05_rec.k05_avg());
		k05_sumkor += k05_rec.k05_kor();
		k05_sumeng += k05_rec.k05_eng();
		k05_summath += k05_rec.k05_math();
		k05_sumtotal += k05_rec.k05_sum();
		k05_sumavg += k05_rec.k05_avg();
	// ���հ� ����� ���ϱ����� �����ؼ� �հ踦 ���ϰ� ������ ����ϴ� �޼ҵ�
	}
	
	public static void k05_TailPrint() {
		System.out.printf("*********************************************\n");
		System.out.printf("�����հ� %d      ������� :%6.2f\n",k05_sumkor, k05_sumkor/(double)k05_arrL.size());
		System.out.printf("�����հ� %d      ������� :%6.2f\n",k05_sumeng, k05_sumeng/(double)k05_arrL.size());
		System.out.printf("�����հ� %d      ������� :%6.2f\n",k05_summath, k05_summath/(double)k05_arrL.size());
		System.out.printf("*********************************************\n");
		System.out.printf("������հ�  %d   ����� :%6.2f\n", k05_sumavg, k05_sumavg/(double)k05_arrL.size());
		// ���ؼ� ���� �հ踦 ����ϰ� ��ճ��� �޼ҵ�
		
	}
}
