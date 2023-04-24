package Example04;

import java.io.*;

public class example04a {

	public static void main(String[] args) throws IOException {
		
		File k05_f = new File("C:\\Users\\KBH\\Input\\�������������������.txt");
		BufferedReader k05_br = new BufferedReader(new FileReader(k05_f));
		// �������������������.csv ������ k05_f��� ��ü����
		
		String k05_readtxt; // �����͸� ����ϱ����� ������ ���� ����
		
		if((k05_readtxt = k05_br.readLine()) == null) {
			System.out.printf("�� �����Դϴ�\n");
			return;
		} //����ִ����� �϶� �������Դϴٸ� ���
		
		
		double k05_lat = 37.3860521;
		double k05_lng = 127.1214038;
		
		String[] k05_field_name = k05_readtxt.split("\t"); // ù��° ���� ,������ ������ fieldname�� ����
		int k05_LineCnt = 1;	 // ù��° �׸��� 1��°�� �ϱ����ؼ� 1�� ����
		double k05_min = Double.MAX_VALUE;
		int k05_min_index = 0;
		double k05_max = Double.MIN_VALUE;
		int k05_max_index = 0;
		
		while((k05_readtxt = k05_br.readLine()) != null) {
			String[] k05_field = k05_readtxt.split("\t"); // �ι�°�������� ������ ���پ� �迭������
			System.out.printf("**[%d��° �׸�]****************************\n", k05_LineCnt);
			System.out.printf("%s : %s\n", k05_field_name[9], k05_field[9]); // 9��° ���� �ּ����
			System.out.printf("%s : %s\n", k05_field_name[13], k05_field[13]); // 13��° ���� �������
			System.out.printf("%s : %s\n", k05_field_name[14], k05_field[14]); // 14��° ���� �浵���
			
			double k05_dist = Math.sqrt(Math.pow(Double.parseDouble(k05_field[13])- k05_lat, 2) 
					+ Math.pow(Double.parseDouble(k05_field[14]) -k05_lng ,2));
			// ������ġ�� ������ �浵, ������ �����浵�� �̿��� �Ÿ����
			k05_min = Math.min(k05_min, k05_dist);
			if(k05_min == k05_dist) k05_min_index = k05_LineCnt;
			k05_max = Math.max(k05_max, k05_dist);
			if(k05_max == k05_dist) k05_max_index = k05_LineCnt;
			
			System.out.printf("���� ������ �Ÿ� : %f\n", k05_dist); // �Ÿ����
			System.out.printf("******************************************\n");
			k05_LineCnt++; // ���ٳ��������� 1���߰�
		}
		System.out.printf("�ּҰŸ� : %f   %d��° ��������\n", k05_min, k05_min_index);
		System.out.printf("�ִ�Ÿ� : %f   %d��° ��������\n", k05_max, k05_max_index);
		
	}

}
