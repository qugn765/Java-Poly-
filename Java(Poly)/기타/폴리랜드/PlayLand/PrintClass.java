package PlayLand;

import java.util.Scanner;

public class PrintClass {
	private Scanner scanner = new Scanner(System.in);
	
	public void PrintinputTicketSelect(){
		System.out.println("권종을 선택하세요.");
		System.out.println("1. 주간권");
		System.out.println("2. 야간권");
	}
	
	public void PrintinputCustomerIDNumber(){
		System.out.println("주민번호를 입력하세요.");
		System.out.println("-를 제외한 13자리를 입력해주세요.");
	}
	
	public void PrintinputOrderCount(){
		System.out.println("몇개를 주문하시겠습니까? (최대10개)");
	}
	
	public void PrintinputDiscountSelect(){
		System.out.println("우대사항을 선택하세요.");
		System.out.println("1. 없음 (나이 우대는 자동처리)");
		System.out.println("2. 장애인");
		System.out.println("3. 국가유공자");
		System.out.println("4. 다자녀"); 
		System.out.println("5. 임산부");
	}
	
	public void PrintError() {
		System.out.println("\n잘못 입력하였습니다.");
		System.out.println("다시 입력해주세요.\n");

	}
	
	public void PrintcalcPriceResult(int totalPrice){
		System.out.println("가격은 "+  totalPrice + "원 입니다.");
		System.out.println("감사합니다.\n");
	}
	
	
	public int printContinue(){
		System.out.println("계속 발권하시겠습니까?");
		System.out.println("1. 티켓 발권");
		System.out.println("2. 종료");
		int cNumber = scanner.nextInt();
		return cNumber;
	}
	
	
	public void orderPrint(){
		InputClass ls = new InputClass();
		System.out.println("\n티켓 발권을 종료합니다. 감사합니다.\n\n");
		System.out.println("========================폴리 랜드=========================\n");
		for(OrderList order : ls.data){
			if(order.getTicketSelect() == 1) {
				if(order.getAgeGroup() == 1) {
					System.out.printf("주간권 유아   x %d\t %d원\t", order.getOrderCount(), order.getTotalPrice());
				} else if (order.getAgeGroup() == 2) {
					System.out.printf("주간권 소인   x %d\t %d원\t", order.getOrderCount(), order.getTotalPrice());
				} else if (order.getAgeGroup() == 3) {
					System.out.printf("주간권 청소년 x %d\t %d원\t", order.getOrderCount(), order.getTotalPrice());
				} else if (order.getAgeGroup() == 4) {
					System.out.printf("주간권 대인   x %d\t %d원\t", order.getOrderCount(), order.getTotalPrice());
				} else if (order.getAgeGroup() == 5) {
					System.out.printf("주간권 경로   x %d\t %d원\t", order.getOrderCount(), order.getTotalPrice());
				} 
			} else {
				if(order.getAgeGroup() == 1) {
					System.out.printf("야간권 유아   x %d\t %d원\t", order.getOrderCount(), order.getTotalPrice());
				} else if (order.getAgeGroup() == 2) {
					System.out.printf("야간권 소인   x %d\t %d원\t", order.getOrderCount(), order.getTotalPrice());
				} else if (order.getAgeGroup() == 3) {
					System.out.printf("야간권 청소년 x %d\t %d원\t", order.getOrderCount(), order.getTotalPrice());
				} else if (order.getAgeGroup() == 4) {
					System.out.printf("야간권 대인   x %d\t %d원\t", order.getOrderCount(), order.getTotalPrice());
				} else if (order.getAgeGroup() == 5) {
					System.out.printf("야간권 경로   x %d\t %d원\t", order.getOrderCount(), order.getTotalPrice());
				} 
			}
			String gender = order.getCustomerIDNumber().substring(7,8);
			if(gender.equals("1") || gender.equals("3") || gender.equals("5") || gender.equals("7")) {
				System.out.print("남성\t");
			} else {
				System.out.print("여성\t");
			}
			if(order.getDiscountSelect() == 1) System.out.println("* 우대적용 없음");
			else if (order.getDiscountSelect() == 2) System.out.println("* 장애인 우대적용");
			else if (order.getDiscountSelect() == 3) System.out.println("* 국가유공자 우대적용");
			else if (order.getDiscountSelect() == 4) System.out.println("* 다자녀 우대적용");
			else if (order.getDiscountSelect() == 5) System.out.println("* 임산부 우대적용"); 
		}
		
	}
}
