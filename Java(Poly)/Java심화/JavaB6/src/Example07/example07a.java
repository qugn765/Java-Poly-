package Example07;

public class example07a {

	public static void main(String[] args) {
		k05_Cal cc = new k05_Cal(); // ��ü����
		int k05_korean = 100;
		int k05_eng = 90;
		int k05_math = 95;
		int k05_sci = 92;
		int k05_soc = 89;
		// ���� ���� ���� ���� ��ȸ���� ������� ����
		System.out.printf("3�� ����ǥ\n");
		System.out.printf("========================================================\n");
		System.out.printf("�̸�      ����   ����   ����  ����   ���\n");
		System.out.printf("========================================================\n");
		System.out.printf("������    %-7s%-7s%-7s%-7s%-7s\n\n", 
				k05_korean, k05_eng, k05_math, cc.k05_sum(k05_korean, k05_eng, k05_math), cc.k05_ave(k05_korean, k05_eng, k05_math));
		//3�� ����ǥ ��� CalŬ�������� ����3������ sum�� ave ���
		
		System.out.printf("4�� ����ǥ\n");
		System.out.printf("========================================================\n");
		System.out.printf("�̸�      ����   ����   ����  ����   ����   ���\n");
		System.out.printf("========================================================\n");
		System.out.printf("������    %-7s%-7s%-7s%-7s%-7s%-7s\n\n", 
				k05_korean, k05_eng, k05_math, k05_sci, cc.k05_sum(k05_korean, k05_eng, k05_math,k05_sci), cc.k05_ave(k05_korean, k05_eng, k05_math,k05_sci));
		//4�� ����ǥ ��� CalŬ�������� ����4������ sum�� ave ���
		
		System.out.printf("5�� ����ǥ\n");
		System.out.printf("========================================================\n");
		System.out.printf("�̸�      ����   ����   ����  ����   ��ȸ   ����   ���\n");
		System.out.printf("========================================================\n");
		System.out.printf("������    %-7s%-7s%-7s%-7s%-7s%-7s%-7s\n\n", 
				k05_korean, k05_eng, k05_math, k05_sci, k05_soc, cc.k05_sum(k05_korean, k05_eng, k05_math, k05_sci, k05_soc), cc.k05_ave(k05_korean, k05_eng, k05_math, k05_sci, k05_soc));
		//5�� ����ǥ ��� CalŬ�������� ����5������ sum�� ave ���
		
	}

}
