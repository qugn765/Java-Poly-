package Example07;

public class example07a {

	public static void main(String[] args) {
		int iPerson = 5;
		k05_OneRec[] k05_inData = new k05_OneRec[iPerson];
		
		
		k05_inData[0] = new k05_OneRec("홍길01",100,100,90); // 홍길01 100 100 90을 배열0번에저장
		k05_inData[1] = new k05_OneRec("홍길02",90,90,90); // 배열1번에 저장
		k05_inData[2] = new k05_OneRec("홍길03",80,70,90); // 배열2번에 저장
		k05_inData[3] = new k05_OneRec("홍길04",70,60,90); // 배열3번에 저장
		k05_inData[4] = new k05_OneRec("홍길05",60,100,90); //배열4번에 저장
		for(int k05_i = 0; k05_i < k05_inData.length; k05_i++) {
			System.out.printf("이름: %s,  kor: %s,  eng: %s,  math:%s\n",
					k05_inData[k05_i].k05_name(),k05_inData[k05_i].k05_kor(),
					k05_inData[k05_i].k05_eng(),k05_inData[k05_i].k05_math());
		} // inData 배열에 저장한 이름 kor eng math 값을 출력
		

		

	}

}
