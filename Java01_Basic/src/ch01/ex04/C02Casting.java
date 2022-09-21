package ch01.ex04;

public class C02Casting {

	public static void main(String[] args) {
		
		int a = 100;
		
		//자동 타입 변환 
		
		double b = a;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		a = (int)b;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		//값 변질
		double c = 1.234;
		int d = (int)c;
		
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		
		int num = 10 / 3;
		System.out.println("num : " + num); //3
		
		double num2 = 10 / 3;
		System.out.println("num2 : "+ num2); //3.0
		
		double num3 = 10.0 / 3;
		System.out.println("num3 : " + num3); //double / int -> double 더 큰 쪽으로 변환됨 
		
	}

}
