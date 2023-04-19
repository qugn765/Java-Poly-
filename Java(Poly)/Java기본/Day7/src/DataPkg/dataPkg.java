package DataPkg;

public class dataPkg {

	public static void main(String[] args) {
		/*		String companyNumber1 = "19001";
		String companyNumber2 = "19001";
		String companyNumber3 = "19001";
		String[] companyNumbers = new String[3];
		companyNumbers[0] = "19001";
		companyNumbers[1] = "20002";
		companyNumbers[2] = "20003";
		for (int i = 0; i < companyNumbers.length; i++) {
			System.out.println(companyNumbers[i]);
		}
		 */

		boolean[] checkDuplicated= new boolean[45];


		int cnt = 0;
		while (cnt < 6) {
			int num = getRandomNumber();
			if(checkDuplicated[num-1] == true) {
				continue;
			} else {
				checkDuplicated[num - 1] = true;
				System.out.println(num);
				cnt++;
			}
		}
	}

	public static int getRandomNumber() {
		int ret = 0;
		while (true) {	
			ret = (int)(Math.random() * 45);
			if (ret > 0 && ret <=45) {
				break;
			}
		}
		return ret;

	}
}
