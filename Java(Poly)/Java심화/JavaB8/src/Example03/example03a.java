package Example03;

import java.io.*;

public class example03a {

	public static void main(String[] args) throws IOException {
		
		File k05_f = new File("C:\\Users\\KBH\\Input\\�������������������.csv");
		BufferedReader k05_br = new BufferedReader(new FileReader(k05_f));
		// �������������������.csv ������ k05_f��� ��ü����
		
		String k05_readtxt; // �����͸� ����ϱ����� ������ ���� ����
		
		if((k05_readtxt = k05_br.readLine()) == null) {
			System.out.printf("�� �����Դϴ�\n");
			return;
		} //����ִ����� �϶� �������Դϴٸ� ���
		
		String[] k05_field_name = k05_readtxt.split(","); // ù��° ���� ,������ ������ fieldname�� ����
		int LineCnt = 1; // ù��° �׸��� 1��°�� �ϱ����ؼ� 1�� ����
		
		while((k05_readtxt = k05_br.readLine()) != null) {
			String[] k05_field = k05_readtxt.split(","); // �ι�°�������� ������ �迭������
			System.out.printf("**[%d��° �׸�]****************************\n", LineCnt);
			for(int j = 0; j < k05_field_name.length; j++) {
				System.out.printf(" %s : %s\n", k05_field_name[j], k05_field[j]);
			} // ó�������ߴ� fieldname�� field������ ���� ���
			
			System.out.printf("******************************************\n");
			if(LineCnt == 100) break; // 100�������� ���
			LineCnt++; // ���ٳ��������� 1���߰�
		}
		
	}

}
