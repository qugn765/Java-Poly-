package Example02;

public class example02a {

	public static void main(String[] args) {
		int k05_WeekDay = 5; // �Ŵ� ������ ������ �����ϴ� ���� ����
		int[] k05_MonEnd = {31,28,31,30,31,30,31,31,30,31,30,31};  // 1�� ~ 12������ ���������� �迭�� ����
		int k05_inputyear = 2021;
		
		int k05_ydflag = k05_inputyear % 4;
		if (k05_ydflag == 0) {
			k05_MonEnd[1] = 29;
		} else {
			k05_MonEnd[1] = 28;
		} 
		
		for (int k05_Mon = 0; k05_Mon < 12; k05_Mon++) {
			k05_WeekDay = k05_WeekDay % 7; // 1���� ������ WeekDay�� 7�� ������ �������� ������ ������ �ٽ� ����
			System.out.printf("\n\n        %d��\n", k05_Mon + 1); // ������� ���
			System.out.printf("======================\n");
			System.out.printf("%s%s%s%s%s%s%s\n"," ��"," ��"," ȭ"," ��"," ��"," ��"," ��"); //�������
			
			for (int k05_DayCal = 0; k05_DayCal < k05_WeekDay; k05_DayCal++) {
				System.out.printf("   ");
			} // �������Ͽ� �����ϴ����� ���� ������ �̿��� 1���� �����ϴ� ���Ͽ� ���߱�
			
			for (int k05_Day = 1; k05_Day <= k05_MonEnd[k05_Mon]; k05_Day++) {
				if (k05_WeekDay % 7 == 0 && k05_WeekDay != 0) System.out.printf("\n"); // WeekDay�� 7�̵ɶ����� ���ְ� ������ ������ �ٳ���
				System.out.printf(" %2.2s", k05_Day); // 1,2,3,4 �ϼ� ���
				k05_WeekDay++; // �ϼ��� �þ������ ���ϵ� ���̴þ�� ������ ++�� ����ó��
			}			
		}

	}

}
