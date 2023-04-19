package Example01;

public class example01a {

	public static void main(String[] args) {
		k05_HanCal k05_Han = new k05_HanCal();
		System.out.printf("HanBlankForeword [%s]\n",k05_Han.k05_HanBlankForeword("한글abcd",15));
		System.out.printf("HanBlankForeword [%s]\n",k05_Han.k05_HanBlankForeword("한글한글aa",15));
		System.out.printf("HanBlankBackword [%s]\n",k05_Han.k05_HanBlankBackword("한글aa",15));
		System.out.printf("HanBlankBackword [%s]\n",k05_Han.k05_HanBlankBackword("한글한글aa",15));
		System.out.printf("한글은 [%d]개\n", k05_Han.k05_HanCount("한글한글aa"));

	}
}
