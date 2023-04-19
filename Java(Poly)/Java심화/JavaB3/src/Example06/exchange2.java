package Example06;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class exchange2 {

	public static void main(String[] args) {
		int k05_MyWon = 1000000; // 환전할 금액
		double k05_MoneyEx = 1238.21; // 환율
		double k05_commission = 0.003; //환전수수료

		int k05_usd = (int)(k05_MyWon / k05_MoneyEx); // 100만원을 달러로 환전 정수형으로 소수점 버림
		int k05_remain = (int)(k05_MyWon - k05_usd * k05_MoneyEx); // 달러로 환전하고 남은잔돈(원화)
		System.out.printf("*****************************************************************\n");
		System.out.printf("*                         수수료없이 계산                            *\n");
		System.out.printf("       총 한화 환전금액 : %d원 => 미화 : %d달러, 잔돈 : %d원\n", k05_MyWon, k05_usd, k05_remain); // 총한화, 환전후 미화, 잔돈 출력
		System.out.printf("*****************************************************************\n\n");


		
		double k05_ComPerOne = k05_MoneyEx * k05_commission; // 1달러당 수수료
		double k05_totalcom = k05_usd * k05_ComPerOne; // 총 수수료
		System.out.printf("*****************************************************************\n");
		System.out.printf("*                         수수료포함 계산                             *\n");
		System.out.printf("   총 수수료 : %f원 => 미화 : %d달러, 달러당수수료 : %f원\n", k05_totalcom, k05_usd, k05_ComPerOne); // 총수수료, 환전후 미화, 달러당 수수료 출력
		System.out.printf("*****************************************************************\n\n");


		
		
		int k05_totalcomint; // 총 수수료 정수형으로 선언(올림처리하기위해서)
		if(k05_totalcom != (double)((int)k05_totalcom)) {
			k05_totalcomint = (int)k05_totalcom + 1; // 만약 두개가 같지않다면 뒷자리에 올림할 숫자가있기때문에 +1로 올림처리
		} else {
			k05_totalcomint = (int)k05_totalcom; // 만약 일치한다면 뒷자리에 올림할 숫자가 없는것이므로 +1을 처리하지않고 그냥 선언
		}
		System.out.printf("*****************************************************************\n");
		System.out.printf("*                         수수료적용 환전                            *\n");
		System.out.printf("      총 수수료 : %d원 => 미화 : %d달러, 달러당수수료 : %f원\n", k05_totalcomint, k05_usd, k05_ComPerOne); // 총수수료, 환전후 미화, 달러당 수수료 출력
		
		k05_remain = (int)(k05_MyWon - k05_usd * k05_MoneyEx - k05_totalcomint); // 잔돈은 소숫점이 나올수없으므로 int로 선언하고 원래돈에서 미화환전금액 * 환율을 빼고 총 수수료도 뺀금액이 잔돈
		System.out.printf("  총 한화 환전금액: %d원 => 미화: %d달러, 수수료: %d원 잔돈: %d원\n", k05_MyWon, k05_usd, k05_totalcomint, k05_remain); // 총환전할금액, 환전후 미화, 수수료, 잔돈 출력
		System.out.printf("*****************************************************************\n\n");
	
		
		
		
		k05_usd = (int)(k05_MyWon / (k05_MoneyEx + k05_ComPerOne)); // 달러를 소숫점으로 받을수 없으므로 int로 선언하고 환율에 달러당 수수료를 더해서 1달러당 환율+수수료를 합친금액으로 환전할 미화계산
		k05_totalcom = k05_usd * k05_ComPerOne;  // 총수수료는 환전할 미화에 달러당 수수료를 곱한금액
		
		if (k05_totalcom != (double)((int)k05_totalcom)){
			k05_totalcomint = (int)k05_totalcom + 1; // 만약에 두숫자가 같지않다면 올림할 숫자가 있는것이므로 +1로 올림처리
		} else {
			k05_totalcomint = (int)k05_totalcom; // 만약 두숫자가 같다면 올림할 숫자가 없는것이므로 +1하지않는것
		}
		System.out.printf("*****************************************************************\n");
		System.out.printf("*                     (정확한)수수료적용 환전                          *\n");
		System.out.printf("      총 수수료 : %d원 => 미화 : %d달러, 달러당수수료 : %f원\n", k05_totalcomint, k05_usd, k05_ComPerOne); // 총수수료, 환전할 미화, 달러당 수수료 출력
		
		k05_remain = (int)(k05_MyWon - k05_usd * k05_MoneyEx - k05_totalcomint); // 잔돈은 정수형으로 선언 환전할 원화에서 환전할 미화에 환율을 곱한것을 빼고 총 수수료를 뺀 금액
		System.out.printf("   총 한화 환전금액: %d원 => 미화: %d달러, 수수료: %d원 잔돈: %d원\n", k05_MyWon, k05_usd, k05_totalcomint, k05_remain); // 환전할 금액, 환전할 미화, 총수수료(정수), 잔돈 출력
		System.out.printf("*****************************************************************\n\n");
		
		
		
		
		
		DecimalFormat k05_df = new DecimalFormat( "###,###,###,###,###" ); // 3자리마다 ,를 찍는 DecimalFormat  df를 선언 
		System.out.printf("*****************************************************************\n");
		System.out.printf("*                         콤마찍기, 날짜 적용                         *\n");
		System.out.printf("      총 수수료 : %s원 => 미화 : %s달러, 달러당수수료 : %f원\n", 
				k05_df.format(k05_totalcomint), k05_df.format(k05_usd), k05_ComPerOne); // 총수수료, 환전할 미화를 df.format에 넣어서 3자리마다 ,를 찍어서 출력 
		
		k05_remain = (int)(k05_MyWon - k05_usd * k05_MoneyEx - k05_totalcomint); // 정수형 잔돈계산식  총환전할금액에서 미화 *환율을 빼고 총 정수형 수수료를 뺀금액 
		System.out.printf(" 총 한화 환전금액: %s원 => 미화: %s달러, 수수료: %s원 잔돈: %s원\n", 
				k05_df.format(k05_MyWon), k05_df.format(k05_usd), k05_df.format(k05_totalcomint), k05_df.format(k05_remain));
		// 총환전할금액, 총 환전할 미화, 총 올림처리한 수수료, 잔돈을 df.format에 넣어서 3자리마다 ,를 찍어서 출력
		
		Calendar k05_cald = Calendar.getInstance(); // cald라는 Calendar 함수를 선언
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");  // 연/월/일  시간/분/초 를 출력할수있는 sdt라는 SimpleDateFormat을 선언
		System.out.printf("               최종 실행시간 : %s\n", sdt.format(k05_cald.getTime()));  
		//cald함수에서 getTime()을 통해 현재시간을 받아오고 SimpleDateFormat sdt를 이용해 연/월/일 시간/분/초로 현재시간을 출력
		System.out.printf("*****************************************************************\n");
		

	}

}
