package Example08;

public class example08a {
	
	static k05_Elevater2 k05_elev1;
	static k05_Elevater2 k05_elev2;
	static k05_Elevater2 k05_elev3;

	public static void main(String[] args) {
		k05_elev1 = new k05_Elevater2();  // Class���� ������ �ִ� 10�� ���� 1�� ���� 1������ ���������
		k05_elev2 = new k05_Elevater2(20, 1, 8); // �ִ� 20�� ���� 1�� ���� 8������ ��������
		k05_elev3 = new k05_Elevater2(50, -3, 5);// �ִ� 50�� ���� -3�� ���� 5������ ��������
		
		for (int k05_i = 0; k05_i < 20; k05_i++) {
			k05_elev3.k05_up(); k05_elev3.k05_msg("3������ 1���� ������");
		}// elev3�� ���ؼ� up �Լ� 20�������ϰ� msg ����
		System.out.println();
		
		for (int k05_i = 0; k05_i < 20; k05_i++) {
			k05_elev3.k05_up(2); k05_elev3.k05_msg("3������ 2���� ������");
		}// elev3�� ���ؼ� up(2)�Լ�  20�������ϰ� msg ����
		// up() �ȿ� 2�����⋚���� 2���������°ɷ� ����
		System.out.println();
		
		for (int k05_i = 0; k05_i < 20; k05_i++) {
			k05_elev3.k05_down(3); k05_elev3.k05_msg("3������ 3���� ������");
		}// elev3�� ���ؼ� down(3) �Լ� 20�������ϰ� msg ����
		// donw�ȿ� 3�� ���⶧���� 3���� �������°ɷ� ����
		System.out.println();
		

	}

}
