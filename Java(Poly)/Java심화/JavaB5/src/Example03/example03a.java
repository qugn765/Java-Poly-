package Example03;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class example03a {

	public static void main(String[] args) {
		Calendar k05_calendar = Calendar.getInstance();
		SimpleDateFormat k05_dt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		
		int k05_price = 321000;
		float k05_taxrate = 0.1f;
		float k05_beforepriced = (k05_price / (1 + k05_taxrate));
		int k05_beforeprice = (int)(k05_beforepriced);
		int k05_tax = k05_price - k05_beforeprice;
		DecimalFormat k05_df = new DecimalFormat("###,###,###,###");
		System.out.printf(" �ſ����\n");
		System.out.printf("�ܸ��� : 2N68665898    ��ǥ��ȣ : 041218\n"); // 19ĭ
		System.out.printf("������ : �Ѿ��ġ�\n");
		System.out.printf("��  �� : ��� ������ �д籸 Ȳ�����\n");
		System.out.printf("351���� 10 , 1��\n");
		System.out.printf("��ǥ�� : ��â��\n");
		System.out.printf("����� : 752-53-00558       TEL : 7055695\n");  //�����(21ĭ)  TEL(13ĭ) 
		System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n"); // 36ĭ
		System.out.printf("%s%32s ��\n","��  ��", k05_df.format(k05_beforeprice));
		System.out.printf("%s%32s ��\n","�ΰ���", k05_df.format(k05_tax));
		System.out.printf("%s%32s ��\n","��  ��", k05_df.format(k05_price));
		System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n"); // 36ĭ
		System.out.printf(" �츮ī��\n");
		System.out.printf("ī���ȣ : 5387-20**-****-4613(s)  �Ͻú�\n");
		System.out.printf("%-32s\n","�ŷ��Ͻ� : " + k05_dt.format(k05_calendar.getTime()));
		System.out.printf("���ι�ȣ : 70404427\n");
		System.out.printf("�ŷ���ȣ : 357734873739\n");
		System.out.printf("���� : ��ī���   ���� : 720068568\n");
		System.out.printf("�˸� : EDC����ǥ\n");
		System.out.printf("���� : TEL)1544-4700\n");
		System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n"); // 36ĭ
		System.out.printf("            * �����մϴ� *\n");
		System.out.printf("                       ǥ��V2.08_20200212");
	
	}
}
