package ExchangeMoney;

public class Exchange {

	public static void main(String[] args) {
		
		CalcMoney calc = new CalcMoney();
		PrintOut printOut = new PrintOut();
		Input numInput = new Input();
		
		int KorMoney = numInput.InputKorMoney(); //돈 잘들어옴
		int MoneyTypeNumebr = numInput.InputMoneyType(); //타입 잘들어옴
		
		calc.setKorMoney(KorMoney);
		calc.setMoneyType(MoneyTypeNumebr);
		
		
		printOut.ChangeMoneyPrint();
		printOut.RemainMoneyPrint();

	}

}
