package Example12;

public class k05_Elevater3 extends k05_Elevater2{


	public void k05_Repair() {
		help = String.format("�������Դϴ�");
	} //Repair �޼ҵ� ����
	
	void k05_up() {
		if(k05_floor >= k05_limit_upfloor) {
			help = "������ ���Դϴ�";
		} else {
			k05_floor = k05_floor + 2;
			help = String.format("%d ���Դϴ�", k05_floor);
		}	
		this.k05_down(); // Elevater2���ִ� down�� ȣ���ؼ� 2���ø��� 1���� �����鼭 down���ִ�
		//Ŭ�����ȿ�����ִ� MSG ���
	} // up�� ȣ���ϸ� floor�� +1���ִ� �޼ҵ� ���� �ִ����̶�� ���������Դϴٸ�help�� ����
	
	void k05_down() {
		super.k05_down();
		System.out.printf("Ŭ���� �ȿ��� ����ִ� MSG[%s]\n", this.help);
	} // down�� ȣ���ϸ� floor�� -1���ִ� �޼ҵ� ���� �ִ����̶�� ó�����Դϴٸ�help�� ����


}
