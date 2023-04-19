package example7;

public class example_7 {

	public static void main(String[] args) {
		int x = 7;
		System.out.println(x);
		x += 3;
		System.out.println(x);
		x -= 3;
		System.out.println(x);
		x *= 3;
		System.out.println(x);
		x /= 3;
		System.out.println(x);
		x &= 3;
		System.out.println(x);
		x = 10;
		System.out.println(x);
		x &=3;
		System.out.println(x);
		x |= 3;
		System.out.println(x);
		x =10;
		System.out.println(x);
		x^=3;
		System.out.println(x);	
		x >>=3;
		System.out.println(x);
		x <<=3;
		System.out.println(x);
		
		
		int a =3;
		int b =3;
		int c =5;
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < c);
		System.out.println(a >= c);
		System.out.println(b >= c);
		
		System.out.println("");
		int i = 10;
		int j = 20;
		System.out.println(i < 5 && j>10);
		System.out.println(i<5 || j>10);
		System.out.println(!(i<5 && j>10));
	}

}
