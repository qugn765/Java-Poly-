package ExchangeMoney;

public class CalcMoney {

	private	int KorMoney;
	private int MoneyType;

	public int getKorMoney() {
		return KorMoney;
	}

	public void setKorMoney(int korMoney) {
		KorMoney = korMoney;
		System.out.println("돈 저장 : " + KorMoney);
	}

	public int getMoneyType() {
		System.out.println("get MoneyType" + MoneyType);
		return MoneyType;
	}

	public void setMoneyType(int moneyType) {
		MoneyType = moneyType;
		System.out.println("set MoneyType : " + MoneyType);
	}

	
	public int ChangeMoney() {
		
		CalcMoney cal = new CalcMoney();
	
		System.out.println("돈 오니? : " + cal.getKorMoney());
		System.out.println("타입 오니? : " + cal.getMoneyType());

		int ExchangeMoney = 0;
		if (cal.getMoneyType() == ConstValueClass.CHANGE_TYPE_USD) {
			ExchangeMoney = (int) ((float) cal.getKorMoney() / ConstValueClass.EX_USD);
		} else if (cal.getMoneyType() == ConstValueClass.CHANGE_TYPE_EUR) {
			ExchangeMoney = (int) ((float) cal.getKorMoney() / ConstValueClass.EX_EUR);
		} else if (cal.getMoneyType() == ConstValueClass.CHANGE_TYPE_JPY) {
			ExchangeMoney = (int) ((float) cal.getKorMoney() / ConstValueClass.EX_JPY);
		}

		return ExchangeMoney;
	}

	public int RemainMoney() {
		int RemainMoney = 0;
		if (MoneyType == ConstValueClass.CHANGE_TYPE_USD) {
			RemainMoney = (int) ((float) KorMoney - (float) ChangeMoney() * ConstValueClass.EX_USD);
		} else if (MoneyType == ConstValueClass.CHANGE_TYPE_EUR) {
			RemainMoney = (int) ((float) KorMoney - (float) ChangeMoney() * ConstValueClass.EX_EUR);
		} else if (MoneyType == ConstValueClass.CHANGE_TYPE_JPY) {
			RemainMoney = (int) ((float) KorMoney - (float) ChangeMoney() * ConstValueClass.EX_JPY);
		}
		RemainMoney = (RemainMoney / 10) * 10;

		return RemainMoney;
	}

//달러 계산
	public int ChangeMoneyUSD_100() {
		int USD_100 = ChangeMoney() / 100;
		return USD_100;
	}

	public int ChangeMoneyUSD_50() {
		int USD_50 = (ChangeMoney() % 100) / 50;
		return USD_50;
	}

	public int ChangeMoneyUSD_20() {
		int USD_20 = (ChangeMoney() % 50) / 20;
		return USD_20;
	}

	public int ChangeMoneyUSD_10() {
		int USD_10 = (ChangeMoney() % 20) / 10;
		return USD_10;
	}

	public int ChangeMoneyUSD_5() {
		int USD_5 = (ChangeMoney() % 10) / 5;
		return USD_5;
	}

	public int ChangeMoneyUSD_2() {
		int USD_2 = (ChangeMoney() % 5) / 2;
		return USD_2;
	}

	public int ChangeMoneyUSD_1() {
		int USD_1 = (ChangeMoney() % 2) / 1;
		return USD_1;
	}

// 유로 계산
	public int ChangeMoneyEUR_100() {
		int EUR_100 = ChangeMoney() / 100;
		return EUR_100;
	}

	public int ChangeMoneyEUR_50() {
		int EUR_50 = (ChangeMoney() % 100) / 50;
		return EUR_50;
	}

	public int ChangeMoneyEUR_20() {
		int EUR_20 = (ChangeMoney() % 50) / 20;
		return EUR_20;
	}

	public int ChangeMoneyEUR_10() {
		int EUR_10 = (ChangeMoney() % 20) / 10;
		return EUR_10;
	}

	public int ChangeMoneyEUR_5() {
		int EUR_5 = (ChangeMoney() % 10) / 5;
		return EUR_5;
	}

	public int ChangeMoneyEUR_2() {
		int EUR_2 = (ChangeMoney() % 5) / 2;
		return EUR_2;
	}

	public int ChangeMoneyEUR_1() {
		int EUR_1 = (ChangeMoney() % 2) / 1;
		return EUR_1;
	}

//엔화 계산
	public int ChangeMoneyJPY_100() {
		int JPY_100 = ChangeMoney() / 100;
		return JPY_100;
	}

	public int ChangeMoneyJPY_50() {
		int JPY_50 = (ChangeMoney() % 100) / 50;
		return JPY_50;
	}

	public int ChangeMoneyJPY_10() {
		int JPY_10 = (ChangeMoney() % 50) / 10;
		return JPY_10;
	}

	public int ChangeMoneyJPY_5() {
		int JPY_5 = (ChangeMoney() % 10) / 5;
		return JPY_5;
	}

	public int ChangeMoneyJPY_1() {
		int JPY_1 = (ChangeMoney() % 5) / 1;
		return JPY_1;
	}

// 원화 계산
	public int RemainMoneyType10000() {
		int Kor10000 = RemainMoney() / 10000;
		return Kor10000;
	}

	public int RemainMoneyType5000() {
		int Kor5000 = (RemainMoney() % 10000) / 5000;
		return Kor5000;
	}

	public int RemainMoneyType1000() {
		int Kor1000 = (RemainMoney() % 5000) / 1000;
		return Kor1000;
	}

	public int RemainMoneyType500() {
		int Kor500 = (RemainMoney() % 1000) / 500;
		return Kor500;
	}

	public int RemainMoneyType100() {
		int Kor100 = (RemainMoney() % 500) / 100;
		return Kor100;
	}

	public int RemainMoneyType50() {
		int Kor50 = (RemainMoney() % 100) / 50;
		return Kor50;
	}

	public int RemainMoneyType10() {
		int Kor10 = (RemainMoney() % 50) / 10;
		return Kor10;
	}

}
