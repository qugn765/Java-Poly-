package Example02;

public class example02a {

	static int k05_iStatic;
	
	public static void k05_add(int k05_i) {
		k05_iStatic++;
		k05_i++;
		System.out.printf("add�޼ҵ忡��->iStatic=[%d]\n", k05_iStatic);
		System.out.printf("add�޼ҵ忡��->i=[%d]\n",k05_i);
	} // add��� 1�� �߰����ִ� �޼ҵ� ���� 
	
	public static int k05_add2(int k05_i) {
		k05_iStatic++;
		k05_i++;
		System.out.printf("add�޼ҵ忡��->iStatic=[%d]\n",k05_iStatic);
		System.out.printf("add�޼ҵ忡��->i=[%d]\n",k05_i);
		return k05_i;
	} //add2��� 1�� �߰����ִ� �޼ҵ� ����
	
	public static void main(String[] args) {
		
		int k05_iMain = 1;
		k05_iStatic = 1;
		System.out.printf("***********************************\n");
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iStatic=[%d]\n",k05_iStatic);
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iMain[%d]\n",k05_iMain);
		System.out.printf("***********************************\n");
		//�ƹ��� �޼ҵ带 ȣ������ �������¿��� ������ ���� ��� 1,1���
		
		k05_add(k05_iMain); //add�޼ҵ带 ȣ��  2,2���
		System.out.printf("***********************************\n");
		System.out.printf("�޼ҵ� addȣ���� ���ο���->iStatic=[%d]\n",k05_iStatic);
		System.out.printf("�޼ҵ� addȣ���� ���ο���->iMain[%d]\n",k05_iMain);
		System.out.printf("***********************************\n");
		//add �޼ҵ带 ȣ������ ��� 2,1��µȴ�
		//public int�� ������k05_iStatic�� 1�߰������� main���� ������iMain�� �߰���������
		
	
		k05_iMain = k05_add2(k05_iMain); //add2 �޼ҵ� ȣ�� 3,2����ϰ� iMain���� +1�ؼ� ��������
		System.out.printf("***********************************\n");
		System.out.printf("�޼ҵ� add2ȣ���� ���ο���->iStatic=[%d]\n",k05_iStatic);
		System.out.printf("�޼ҵ� add2ȣ���� ���ο���->iMain[%d]\n",k05_iMain);
		System.out.printf("***********************************\n");
		//add2 �޼ҵ带 ȣ���� ��� 3,2��� add2�޼ҵ�� iMain���� �������ֱ⶧���� 3,2���
		
	}

}
