package Example10;

public class example10a {

	public static void main(String[] args) {
		
		k05_Elevater3 k05_elev3;  // ��ü����

		k05_elev3 = new k05_Elevater3(); //��ü����
		for (int k05_i = 0; k05_i <10; k05_i++) {
			k05_elev3.k05_up();
			System.out.printf("MSG elev3[%s]\n", k05_elev3.help);
		} // 10����ŭ k05_up �Լ� ȣ���� help ����ϱ�
		
		for (int k05_i = 0; k05_i <10; k05_i++) {
			k05_elev3.k05_down();
			System.out.printf("MSG elev3[%s]\n", k05_elev3.help);
		}// 10����ŭ k05_down �Լ� ȣ���� help ����ϱ�
		
		k05_elev3.k05_Repair();
		System.out.printf("MSG elev3[%s]\n", k05_elev3.help);
		// Repair �޼ҵ� ȣ���� help����ϱ�
	}
	
}
