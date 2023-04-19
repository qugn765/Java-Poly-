package Example12;

public class example12 {

	public static void main(String[] args) {
		int k05_i = 91234567; // int형 i = 91234567 선언
		float k05_f = (float)k05_i; 
		// int형을 float로 저장 float는 7자리까지표현가능
		int k05_i2 = (int)k05_f; // float인 f를 다시 int로 변환후 i2에 저장 
		
		double k05_d = (double)k05_i; // int형 i를 double형으로 변환후 저장
		int k05_i3 = (int)k05_d; // double 형인 d를 int형으로 변환후 i3에 저장
		
		float k05_f2 = 1.666f; // float 변수 f2 = 1.666 선언
		int k05_i4 = (int)k05_f2; // float형 변수인 f2 1.666을 int형으로 변환후 저장 
		
		System.out.printf("i = %d\n",k05_i); // int형 i를 10진수로 출력
		System.out.printf("f = %f i2 = %d\n", k05_f, k05_i2);
		//float형인 f를 소수점표현으로 int형으로 변환한 i2를 10진수방식으로 출력
		//float형은 7자리까지 밖에 표현이 안되기떄문에 원래값과 다른91234568이 출력된다
		System.out.printf("d = %f i3 = %d\n", k05_d, k05_i3);
		//double형인 d를 소수점표현으로 int형으로 변환한 i3를 10진수방식으로 출력
		//double형은 16자리까지 표현하므로 수의 변화가 없이 그대로 91234567 출력
		System.out.printf("(int)%f(f2) =  %d(i4)\n", k05_f2, k05_i4);
		//float형인 f2를 소수점표현으로 int형으로 변환한 i4를 10진수방식으로 출력
		//1.666을 int형을 변환하였기때문에 i4는 1이 출력된다.
	} 

}
