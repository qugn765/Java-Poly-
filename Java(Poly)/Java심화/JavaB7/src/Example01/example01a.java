package Example01;

public class example01a {

	public static void main(String[] args) {
		k05_HanCal k05_Han = new k05_HanCal();
		System.out.printf("HanBlankForeword [%s]\n",k05_Han.k05_HanBlankForeword("�ѱ�abcd",15));
		System.out.printf("HanBlankForeword [%s]\n",k05_Han.k05_HanBlankForeword("�ѱ��ѱ�aa",15));
		System.out.printf("HanBlankBackword [%s]\n",k05_Han.k05_HanBlankBackword("�ѱ�aa",15));
		System.out.printf("HanBlankBackword [%s]\n",k05_Han.k05_HanBlankBackword("�ѱ��ѱ�aa",15));
		System.out.printf("�ѱ��� [%d]��\n", k05_Han.k05_HanCount("�ѱ��ѱ�aa"));

	}
}
