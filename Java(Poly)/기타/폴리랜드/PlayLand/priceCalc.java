package PlayLand;

public class priceCalc {
	private ConstValueClass constant = new ConstValueClass();
	private PrintClass printout = new PrintClass();
	
	public int calcPriceProcess(int ageGroup, int ticketSelect){
		int price = 0;
		if(ageGroup == 1){
			price = constant.BABY_PRICE;
		} else if (ageGroup == 2){
			if(ticketSelect == 1) price = constant.CHILD_DAY_PRICE;
			else price = constant.CHILD_NIGHT_PRICE;
		} else if (ageGroup == 3){
			if(ticketSelect == 1) price = constant.TEEN_DAY_PRICE;
			else price = constant.TEEN_NIGHT_PRICE;
		 }else if (ageGroup == 4){
			if(ticketSelect == 1) price = constant.ADULT_DAY_PRICE;
			else price = constant.ADULT_NIGHT_PRICE;
		} else if (ageGroup == 5){
			if(ticketSelect == 1) price = constant.OLD_DAY_PRICE;
			else price = constant.OLD_NIGHT_PRICE;
		}
		return price;
	}

	public int calcDiscount(int calcPrice, int discountSelect) {
		float discountPricef = 0;
		if(discountSelect == 1){
			discountPricef = calcPrice;
		} else if (discountSelect == 2){
			discountPricef = calcPrice * constant.DISABLE_DISCOUNT_RATE;
		} else if (discountSelect == 3){
			discountPricef = calcPrice * constant.MERIT_DISCOUNT_RATE;
		} else if (discountSelect == 4){
			discountPricef = calcPrice * constant.MULTICHILD_DISCOUNT_RATE;
		} else if (discountSelect == 5){
			discountPricef = calcPrice * constant.PREGNANT_DISCOUNT_RATE;
		}
		int discountPrice = (int)discountPricef;
		
		return discountPrice;
	}


	public int calcPriceResult(int price, int orderCount){
		int totalPrice = price * orderCount;
		printout.PrintcalcPriceResult(totalPrice);
		
		return totalPrice;
	}
}
