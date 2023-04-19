package Example08;

public class example08 {

	public static void main(String[] args) {
		// short 형 범위 -32768~32767
		// char형 범위 0~65535
		short k05_sMin = -32768; // short 형으로 sMin -32768 선언
		short k05_sMax = 32767;// short 형으로 sMin 32767 선언
		char k05_cMin = 0;  // char 형으로 cMin 0 선언
		char k05_cMax = 65535; // char 형으로 cMax 65535 선언
		
		System.out.println("sMin = " + k05_sMin); // sMin 출력 그대로 -32768
		System.out.println("sMin - 1 = " + (short)(k05_sMin-1)); 
		// sMin 출력 short 범위는 -32768까지므로 -1하면 32767로 바뀜
		System.out.println("sMax = " + k05_sMax); // sMax 그대로 출력
		System.out.println("sMax + 1 = " + (short)(k05_sMax+1));
		// sMax 출력 short 범위는 32767까지 이므로 +1 하면 -32768로 바뀜
		System.out.println("cMin = " + (int)k05_cMin); // cMin 정수형으로 바꿔서 출력 그대로 0 출력
		System.out.println("cMin - 1  = " + (int)--k05_cMin);
		// --cMin 정수형으로 출력 short --cMin은 char형이므로 0에서 -1하면 65535로 바뀌고 int형 65535출력
		System.out.println("cMax = " + (int)k05_cMax); // cMax 정수형으로 바꿔서 출력 그대로 65535 출력
		System.out.println("cMax + 1 = " +(int)++k05_cMax);
		// ++cMax 정수형으로 출력 short ++cMax는 char형이므로 65535 다음은 0이기떄문에 0을 정수형으로 출력
		

	}

}
