package Example01;

public class k05_HanCal {

	public static String k05_HanBlankForeword(String k05_a, int k05_b) {
		int k05_blankcnt = k05_b - k05_a.getBytes().length; // �ѹ���Ʈ ���� �Է¹��� ���ڿ��� ����Ʈ���� ����Ͽ� ������
		String k05_output = k05_a;
		for (int k05_i = 0; k05_i < k05_blankcnt; k05_i++) {
			k05_output = " " + k05_output; // �� ����Ʈ���̸�ŭ ���ʿ� �����߰�
		}
	
		return k05_output;
	}

	public static String k05_HanBlankBackword(String k05_a, int k05_b) {
		int k05_blankcnt = k05_b - k05_a.getBytes().length;// �ѹ���Ʈ ���� �Է¹��� ���ڿ��� ����Ʈ���� ����Ͽ� ������
		String k05_output = k05_a;
		for (int k05_i = 0; k05_i < k05_blankcnt; k05_i++) {
			k05_output =  k05_output +  " ";// �� ����Ʈ���̸�ŭ ���ʿ� �����߰�
	}	
		return k05_output;	

	}

	public static int k05_HanCount(String k05_a) {
		int sum = 0;  // �ѱ��϶� ������ ���� ����
		for (int i = 0; i < k05_a.length(); i++) {			
			//for���� ���ڼ���ŭ ������.
			String a = String.valueOf(k05_a.charAt(i));
			if(a.getBytes().length == 2) {
				sum++;			
			}
		}
		return sum; //����� ����
	}	
}



