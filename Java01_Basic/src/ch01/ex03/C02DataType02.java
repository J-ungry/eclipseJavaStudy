package ch01.ex03;

public class C02DataType02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//정수 타입과 정수형 리터럴
		byte b = -128;
		short s = 32767;
		
		int i1 = 10;
		int i2 = 0B1010; //이진수로 표현 
		int i3 = 012;
		int i4 = 0xA; 
		
		System.out.println(i1);
		System.out.println("10의 2진수 " + i2);
		System.out.println("10의 8진수 " + i3);
		System.out.println("10의 16진수 " +i4);
		
		long l1 = 100;
		long l2 = 2000000000L; //int 범위 초과시 (21억) ,L 필수 !!!
		
		float f = 3.14f;
		double d1 = 3.14D;
		double d2 = 3.14;
		
		System.out.println(f);
		System.out.println(d2);
		
	}

}
