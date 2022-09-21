package ch03.ex02;

public class C02Logical {

	public static void main(String[] args) {

		//논리연산자
		//AND &&
		//or ||
		int a = 10;
		int b = 5;
		
		//AND
		System.out.println(a==a && b==b);
		System.out.println(a!=a && b==b);
		System.out.println(a==a && b!=b);
		System.out.println(a!=a && b!=b);
		
		//OR
		System.out.println(a==a || b==b);
		System.out.println(a!=a || b==b);
		System.out.println(a==a || b!=b);
		System.out.println(a!=a || b!=b);
		
		boolean d = false;
		d = true && true; // true
		
		System.out.println(d);
		
	}

}
