package ch01.ex04;

public class C01Casting {

	public static void main(String[] args) {
		
		//정수타입 크기 : byte < short < int < long
		//promotion : 작은 타입에서 큰 타입으로 데이터타입을 변환 (자동 타입 변환) 
		
		byte b = 10;
		short s = b ;
		int i = s;
		long l = i;
		System.out.println(l);
		
		//demotion : 큰 타입에서 작은 타입으로 데이터 타입을 명시해서 변환 (강제 타입 변환) 
		l = 200;
		i = (int)l;
		s = (short)i;
		b = (byte)s;
		System.out.println(b); //-56 (값의 변질 )
	}

}
