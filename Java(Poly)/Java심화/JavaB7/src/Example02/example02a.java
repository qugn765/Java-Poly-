package Example02;

import java.text.DecimalFormat;

public class example02a {

	public static void main(String[] args) {
		DecimalFormat k05_df = new DecimalFormat("###,###,###,###"); // ������ ���� ����
		String[] k05_OneRec = { 
				"1    ����Ȩ SAFE365      8,000  9     16,000",
				"2    (G)LH��������       6,900  1      6,900",
				"3    ��������E           5,980  1      5,980",
				"4    ���� ���Ϸ�       3,300  1      3,300",
				"5    ����Ȩ SAFE ��      5,500  2     11,000",
				"6    ��� �Ŷ��120      3,380  1      3,380",
				"7*   (��)��������      6,610  1      6,610",
				"8    ���ѱ� �����       2,750  1      2,750",
				"9*   GAP ������ 4     10,800  1     10,800",
				"10   �� ����� �ٳ�     49,800  1     49,800",
				"11   ����ũ ź�θ�       2,480  1      2,480",
				"12   (����)����߰�    102,480  1    102,480",
				"13   DZ�ִϾ�縻3       4,980  1      4,980",
				"14   DZ�ִϾ�縻3       1,500  1      1,500",
				"15   �����̾�������      7,130  1      7,130",
				"16   ����ũ �����       3,980  1      3,980",
				"17*  ���� ���ִ¿�       4,480  1      4,480",
				"18   ���������÷�      4,980  1      4,980",
				"19   ��������(��)      3,210  1      3,210",
				"20   �ɶ�ý� ����       6,950  1      6,950",
				"21   Ǫ���� �̼���       2,980  3      5,960",
				"22   ���Ϸν�������      1,990  1      1,990",
				"23   CJ ����Ĩ 20      1,980  1      1,980",
				"24   ����ũ �����       3,980  1      3,980",
				"25   ����� ���� ��      4,480  1      4,260",
				"26*  1+ ��޶� 10��      3,480  2      6,960",
				"27   ������ݺ�����      7,980  1      7,980",
				"28*  ����(1.8kg/��)      2,780  2      5,560",
				"29   �ҺҰ��(�ż�      10,000  1     10,000",
				"30   ���������ǳ�15      2,680  2      5,360"};
		//�̸�Ʈ ���������� ��µ� ��ǰ �ܰ� ���������� �������

		int[] k05_pricearr = new int[k05_OneRec.length]; // �ܰ��� ������ �迭�� ��ǰ�ǰ�����ŭ �迭�߰�
		int[] k05_amountarr = new int[k05_OneRec.length];// ������ ������ �迭�� ��ǰ�ǰ�����ŭ �迭�߰�
		int[] k05_totalpricearr = new int[k05_OneRec.length];// �� ������ ������ �迭�� ��ǰ�ǰ�����ŭ �迭�߰�


		for (int k05_i = 0; k05_i < k05_OneRec.length; k05_i++) {
			byte[] k05_byte = k05_OneRec[k05_i].getBytes(); // ����Ʈ�� �迭�� �ٲٱ�
			String k05_name = new String(k05_byte,0,19); // ��ǰ�̸��� 0~19����Ʈ�� �ڸ���
			String k05_price = new String(k05_byte,19,11); // �ܰ��� 19~30����Ʈ�� �ڸ���
			String k05_amount = new String(k05_byte,30,3); // ������ 30~33����Ʈ�� �ڸ���
			String k05_totalprice = new String(k05_byte,33,11); // �Ѱ����� 33~44����Ʈ���ڸ���
			String k05_price1 = k05_price.replace(" ", ""); // ������� �������
			k05_price1 = k05_price1.replace(",", ""); //,�� �������
			k05_pricearr[k05_i] = Integer.parseInt(k05_price1); // String���� �ܰ��� ���������� ��ȯ
	
			
			String k05_amount1 = k05_amount.replace(" ", ""); //������� �������
			k05_amount1 = k05_amount1.replace(",", ""); //,�� �������
			k05_amountarr[k05_i] = Integer.parseInt(k05_amount1); // String���� �ܰ��� ���������� ��ȯ
			
			String k05_totalprice1 = k05_totalprice.replace(" ", ""); //������� �������
			k05_totalprice1 = k05_totalprice1.replace(",", ""); //,�� �������
			k05_totalpricearr[k05_i] = Integer.parseInt(k05_totalprice1); // String���� �ܰ��� ���������� ��ȯ
			
			if(k05_totalpricearr[k05_i]!=k05_pricearr[k05_i] * k05_amountarr[k05_i]) {
				// �ܰ� * ���� = �Ѱ����� �����ʴٸ� �Ѱ����� �߸��Ȱ��̹Ƿ� ����
				k05_totalpricearr[k05_i] = k05_pricearr[k05_i] * k05_amountarr[k05_i]; // ���ο� �Ѱ��ݰ��
				String k05_outtotal = String.valueOf(k05_df.format(k05_totalpricearr[k05_i])); //���ο� �Ѱ����� ###,###��������
				k05_outtotal = k05_HanBlankForeword(k05_outtotal, 11); // �Ѱ��ݿ� ������ �߰��ؼ� ����
				String k05_sumAll =  k05_name + k05_price + k05_amount + k05_outtotal;
				//���� �����Ȱ��� �̸� + �ܰ� + ���� + �Ѱ��� ���� ����ó�� ����
				System.out.printf("************************************\n");
				System.out.printf("����[%s]\n",k05_OneRec[k05_i]); // ������ ������ ���
				System.out.printf("����[%s]\n",k05_sumAll); // �����ĸ� ���
				System.out.printf("************************************\n");
				k05_OneRec[k05_i] = k05_sumAll; 
			}
		}
	}

	public static String k05_HanBlankForeword(String k05_a, int k05_b) {
		int k05_blankcnt = k05_b - k05_a.getBytes().length;
		String k05_output = k05_a;
		for (int k05_i = 0; k05_i < k05_blankcnt; k05_i++) {
			k05_output = " " + k05_output; // ������ �տ� �߰��ؼ� ����
		}

		return k05_output;
	}

}
