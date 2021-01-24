
public class Operations {

	public static void main(String[] args) {
		double a = 5 / 2;// int/int=int
		double b = 5 / 2.0;// int/double=double
		float z = 5 / 10;// int/int=int
		double r = 99 / 100;// int/int=int
		double k = 5.5 + 10 / 3;// double + int/int

		System.out.println(a);
		System.out.println(b);
		System.out.println(z);
		System.out.println(r);
		System.out.println(k);

		int i = 10 % 3;
		int j = 3 % 10;

		System.out.println(i);
		System.out.println(j);

		// even and odd numbers
		int no = 11;
		if (no % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

		int x = 5;// 5
		int y = x + 1;// 6
		x = x + 1;// 6
		x += 5; // x = x + 5; = 11
		x *= 2;// x = x * 2; = 22
		y = x *= 2;// x = 44, y = 44
		x /= 2;// x = x / 2; = 22
		x %= 2;// x = x % 2; = 0

		System.out.println(x);
		System.out.println(y);

		int v = 5;

		System.out.println(v++);// use v then add 1 to it
		System.out.println(v);// use v
		System.out.println(++v);// add 1 to v then use it
		System.out.println(v);// use v

	}

}
