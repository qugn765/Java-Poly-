package test06;

public class test06a {

	public static void main(String[] args) {
		int n = addToOne(5);
		System.out.println(n);
		int m = MulToOne(5);
		System.out.println(m);
	}

	public static int addToOne(int n) {
		if (n==1) {
			return 1;
		} else {
			return n + addToOne(n-1);
		}
	}

	public static int MulToOne(int n) {
		if (n==1) {
			return 1;
		} else {
			return n * MulToOne(n-1);
		}
	}
}
