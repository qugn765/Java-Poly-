package Example04;

public class example04a {
	
	private static int k05_inVal;
	
	public static void k05_up() {
		k05_inVal++;
		System.out.printf("�� �׳� �޼ҵ�[%d]\n",k05_inVal);
	}

	public static void main(String[] args) {
		k05_inVal = 0;
		k05_Elevater k05_elev; // Class�� �޾Ƽ� ��ü�����
		
		k05_elev = new k05_Elevater(); // �ν��Ͻ��� �����Ͽ� ��ü�� ����
		
		k05_up(); // example04a���� ������ k05_upȣ��
		
		for (int k05_i = 0; k05_i < 10; k05_i++) {
			k05_elev.k05_up();
			System.out.printf("Message[%s]\n", k05_elev.k05_help);
		} // Elevater Class�� up �޼ҵ� ���
		
		for (int k05_i = 0; k05_i < 10; k05_i++) {
			k05_elev.k05_down();
			System.out.printf("Message[%s]\n", k05_elev.k05_help);
		} // Elevater Class�� down �޼ҵ� ���
	}
}
