package Example10;

public class k05_Elevater2 {
	public int k05_limit_upfloor; // �ִ���
	public int k05_limit_downfloor; // ������
	public int k05_floor; // ������
	public String help;
	
	k05_Elevater2(){
		k05_limit_upfloor = 10;
		k05_limit_downfloor = 1;
		k05_floor = 1;
		help = "���������� �⺻ �ذ� �Ϸ�";
		System.out.printf("%s\n",help);
	} // ������ �� ����
	
	k05_Elevater2(int up_floor, int d_floor, int in_floor){
		k05_limit_upfloor = up_floor;
		k05_limit_downfloor = d_floor;
		k05_floor = in_floor;
		help = "���������� ���� �ذ� �Ϸ�";
	} // Elevater�޼ҵ忡 ������ �޾� �ִ�,����,�������� �Է¹޾Ƽ� ����
	
	void k05_up() {
		if(k05_floor == k05_limit_upfloor) {
			help = "������ ���Դϴ�";
		} else {
			k05_floor++;
			help = String.format("%d ���Դϴ�", k05_floor);
		}
	} // up�� ȣ���ϸ� floor�� +1���ִ� �޼ҵ� ���� �ִ����̶�� ���������Դϴٸ�help�� ����
	
	void k05_down() {
		if(k05_floor == k05_limit_downfloor) {
			help = "ó�� ���Դϴ�";
		} else {
			k05_floor--;
			help = String.format("[%d] ���Դϴ�", k05_floor);
		}
	} // down�� ȣ���ϸ� floor�� -1���ִ� �޼ҵ� ���� �ִ����̶�� ó�����Դϴٸ�help�� ����
	
	void k05_up(int k05_u) {
		for(int k05_i = 0; k05_i < k05_u; k05_i++) this.k05_up();
	} // �Է¹��� ������ŭ up�޼ҵ� ȣ��
	
	void k05_down(int k05_u) {
		for(int k05_i = 0; k05_i < k05_u; k05_i++) k05_down();
	} // �Է¹��� ������ŭ down�޼ҵ� ȣ��
	
	void k05_msg(String k05_id) {
		System.out.printf("%s => [%s] �ִ���[%d] �ּ���[%d] ������[%d]\n", 
				k05_id, help, k05_limit_upfloor, k05_limit_downfloor, k05_floor);
	} // msg�Լ����� ����� �޼��� �ִ��� �ּ��� ������ ���
	
}
