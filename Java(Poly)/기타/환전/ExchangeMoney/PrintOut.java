package ExchangeMoney;

public class PrintOut {

	protected void InputKorMoneyPrint() {
		System.out.println("환전할 원화를 입력해주세요 : ");
	}

	protected void InputChangeMoneyType() {
		System.out.println("환전할 화폐의 종류를 선택해주세요.");
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. JPY");
	}

	public void ChangeMoneyPrint() {

		CalcMoney cal = new CalcMoney();

		if (cal.getMoneyType() == 1) {
			System.out.println("환전된 금액은 : " + cal.ChangeMoney() + "달러입니다");
			System.out.println("100달러   : " + cal.ChangeMoneyUSD_100() + "장");
			System.out.println("50달러    : " + cal.ChangeMoneyUSD_50() + "장");
			System.out.println("20달러    : " + cal.ChangeMoneyUSD_20() + "장");
			System.out.println("10달러    : " + cal.ChangeMoneyUSD_10() + "장");
			System.out.println("5달러     : " + cal.ChangeMoneyUSD_5() + "장");
			System.out.println("2달러     : " + cal.ChangeMoneyUSD_2() + "장");
			System.out.println("1달러     : " + cal.ChangeMoneyUSD_1() + "장");
		} else if (cal.getMoneyType() == 2) {
			System.out.println("환전된 금액은 : " + cal.ChangeMoney() + "유로입니다");
			System.out.println("100유로   : " + cal.ChangeMoneyEUR_100() + "장");
			System.out.println("50유로    : " + cal.ChangeMoneyEUR_50() + "장");
			System.out.println("20유로    : " + cal.ChangeMoneyEUR_20() + "장");
			System.out.println("10유로    : " + cal.ChangeMoneyEUR_10() + "장");
			System.out.println("5유로     : " + cal.ChangeMoneyEUR_5() + "장");
			System.out.println("2유로     : " + cal.ChangeMoneyEUR_2() + "개");
			System.out.println("1유로     : " + cal.ChangeMoneyEUR_1() + "개");
		} else if (cal.getMoneyType() == 3) {
			System.out.println("환전된 금액은 : " + cal.ChangeMoney() + "엔입니다");
			System.out.println("100엔   : " + cal.ChangeMoneyJPY_100() + "장");
			System.out.println("50엔    : " + cal.ChangeMoneyJPY_50() + "장");
			System.out.println("10엔    : " + cal.ChangeMoneyJPY_10() + "장");
			System.out.println("5엔     : " + cal.ChangeMoneyJPY_5() + "장");
			System.out.println("1엔     : " + cal.ChangeMoneyJPY_1() + "장");
		}

	}

	public void RemainMoneyPrint() {
		CalcMoney cal = new CalcMoney();
		System.out.println("\n환전후 남은돈 : " + cal.RemainMoney() + "원");
		System.out.println("10000원   : " + cal.RemainMoneyType10000() + "장");
		System.out.println("5000원    : " + cal.RemainMoneyType5000() + "장");
		System.out.println("1000원    : " + cal.RemainMoneyType1000() + "장");
		System.out.println("500원     : " + cal.RemainMoneyType500() + "개");
		System.out.println("100원     : " + cal.RemainMoneyType100() + "개");
		System.out.println("50원      : " + cal.RemainMoneyType50() + "개");
		System.out.println("10원      : " + cal.RemainMoneyType10() + "개");
	}

}
