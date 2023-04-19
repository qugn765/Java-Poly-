//제출안해도됨. 그냥연습 







package Example05;

public class exchange {

	public static void main(String[] args) {
		double k05_beforeOne = 1000000; // 100만원 환전전 금액
		double k05_afterDollar = 0; // 환전후 금액 선언
		double k05_afterOne = 0;
		
		k05_afterDollar = (k05_beforeOne / 1238.21) * 0.997; // 환율과 수수료계산
		System.out.println("환전했을 때 금액 : " + k05_afterDollar); // 환전했을때 금액
		
		k05_afterDollar = (int)k05_afterDollar;
		System.out.println("받아야 하는 달러 : " + k05_afterDollar); // 받아야할 달러
		
		k05_afterOne = k05_beforeOne - (k05_afterDollar * 1238.21 * 1000 / 997);
		// 받아야할 원화 잔돈
		k05_afterOne = (int)k05_afterOne; // 소수점은 받을 수 없으므로 정수형으로 변환
		System.out.println("받아야 하는 원화 잔돈(1원단위) : " +k05_afterOne); // 받아야할 잔돈 (1원단위)
		
		int k05_afterOne10 = ((int)k05_afterOne / 10) * 10; // 10원이하 버림
		System.out.println("받아야 하는 원화 잔돈 : " + k05_afterOne10); 
		// 10원단위이하 버림하고 받아야할 잔돈
		
		
		
	}

}
