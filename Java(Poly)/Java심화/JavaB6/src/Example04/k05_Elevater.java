package Example04;

public class k05_Elevater {
	int k05_limit_upfloor = 10;  //�ֻ��� ��
	int k05_limit_downfloor = 0; //������
	int k05_floor = 1; // ������
	String k05_help; // ���ڿ� ����
	
	void k05_up() // up�̶�� �޼ҵ� ����
	{
		if(k05_floor == k05_limit_upfloor) {
			k05_help = "���������Դϴ�";
		} else {
			k05_floor++;
			k05_help = String.format("%d���Դϴ�", k05_floor);
		}
	} //floor�� ���� ������������ �����Դϴ� ��� �޼����� ����ϸ鼭 floor�� 1���� �÷��ִ� �޼ҵ�
	
	void k05_down()
	{
		if(k05_floor == k05_limit_downfloor) {
			k05_help = "ó�����Դϴ�";
		} else {
			k05_floor--;
			k05_help = String.format("%d���Դϴ�", k05_floor);
		}
	}//floor�� ���� ���������� �����Դϴ� ��� �޼����� ����ϸ鼭 floor�� 1���� �����ִ� �޼ҵ�
}
