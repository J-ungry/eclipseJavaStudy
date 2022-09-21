package ch01.ex04;

public class C03_Overflow {
	public static void main(String[] args) {
		
		//값 손실 
		int a = 1_000_000;
		int b = 1_000_000;
		long c = a*b; // 1_000_000_000_000 이미 int 에서 범위를 넘어버려서 바꾸는게 의미가 없음 
		System.out.println(c); //-727379968

		c = a*(long)b; //int * long -> long * long
		System.out.println(c);
		
		int x = 1_000_000 * 1_000_000 / 1_000_000;
		System.out.println(x); //값의 변질 발생 
		
		int y = 1_000_000/1_000_000*1_000_000;
		System.out.println(y); //1_000_000
	}
}
